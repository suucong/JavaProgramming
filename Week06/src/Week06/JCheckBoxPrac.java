package Week06;

import javax.swing.*;
import java.awt.*;

public class JCheckBoxPrac extends JFrame {
	
	public JCheckBoxPrac() {
		setTitle("체크 박스 만들기 예제");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배");
		JCheckBox cherry = new JCheckBox("체리", cherryIcon);
		cherry.setSelectedIcon(selectedCherryIcon);	// 선택 상태의 이미지 달기
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JCheckBoxPrac();
	}
}
