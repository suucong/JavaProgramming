package Week03;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame{
	public GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4, 4);
		grid.setVgap(5);	// 수평 수직 간격을 메소드를 통해 설정할 수도 있음
		grid.setHgap(5);
		
		Container c = getContentPane();
		
//		c.setLayout(new GridLayout(4,2,5,5));
		c.setLayout(grid);
		c.add(new JLabel(" 이름", JLabel.CENTER));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번", JLabel.CENTER));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학과", JLabel.CENTER));
		c.add(new JTextField(""));
		c.add(new JLabel(" 과목", JLabel.CENTER));
		c.add(new JTextField(""));
//		for(int i = 0; i < 15; i++) {
//			c.add(new JButton("1"));
//		}
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		GridLayoutEx gridLayout = new GridLayoutEx();
	}
}
