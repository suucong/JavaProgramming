package Practice;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class Prac03 extends JFrame {
	
	// 색상, 크기 지정하는 라디오 버튼 배열 생성
	private JRadioButton[] radio = new JRadioButton[2];
	// 라디오 버튼에 넣어줄 String 배열 생성
	private String[] text = {"색상", "크기"};
	// 색상 슬라이더 배열
	private JSlider[] sl = new JSlider[3];
	// 색상과 크기를 조절 가능한 JLabel 생성
	private JLabel colorLabel = new JLabel("I love coffee");
	// 슬라이더를 구분하기 위한 JLabel 생성
	private JLabel[] RGB = new JLabel[3];
	// 색상 슬라이더 배열을 넣어줄 패널 생성(BorderLayout.CENTER)
	private JPanel colorSliderPanel = new JPanel(new GridLayout(3, 1, 0, 0));
	// RGB JLabel 배열을 넣어줄 패널 생성(BorderLayout.WEST)
	private JPanel rgbLabelPanel = new JPanel(new GridLayout(3, 1, 0, 0));
	private Font font;

	public Prac03() {
		setTitle("과제3");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout(10, 0));	// 컨테이너의 배치관리자를 BorderLayout으로 설정
		
		// colorLabel FontSize 지정해주기
		int fontSize = 20;
		Font newFont = new Font("SansSerif", Font.PLAIN, fontSize); // 폰트 설정
		colorLabel.setFont(newFont); // JLabel의 폰트를 변경한 폰트로 설정
		
		/* ----------------------------- 색상 슬라이더 설정 -------------------------------- */
		// JLabel 생성해 값 할당
		RGB[0] = new JLabel("R");
		RGB[1] = new JLabel("G");
		RGB[2] = new JLabel("B");
		
		for(int i = 0; i < sl.length; i++) {
			sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMajorTickSpacing(50);
			sl[i].setMinorTickSpacing(10);
			sl[i].addChangeListener(new MyChangeListener());
			// 슬라이더와 라벨 Border 지정해주기
			sl[i].setBorder(new EmptyBorder(0, 0, 0, 40));
			RGB[i].setBorder(new EmptyBorder(0, 20, 0, 30));
			rgbLabelPanel.add(RGB[i]);
			colorSliderPanel.add(sl[i]);
		}
		
		// colorLabel 위치 설정
		colorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		colorLabel.setVerticalAlignment(SwingConstants.CENTER);
		colorLabel.setBorder(new EmptyBorder(0, 0, 20, 0));
		
/* ----------------------------- 라디오그룹 설정 -------------------------------- */
		// 라디오 버튼 배열을 넣어줄 패널 생성(BorderLayout.NORTH)
		JPanel radioPanel = new JPanel();
		ButtonGroup group = new ButtonGroup();
		
		for(int i = 0; i < radio.length; i++) {
			radio[i] = new JRadioButton();
			radio[i].setText(text[i]);
			group.add(radio[i]);
		    radioPanel.add(radio[i]);
		    radio[i].addItemListener(new MyItemListener());
		}
		
		radio[0].setSelected(true);

/* ----------------------------------- 컨텐트팬 부착 -------------------------------- */
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(rgbLabelPanel, BorderLayout.WEST);
		c.add(colorSliderPanel, BorderLayout.CENTER);
		c.add(colorLabel, BorderLayout.SOUTH);
		
		setSize(500, 500);
		setVisible(true);
	}
	
/* ----------------------------------- 라디오버튼 리스너 -------------------------------- */
	class MyItemListener implements ItemListener {
	    public void itemStateChanged(ItemEvent e) {
	        if (radio[0].isSelected()) { // Color 라디오 버튼 선택 시
	        	System.out.println("0");
	        	RGB[0].setText("R");
	            sl[0].setMinimum(0);
	            sl[0].setMaximum(255);
	            sl[0].setValue(128);
	            for (int i = 1; i <= 2; i++) {
	                RGB[i].setVisible(true);
	                sl[i].setVisible(true);
	            }
	            sl[1].setValue(128);
	            sl[2].setValue(128);
	        } else { // size 라디오 버튼 선택 시
	        	System.out.println("1");
	            RGB[0].setText("크기");
	            for (int i = 1; i <= 2; i++) {
	                RGB[i].setVisible(false);
	                sl[i].setVisible(false);
	            }
	            colorLabel.setForeground(Color.BLACK);
	            sl[0].setMinimum(0);
	            sl[0].setMaximum(70);
	            sl[0].setValue(20);
	        }
	    }
	}
	
/* ----------------------------------- 슬라이더 리스너 -------------------------------- */	
	class MyChangeListener implements ChangeListener {
		@Override
		public void stateChanged(ChangeEvent e) {
			// 만약 1번 슬라이더가 안보이도록 설정되어있다면, 0번 슬라이더로 크기조절
			if (RGB[0].getText() == "R") {
				int r = sl[0].getValue();
				int g = sl[1].getValue();
				int b = sl[2].getValue();
				
				// 라벨 글씨 색 변경
				colorLabel.setForeground(new Color(r,g,b));
			} else {
				int fontSize = (int)sl[0].getValue();
				font = colorLabel.getFont().deriveFont((float)fontSize);
				colorLabel.setFont(font);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Prac03();
	}

}