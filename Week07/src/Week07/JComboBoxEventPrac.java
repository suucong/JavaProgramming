package Week07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;	

public class JComboBoxEventPrac extends JFrame {
	
	private String[] fruits = {"apple", "banana", "kiwi", "mango"};
	private ImageIcon[] images = {
		new ImageIcon("images/apple.jpg"),
		new ImageIcon("images/banana.jpg"),
		new ImageIcon("images/kiwi.jpg"),
		new ImageIcon("images/mango.jpg")
	};
	
	private JComboBox<String> strCombo = new JComboBox<String>(fruits);
	private JLabel imgLabel = new JLabel("start!!");
	
	public JComboBoxEventPrac() {
		setTitle("콤보박스 활용 예제");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(strCombo);
		c.add(imgLabel);
		
		strCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unchecked")
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
				imgLabel.setText("");
			}
		});
		
		setSize(300, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JComboBoxEventPrac();
	}

}
