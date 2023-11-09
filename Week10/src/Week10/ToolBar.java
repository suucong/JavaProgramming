package Week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToolBar extends JFrame {
	private JPanel toolPanel = new JPanel();
	
	public ToolBar() {
		setTitle("툴바 만들기 예제");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		toolPanel.setLayout(new BorderLayout());
		add(toolPanel);
		createToolBar();
		setSize(400, 200);
		setVisible(true);
	}

	private void createToolBar() {
		JToolBar toolBar = new JToolBar("Menu Bar");
		toolBar.setBackground(Color.LIGHT_GRAY);
		
		toolBar.add(new JButton("New"));
		toolBar.add(new JButton(new ImageIcon("images/open.jpg")));
		toolBar.addSeparator();
		toolBar.add(new JButton(new ImageIcon("images/save.jpg")));
		toolBar.add(new JLabel("search"));
		toolBar.add(new JTextField("text field"));
		
		String[] subject = {"", "Java", "C#", "C", "C++"};
		JComboBox<String> combo = new JComboBox<>(subject);
		
		toolBar.add(combo);
		toolPanel.add(toolBar, BorderLayout.NORTH);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ToolBar();
	}
}
