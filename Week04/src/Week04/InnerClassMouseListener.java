package Week04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class InnerClassMouseListener extends JFrame {
    private JButton btn;

    public InnerClassMouseListener() {
        // 프레임 설정
        setTitle("Mouse 이벤트 리스너 예제_Inner");
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

    public class MyMouseListener implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            if (btn.getText().equals("Action"))
                btn.setText("액션");
            else
                btn.setText("Action");

            setTitle(btn.getText());
        }

        // MouseListener 인터페이스의 다른 메서드들.
        // mouseClicked 메서드만 사용하여 구현 가능하여 다른 메서드들은 딱히 정의해주지 않음.
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
    }

    public static void main(String[] args) {
        new InnerClassMouseListener();
    }
}
