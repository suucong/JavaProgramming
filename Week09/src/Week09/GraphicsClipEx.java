package Week09;

import javax.swing.*;
import java.awt.*;

public class GraphicsClipEx extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public GraphicsClipEx() {
		setTitle("이미지 사용 예제");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(500, 350);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("images/sunset.jpg");
		private Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setClip(100,20,150,150);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), Color.RED, this);
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Arial", Font.ITALIC, 40));
			g.drawString("Go Gator", 10, 150);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsClipEx();
	}
}
