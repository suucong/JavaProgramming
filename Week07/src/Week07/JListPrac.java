package Week07;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListPrac extends JFrame {
	
	private String[] fruits = {"apple", "banana", "kiwi", "mango", "pear", 
								"peach", "berry", "strawberry", "blackberry"};
	private ImageIcon[] images = {
			new ImageIcon("images/icon1.png"),
			new ImageIcon("images/icon2.png"),
			new ImageIcon("images/icon3.png"),
			new ImageIcon("images/icon4.png")
	};
	
	private JLabel eventText = new JLabel("선택하세요.");
	
	public JListPrac() {
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 문자열 배열로 리스트 생성
		JList<String> strList = new JList<String>(fruits);
		c.add(strList);
		
		// 이미지 배열로 리스트 생성 
		JList<ImageIcon> imageList = new JList<ImageIcon>();
		imageList.setListData(images);	// 리스트 아이템 세팅
		c.add(imageList);
		
		// 스크롤바 생성을 하면서 리스트 생성
		JList<String> scrollList = new JList<String>(fruits);
		scrollList.addListSelectionListener(new MyListSelecionListener());
		
		c.add(new JScrollPane(scrollList));
		c.add(eventText);
		
		setSize(300, 400);
		setVisible(true);
	}
	
	class MyListSelecionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			@SuppressWarnings("unchecked")
			JList<String> jl = (JList<String>)e.getSource();
			int index = jl.getSelectedIndex();
			eventText.setText(fruits[index]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JListPrac();
	}

}
