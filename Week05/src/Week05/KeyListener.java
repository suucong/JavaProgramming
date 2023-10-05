package Week05;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyListener extends JFrame {
	
	private JLabel[] keyMessage;
	
	public KeyListener() {
		setTitle("KeyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());

		keyMessage = new JLabel[3];
		keyMessage[0] = new JLabel(" getKeyCode() ");
		keyMessage[1] = new JLabel(" getKeyChar() ");
		keyMessage[2] = new JLabel(" getKeyText() ");
		
		for (int i = 0; i < keyMessage.length; i++) {
			c.add(keyMessage[i]);
		}
		
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
			
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(keyText);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyListener();
	}

}
