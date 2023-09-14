package Week02;

import javax.swing.*;

public class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("500*500 스윙 프레임 만들기");
		setSize(100, 50);	// 프레임 크기(처음의 사이즈 지정 -> 늘리기, 줄이기 가능)
		setVisible(true);	// 프레임 출력
	}
	
	// 스윙 응용 프로그램에서는 main 메소드의 기능은 최소화
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}