package Practice;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class Prac01 extends JFrame {
	private MyPanel panel = new MyPanel();
	private JPanel btnPanel = new JPanel();
	private JButton button = new JButton("Hide/Show");
	private boolean isImageVisible = true;
	
	public Prac01() {
		setTitle("과제1");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		// 버튼의 디자인 설정
		button.setOpaque(true);
		button.setBackground(new Color(184, 223, 248));
		button.setBorder(new LineBorder(new Color(80, 188, 223), 1));
        button.setPreferredSize(new Dimension(100, 27));
		
		// 버튼 패널을 투명하게 변경
		btnPanel.setOpaque(false);
		
		btnPanel.add(button);
		panel.add(btnPanel);
		setContentPane(panel);
		
		button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 이미지 패널의 가시성을 토글
                isImageVisible = !isImageVisible;

                // 화면을 다시 그리도록 요청
                revalidate();
                repaint();
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
			if (isImageVisible) {	// isImageVisble이 true인 경우에만 배경에 이미지를 그리기
				g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Prac01();
	}
}
