package Practice;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prac03 extends JFrame {
	private MyPanel panel = new MyPanel();
	private List<Point> points = new ArrayList<>();	// vector 동적 배열 생성
	private int pointNum = 0;

	public Prac03() {
		setTitle("과제3");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(null);	// 배치관리자 없음. 
		setContentPane(panel);
		
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 마우스가 클릭 될 때마다 point 배열에 마우스 좌표 추가
				points.add(new Point(e.getX(), e.getY()));
		
				pointNum++;
				
				// 화면을 다시 그리도록 요청
				revalidate();
				panel.repaint();
			}
		});
		
		setSize(500, 350);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			// Polygon 생성
			Polygon polygon = new Polygon();
			
			// points 배열의 값들을 polygon에 추가 
			for(Point point : points) {
				polygon.addPoint(point.x, point.y);
			}
			
			if(pointNum != 0) {
				// Polygon 그리기
		        g.setColor(Color.RED);
		        g.drawPolygon(polygon);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Prac03();
	}
}
