package Week05;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Prac02 extends JFrame {
	
	private JLabel keyMessage = new JLabel("");
	Container c;
	
	public Prac02() {
		setTitle("Prac02");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		c.add(keyMessage);
		
		setSize(350, 150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			String keyText = KeyEvent.getKeyText(keyCode);
			
			if(keyCode == 112) {
				c.setBackground(Color.GREEN);
				keyMessage.setText(keyText);
			} else if(Character.toString(keyChar).equals("5")) {
				c.setBackground(Color.YELLOW);
				keyMessage.setText(keyText);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Prac02();
	}

}
