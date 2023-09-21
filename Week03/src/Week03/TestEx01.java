package Week03;

import java.awt.*;
import javax.swing.*;

public class TestEx01 extends JFrame {
	public TestEx01(){
		setTitle("TestEx01");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(3, 5);
		grid.setVgap(5);	
		grid.setHgap(5);
		
		Container c = getContentPane();
		
		c.setLayout(grid);
		
		for(int i = 1; i <= 10; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setBackground(Color.GREEN);
			b.setOpaque(true);
			b.setBorderPainted(false);
			c.add(b);
		}
		
		JButton black = new JButton("1");
		black.setBackground(Color.BLACK);
		black.setForeground(Color.WHITE);
		black.setOpaque(true);
		black.setBorderPainted(false);
		c.add(black);
		
		JButton gray = new JButton("2");
		gray.setBackground(Color.GRAY);
		gray.setOpaque(true);
		gray.setBorderPainted(false);
		c.add(gray);
		
		JButton pink = new JButton("3");
		pink.setBackground(Color.PINK);
		pink.setOpaque(true);
		pink.setBorderPainted(false);
		c.add(pink);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		TestEx01 textEx01 = new TestEx01();
	}
}
