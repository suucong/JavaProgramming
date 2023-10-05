package Week05;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Prac03 extends JFrame {

	private JLabel keyMessage = new JLabel("HELLO");
	Container c;
	int X, Y;
	
	public Prac03() {
		setTitle("Prac03");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		
		X = 50;
		Y = 50;
		
		keyMessage.setSize(50, 20);
		keyMessage.setLocation(X, Y);
		c.add(keyMessage);
		
		setSize(350, 150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			if (keyCode == KeyEvent.VK_UP) {
				Y -= 10;
			} else if (keyCode == KeyEvent.VK_DOWN) {
				Y += 10;
			} else if (keyCode == KeyEvent.VK_LEFT) {
				X -= 10;
			} else if(keyCode == KeyEvent.VK_RIGHT) {
				X += 10;
			}
			
			if(X < 0) 
				X = 0;
			if(Y < 0)
				Y = 0;
			
			keyMessage.setLocation(X, Y);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Prac03();
	}
}
