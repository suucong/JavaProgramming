package Week04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InnerClassMouseAdapter extends JFrame {
	private JButton btn;

    public InnerClassMouseAdapter() {
        // 프레임 설정
        setTitle("Mouse 이벤트 리스너 예제_InnerAndAdapter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 컨텐트팬 생성 및 설정
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        // 컴포넌트 생성
        btn = new JButton("Action");

        // Mouse 리스너 달기
        btn.addMouseListener(new MyMouseListener());

        // 생성한 컴포넌트를 컨텐츠팬에 달기
        c.add(btn);

        // 프레임 크기 및 보이기
        setSize(350, 150);
        setVisible(true);
    }

    public class MyMouseListener extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
        	JButton b = (JButton)e.getSource();	
        	
        	if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			
			// InnerClassListener.this.setTitle(b.getText()
			setTitle(b.getText());	// 프레임 타이틀에 버튼 문자열을 출력한다.
        }
    }

    public static void main(String[] args) {
        new InnerClassMouseAdapter();
    }
}
