package Week06;

import javax.swing.*;
import java.awt.*;

public class JLabelPrac extends JFrame {
	
	public JLabelPrac() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("사랑합니다.");
		
		ImageIcon beauty = new ImageIcon("images/beauty.jpg");
		JLabel imageLabel = new JLabel(beauty);
		
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		JLabel label = new JLabel("전화하세요", normalIcon, SwingConstants.LEFT);
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(800, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JLabelPrac();
	}

}
