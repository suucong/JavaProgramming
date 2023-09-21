package Week03;

import java.awt.*;
import javax.swing.*;

public class TestEx02 extends JFrame {
	public TestEx02(){
		setTitle("TestEx02");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		BorderLayout border = new BorderLayout();
		
		// BorderLayout으로 설정
		c.setLayout(border);
		
		JLabel title = new JLabel("Title");
		title.setHorizontalAlignment(JLabel.CENTER);	// 좌우 가운데 정렬(기본값: 왼쪽 정렬)
		
		JLabel tail = new JLabel("Tail");
		tail.setHorizontalAlignment(JLabel.CENTER); 	// 좌우 가운데 정렬(기본값: 왼쪽 정렬)
		
		c.add(title, BorderLayout.NORTH);
		c.add(tail, BorderLayout.SOUTH);
		
		// 패널 생성 (레이아웃 위에 새로운 레이아웃을 쌓기 위해)
		JPanel panel = new JPanel();
	    GridLayout gridLayout = new GridLayout(4, 4);
	    panel.setLayout(gridLayout);	// 패널에 GridLayout 설정
	    
		for(int i = 0; i < 15; i++) {
			panel.add(new JButton("1"));
		}
		
		// 레이아웃 위에 레이아웃 추가. 최상위 컨
		c.add(panel, BorderLayout.CENTER);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		TestEx02 textEx02 = new TestEx02();
	}
}
