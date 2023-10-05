package Week05;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerAllEx extends JFrame {
	
	public JLabel text = new JLabel("No Mouse Event");
	
	public MouseListenerAllEx() {
		setTitle("MouseListenerAllEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener); 
		c.addMouseMotionListener(listener);
		
		c.add(text);
	
		
		setSize(300, 200);
		setVisible(true);	
	}
	
	public class MyMouseListener implements MouseListener, MouseMotionListener {
		
		public void mousePressed(MouseEvent e) {
			text.setText("MousePressed (" + e.getX()+", "+e.getY()+")");
		}
		
		public void mouseReleased(MouseEvent e) {
			text.setText("MouseReleased (" + e.getX()+", "+e.getY()+")");
		}
		
		public void mouseClicked(MouseEvent e) {}
		
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}
		
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			text.setText("MouseExited");
			c.setBackground(Color.YELLOW);
		}
		
		public void mouseDragged(MouseEvent e) {
			text.setText("MouseDragged (" + e.getX()+", "+e.getY()+")");
		}
		
		public void mouseMoved(MouseEvent e) {
			text.setText("MouseMoved (" + e.getX()+", "+e.getY()+")");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListenerAllEx();
	}

}
