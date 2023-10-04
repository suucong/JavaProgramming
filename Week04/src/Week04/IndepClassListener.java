package Week04;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class IndepClassListener extends JFrame{
	public IndepClassListener() {
		// 프레임 설정
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 컨텐트팬 생성 및 설정
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 컴포넌트 생성
		JButton btn = new JButton("Action");
		
		// Action 리스너 달기
		btn.addActionListener(new MyActionListner());
		
		// 생성한 컴포넌트를 컨텐츠팬에 달기 
		c.add(btn);
		
		// 프레임 크기 및 보이기
		setSize(350, 150);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new IndepClassListener();
	}
}

