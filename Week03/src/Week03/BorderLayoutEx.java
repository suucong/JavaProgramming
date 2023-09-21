package Week03;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame{
	public BorderLayoutEx() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		// BorderLayout(int hGap, int vGap) - 생성자
		// hGap - 좌우 두 컴포넌트 사이의 수평 간격. 디폴트는 0픽셀.
		// vGap - 상하 두 컴포넌트 사이의 수직 간격. 디폴트는 0픽셀.
		c.setLayout(new BorderLayout());
		
		
		// BorderLayout은 위치를 지정해주지 않으면 전부 CENTER에 위치하게 되므로
		// 위치를 지정해주는 것이 좋음
		c.add(new JButton("add"), BorderLayout.CENTER);
		c.add(new JButton("sub"), BorderLayout.NORTH);
		c.add(new JButton("mul"), BorderLayout.SOUTH);
		c.add(new JButton("div"), BorderLayout.EAST);
		c.add(new JButton("Calculate"), BorderLayout.WEST);
		
		setSize(300, 200);
		setResizable(false);	// 창의 크기를 고정.
		setVisible(true);
	}
	
	public static void main(String[] args) {
		BorderLayoutEx borderLayout = new BorderLayoutEx();
	}
}
