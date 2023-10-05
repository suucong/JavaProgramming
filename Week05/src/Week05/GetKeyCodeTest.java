package Week05;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GetKeyCodeTest extends JFrame{
	public JLabel result1=new JLabel("here!!");

	
	public GetKeyCodeTest() {
		setTitle("GetKeyCodeTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(result1);
		
		
		result1.addKeyListener(new MyKeyListener()); 
	
		
		setSize(350, 150);
		setVisible(true);
		result1.setFocusable(true);
		result1.requestFocus();
		
	}
	
	public class MyKeyListener extends KeyAdapter {
//		public void keyTyped(KeyEvent e) {
//			char keychar=e.getKeyChar();
//			int keycode=e.getKeyCode();
//			result1.setText(keychar+"  "+Integer.toString(keycode));
//			//result1.setText(keychar+"  "+KeyEvent.getKeyText(e.getKeyCode()));
//		}
		
		public void keyPressed(KeyEvent e) {
			char keychar=e.getKeyChar();
			int keycode=e.getKeyCode();
			//result1.setText(keychar+"  "+Integer.toString(keycode));
			result1.setText(keychar+"  "+KeyEvent.getKeyText(keycode));
		}
		
		public void keyReleased(KeyEvent e) {
			
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GetKeyCodeTest();

	}

}
