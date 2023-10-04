package Week04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassListener extends JFrame{
	
	public InnerClassListener() {
		// 프레임 설정
		setTitle("Action 이벤트 리스너 예제_Inner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 컨텐트팬 생성 및 설정
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 컴포넌트 생성
		JButton btn = new JButton("Action");
		
		// Action 리스너 달기
		btn.addActionListener(new MyActionListner());
		
		// 생성한 컴포넌트를 컨텐츠팬에 달기 
		c.add(btn);
		
		// 프레임 크기 및 보이기
		setSize(350, 150);
		setVisible(true);
	}
	
	public class MyActionListner implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// 이벤트를 발생시킨 컴포넌트를 알아내기 위해서 getSource() 메서드 사용
			JButton b = (JButton)e.getSource();	
			
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			
			// InnerClassListener.this.setTitle(b.getText()
			setTitle(b.getText());	// 프레임 타이틀에 버튼 문자열을 출력한다. 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnerClassListener();
	}

}
