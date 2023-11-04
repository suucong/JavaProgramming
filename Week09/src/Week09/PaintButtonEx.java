package Week09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaintButtonEx extends JFrame{
	MyButton button = new MyButton("버튼");
	boolean check;
	int count;
	public PaintButtonEx() {
		setTitle("새로운 버튼 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		check = false;
		count = 0;
		button.addActionListener(new NewBtn());
		
		Container c = getContentPane();
		c.setLayout(null);
		
		button.setBounds(50,20,100,100);
		button.setBorderPainted(true);
		
		c.add(button);
		
		setSize(500,500);
		setVisible(true);
	}
	
	class MyButton extends JButton{
		MyButton(String s){
			super(s);
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			button.setOpaque(false);
			button.setBackground(Color.WHITE);
			
			if(check && count%2==1) {
				button.setBorderPainted(false);
				g.setColor(Color.GREEN);
				g.fillOval(0, 0, this.getWidth(), this.getHeight());
				g.setColor(Color.WHITE);
				g.setFont(new Font("Arial", Font.BOLD, 20));
				g.drawString("again", this.getX()-25, this.getY()+10);
			}
			else {
				button.setBorderPainted(true);
				
			}
		}
	}
	public class NewBtn implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			check = true;
			count++;
			button.repaint();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PaintButtonEx();
	}

}
