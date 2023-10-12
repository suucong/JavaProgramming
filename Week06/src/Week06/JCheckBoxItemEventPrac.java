package Week06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JCheckBoxItemEventPrac extends JFrame {
	
	private JCheckBox [] fruits = new JCheckBox[3];
	private String[] names = {"사과", "배","체리"};
	private JLabel sumLabel;
	
	public JCheckBoxItemEventPrac() {
		setTitle("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(5,1));
		
		c.add(new JLabel("사과 1000원, 배 5000원, 체리 20000원"));
		
	    MyItemListener listener = new MyItemListener();
	    
	    for (int i = 0; i < fruits.length; i++) {
	    	fruits[i] = new JCheckBox(names[i]);
	    	fruits[i].setBorderPainted(true);
	    	c.add(fruits[i]);
	    	fruits[i].addItemListener(listener);
	    }
	    
	    sumLabel = new JLabel("현재 0원 입니다.");
	    c.add(sumLabel);
	    
	    setSize(500, 500);
	    setVisible(true);
	}
	
	class MyItemListener implements ItemListener {
		private int sum = 0; 	// 가격의 합
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			// 체크박스가 선택이 되었는지를 먼저 확인
			if(e.getStateChange() == ItemEvent.SELECTED) {
				// 체크박스가 선택이 되었다면, 어떤 아이템이 선택되었는지 확인 
				if(e.getItem() == fruits[0])
					sum += 1000;
				else if(e.getItem() == fruits[1])
					sum += 5000;
				else
					sum += 20000;
			} else {	// 선택이 해제됐다면
				if(e.getItem() == fruits[0]) {
					sum -= 1000;
				} else if(e.getItem() == fruits[1]) {
					sum -= 5000;
				} else {
					sum -= 20000;
				}
			}
			sumLabel.setText("현재 " + sum + "원 입니다.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JCheckBoxItemEventPrac();
	}
	
}
