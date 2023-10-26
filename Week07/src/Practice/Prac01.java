package Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;	

public class Prac01 extends JFrame {
	private JTextField tField = new JTextField(15);
	private JComboBox<String> strCombo = new JComboBox<String>();
	
	public Prac01() {
		setTitle("과제1");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(tField);
		c.add(strCombo);
		
		tField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				String str = t.getText();
				strCombo.addItem(str);
				
				tField.setText("");
			}
		});
		
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Prac01();
	}
}
