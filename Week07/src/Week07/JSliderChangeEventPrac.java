package Week07;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;

public class JSliderChangeEventPrac extends JFrame {
	
	private JSlider[] sl = new JSlider[3];
	private JLabel colorLabel = new JLabel();
	
	public JSliderChangeEventPrac() {
		
		setTitle("콤보박스 활용 예제");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		for(int i = 0; i < sl.length; i++) {
			sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMajorTickSpacing(50);
			sl[i].setMinorTickSpacing(10);
			sl[i].addChangeListener(new MyChangeListener());
			c.add(sl[i]);
		}
		
		sl[0].setForeground(Color.RED);
        sl[1].setForeground(Color.GREEN);
        sl[2].setForeground(Color.BLUE);
		
		colorLabel.setOpaque(true);
		c.add(colorLabel);		
		setSize(200, 300);
		setVisible(true);
	}
	
	class MyChangeListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			int r = sl[0].getValue();
			int g = sl[1].getValue();
			int b = sl[2].getValue();
			colorLabel.setBackground(new Color(r,g,b));
			colorLabel.setText("R: " + r + ", G: " + g + "B: " + b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JSliderChangeEventPrac();
	}

}
