package Week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuActionEvent extends JFrame {
	private JLabel imgLabel = new JLabel();
	
	public MenuActionEvent() {
		setTitle("Menu에 Action리스너 만들기");
		createMenu();
		
		// 이미지가 프레임보다 클 경우를 위해 스크롤팬 생성 코드
		JScrollPane pane = new JScrollPane(imgLabel);
		getContentPane().add(pane, BorderLayout.CENTER);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(1000, 800);
		setVisible(true);
	}
	
	public void createMenu() {
		JMenuBar mb = new JMenuBar();	// JMenuBar를 통해 메뉴 영역을 생성
		JMenu screenMenu = new JMenu("Screen");		// JMenuBar를 통한 메뉴 영역 위에 추가할 JMenu 컴포넌트 생성
		JMenuItem[] menuItem = new JMenuItem[4];	// JMenuBar에 추가할 JMenuItem 생성
		String[] itemTitle = {"Load", "Hide", "Reshow", "Exit"};
		
		MenuActionListener listener = new MenuActionListener();
		
		// 4개의 메뉴 아이템을 Screen 메뉴에 삽입한다.
		for(int i = 0; i < menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			screenMenu.add(menuItem[i]);
		}
		
		mb.add(screenMenu);
		setJMenuBar(mb);
	}
	
	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand(); 	// 선택된 메뉴 아이템을 반환하는 메서드
			
			switch(cmd) {	// 메뉴 아이템의 종류 구분
				case "Load":
					if(imgLabel.getIcon() != null) return;
					imgLabel.setIcon(new ImageIcon("images/sunset.jpg"));
					pack();
					break;
				case "Hide":
					imgLabel.setVisible(false);
					break;
				case "Reshow":
					imgLabel.setVisible(true);
					break;
				case "Exit":
					System.exit(0);
					break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuActionEvent();
	}
}
