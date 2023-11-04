package Week09;

import javax.swing.*;
import java.awt.*;

public class PaintComponentEx extends JFrame{
	public PaintComponentEx() {
		setTitle("버튼 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		MyButton b = new MyButton("New Button");
		b.setOpaque(true);
		b.setBackground(Color.YELLOW);
		c.add(b);
		setSize(500,500);
		setVisible(true);
	}
	
	class MyButton extends JButton{
		MyButton(String s){
			super(s);
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawOval(0, 0, this.getWidth(), this.getHeight());
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PaintComponentEx();
	}

}
