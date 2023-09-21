package Week03;

import java.awt.*;
import javax.swing.*;

public class NullContainerEx extends JFrame {
	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(400, 50);
		la.setSize(200, 10);
		c.add(la);
		
		for(int i = 0; i <= 9; i++) {
			JButton b = new JButton(Integer.toString(i)); 	// 버튼 생성
			b.setLocation(i*50, i*20);
			b.setSize(50, 20);
			c.add(b);	// 버튼을 컨텐트팬에 부착
		}
		
		setSize(600, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		NullContainerEx nullContainer = new NullContainerEx();
	}
}
