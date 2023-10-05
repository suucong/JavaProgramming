package Week04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Prac01 extends JFrame {
	
	private JLabel text = new JLabel("hello");
	
	public Prac01() {
		setTitle("실습예제01");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.addMouseListener(new MyMouseListener());
		
		text.setSize(50, 20);
		text.setLocation(30, 30);
		c.add(text);
		
		setSize(500, 500);
		setVisible(true);
	} 
	
	public class MyMouseListener implements MouseListener {
		int X;
		int Y;
		
		// 이벤트 소스는 컨텐트 팬.
		public void mousePressed(MouseEvent e) {
			X = e.getX();
			Y = e.getY();
			
			text.setLocation(X,Y);
		}
	
		public void mouseClicked(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Prac01();
	}

}
