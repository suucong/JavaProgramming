package Week07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;			

public class JRadioButtonItemEventPrac extends JFrame {
	private JRadioButton[] radio = new JRadioButton[3];
	private String[] text = {"사과", "배", "체리"};
	private ImageIcon[] image = {
			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/pear.jpg"),
			new ImageIcon("images/cherry.jpg")
	};
	private JLabel imageLabel = new JLabel();
	
	public JRadioButtonItemEventPrac() {
		setTitle("라디오버튼 ItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.GRAY);

		ButtonGroup group = new ButtonGroup();
		for(int i = 0; i < radio.length; i++) {
		    radio[i] = new JRadioButton();
		    radio[i].setText(text[i]);
		    radioPanel.add(radio[i]);
		    group.add(radio[i]);
		    radio[i].addItemListener(new MyItemListener());
		}
		
		radio[2].setSelected(true);
		
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		setSize(500, 500);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(radio[0].isSelected())	imageLabel.setIcon(image[0]);
			else if(radio[1].isSelected())	imageLabel.setIcon(image[1]);
			else	imageLabel.setIcon(image[2]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JRadioButtonItemEventPrac();
	}

}
