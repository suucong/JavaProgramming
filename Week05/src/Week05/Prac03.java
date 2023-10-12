package Week05;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Prac03 extends JFrame {

	private JLabel keyMessage = new JLabel("HELLO");
	Container c;
	private int p_X, p_Y;
	
	public Prac03() {
		setTitle("Prac03");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		
		p_X = 50;
		p_Y = 50;
		
		keyMessage.setSize(50, 20);
		keyMessage.setLocation(p_X, p_Y);
		c.add(keyMessage);
		
		setSize(350, 150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			if (keyCode == KeyEvent.VK_UP) {
				p_Y -= 10;
			} else if (keyCode == KeyEvent.VK_DOWN) {
				p_Y += 10;
			} else if (keyCode == KeyEvent.VK_LEFT) {
				p_X -= 10;
			} else if(keyCode == KeyEvent.VK_RIGHT) {
				p_X += 10;
			}
			
			if(p_X < 0) 
				p_X = 0;
			if(p_Y < 0)
				p_Y = 0;
			
			keyMessage.setLocation(p_X, p_Y);
		}
	}
	
	public static void main(String[] args) {
		
		new Prac03();
	}
}
