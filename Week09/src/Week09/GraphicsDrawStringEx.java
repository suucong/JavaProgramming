package Week09;

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawStringEx extends JFrame{
	//panel 만들기
	//생성자 GraphicsDrawStringEx 만들기
	//panel 확장해서 나만의 panel 만들기
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawStringEx() {
		setTitle("도형칠하기 사용 예제");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(500,500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(10, 10, 50, 50);
			
			g.setColor(Color.BLUE);
			g.drawOval(10,70,50,50);
			
			g.setColor(Color.GREEN);
			g.drawRoundRect(10, 130, 50, 50, 20, 20);
			
			g.setColor(Color.MAGENTA);
			g.fillArc(10, 190, 50, 50, 0, 270);
			
			g.setColor(Color.ORANGE);
			int []x = {30, 10, 30, 60};
			int []y = {250, 275, 300, 275};
			g.fillPolygon(x,y,4);
			
			g.setColor(Color.RED);
			g.fillArc(10, 310, 50, 50, 90, 120);
			
			g.setColor(Color.BLUE);
			g.fillArc(10, 310, 50, 50, 210, 120);
			
			g.setColor(Color.YELLOW);
			g.fillArc(10, 310, 50, 50, 330, 120);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsDrawStringEx();
	}

}
