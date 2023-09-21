package Week02;

import java.awt.*;
import javax.swing.*;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// 창을 닫을 때 어떻게 동작할 건지에 대한 기본 값을 설정해줌.
		
		Container cp = getContentPane();
		
		cp.setBackground(Color.CYAN);	// 컨텐트팬의 배경색 설정
		// BorderLayout은 JFrame의 Default 배치관리자.
		cp.setLayout(new BorderLayout());	// 컨텐트팬 내 컴포넌트들의 배치방법 설정(컴포넌트 관리자 지정) 
		
		// JButton jb = new JButton("ok");
		// cp.add(jb);
		cp.add(new JButton("OK"), BorderLayout.EAST);
		cp.add(new JButton("Cancel"), BorderLayout.WEST);
		cp.add(new JButton("Ignore"));
		
		setSize(400, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}