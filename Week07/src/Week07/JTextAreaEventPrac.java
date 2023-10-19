package Week07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;	

public class JTextAreaEventPrac extends JFrame {
	private JTextField tField = new JTextField(20);
	private JTextArea tArea = new JTextArea(7, 20);
	
	public JTextAreaEventPrac() {
		setTitle("텍스트영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("입력 후 <Enter>키를 입력하세요"));
		c.add(tField);
		c.add(new JScrollPane(tArea));
		
		tField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				String str = t.getText()+"\n";
				tArea.append(str);
				
				tField.setText("");
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTextAreaEventPrac();

	}

}
