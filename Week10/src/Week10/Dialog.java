package Week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dialog extends JFrame{
	private MyDialog dialog;
	 
	public Dialog() {
		super("Dialog 예제 프레임");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(null);
		
		dialog = new MyDialog(this, "Test Dialog");	// 버튼에 액션 이벤트 리스너를 달기
		
		JButton btn = new JButton("Show Dialog");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 모달 다이얼로그로 생성됐기 때문에, 다이얼로그가 닫힐 때까지 리턴하지 않고 
				dialog.setVisible(true);
				// 다이얼로그가 닫히면 실행됨
				String text = dialog.getInput();
				if(text == null) 
					return;
				btn.setText(text);
			}
		});
		
		btn.setBounds(60, 50, 120, 20);
		getContentPane().add(btn);
		setSize(250, 200);
		setVisible(true);
	}
	
	class MyDialog extends JDialog {
		private JTextField tf = new JTextField(10);
		private JButton okButton = new JButton("OK");
		
		public MyDialog(JFrame frame, String title) {
			super(frame, title, true);	// 모달 다이얼로그로 생성
			setLayout(new FlowLayout());
			add(tf);
			add(okButton);
			setSize(200, 100);
			
			okButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					setVisible(false);
				}
			});
		}
		
		public String getInput() {
			if(tf.getText().length()==0)
				return null;
			else
				return tf.getText();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Dialog();
	}

}
