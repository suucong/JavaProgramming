package Week05;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Random;

public class Prac04 extends JFrame {
	
	private JLabel[] keyMessage;
	int clickNum = 0;
	
	public Prac04() {
		setTitle("GamblingGame");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 40));
		c.addKeyListener(new MyKeyListener());

		keyMessage = new JLabel[4];
		keyMessage[0] = new JLabel("");
		keyMessage[1] = new JLabel("");
		keyMessage[2] = new JLabel("");
		keyMessage[3] = new JLabel("");
		
		for (int i = 0; i < 3; i++) {
			keyMessage[i].setPreferredSize(new Dimension(50, 30));
			// JLabel은 기본적으로 배경색이 투명성을 가지고있어서 
			// JLabel.setOpaque(true) 메소드로 Opaque를 true로 설정해줘야 배경색이 바뀐다.
			keyMessage[i].setBackground(Color.MAGENTA);
			keyMessage[i].setForeground(Color.YELLOW);
			keyMessage[i].setOpaque(true);
			
			// 글자 가운데 정렬
			keyMessage[i].setHorizontalAlignment(SwingConstants.CENTER);
			
			c.add(keyMessage[i]);
		}
		
		c.add(keyMessage[3]);
		
		setSize(300, 200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			Random random = new Random();
			int keyCode = e.getKeyCode();
			
			if(keyCode == KeyEvent.VK_ENTER) {
				keyMessage[0].setText(Integer.toString(random.nextInt(5)));
				keyMessage[1].setText(Integer.toString(random.nextInt(5)));
				keyMessage[2].setText(Integer.toString(random.nextInt(5)));
				
				clickNum += 1;
				
				if (keyMessage[0].getText().equals(keyMessage[1].getText()) &&
					    keyMessage[1].getText().equals(keyMessage[2].getText())) {
					    keyMessage[3].setText("시도 횟수: " + clickNum + " 축하합니다!");
					    clickNum = 0;
				} else {
					keyMessage[3].setText("아쉽군요");
				}
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Prac04();
	}

}
