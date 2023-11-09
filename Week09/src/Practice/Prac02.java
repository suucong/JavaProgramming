package Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prac02 extends JFrame {
	private MyPanel panel = new MyPanel();
	private int cursorX = 200;
	private int cursorY = 100;
	
	public Prac02() {
		setTitle("과제2");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		setContentPane(panel);
		
		// MouseMotionAdapter 사용하여 커서가 움직일 때마다 위치 업데이트
		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				// 마우스 이동 시 커스텀 커서의 위치를 업데이트하고, 패널을 다시 그리기
				cursorX = e.getX();
				cursorY = e.getY();
				
				// 화면을 다시 그리도록 요청
				revalidate();
				panel.repaint();
			}
		});
		
		setSize(500, 350);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/sunset.jpg");
		private Image img = icon.getImage();
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			
			g.setColor(Color.GREEN);
			g.fillOval(cursorX - 20, cursorY - 20, 40, 40);	// 마우스 커서가 원 중앙에 오도록
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Prac02();
	}
}
