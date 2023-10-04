package Week04;

import javax.swing.*;
import java.awt.event.*;

public class MyActionListner implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		// 이벤트를 발생시킨 컴포넌트를 알아내기 위해서 getSource() 메서드 사용
		JButton b = (JButton)e.getSource();	
		
		if(b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
	}
}
