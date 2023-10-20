package Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;	

public class Prac02 extends JFrame {
	private JLabel text = new JLabel("금액");
	private JTextField tField = new JTextField(8);
	private JButton button = new JButton("계산");
	private JLabel[] money = new JLabel[5];
	private JTextArea[] textArea = new JTextArea[5];    

	public Prac02() {
		setTitle("과제2");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout()); 	// 컨테이너의 배치관리자를 BorderLayout으로 설정
		
		// 버튼에 리스너 추가
		button.addActionListener(new MyEventListener());
		
		// 값을 입력할 텍스트필드와 버튼을 넣어줄 패널 생성 (FlowLayout을 배치관리자로 설정)
		JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		inputPanel.add(text);
		inputPanel.add(tField);
		inputPanel.add(button);
		
		// BorderLayout의 Center에 위치할 JTextField을 넣어줄 패널 생성 (GridLayout을 배치관리자로 설정)
		JPanel outputPanel = new JPanel(new GridLayout(5, 1, 0, 2));
		// BorderLayout의 West에 위치할 JLabel을 넣어줄 패널 생성 (GridLayout을 배치관리자로 설정)
		JPanel labelPanel = new JPanel(new GridLayout(5, 1, 0, 2));
		
		// JLabel 생성해서 값 넣어주기
		money[0] = new JLabel("오만원");
		money[1] = new JLabel("만원");
		money[2] = new JLabel("오천원");
		money[3] = new JLabel("천원");
		money[4] = new JLabel("동전");
		
		// 각 패널들에 JLabel, JTextArea 추가 
		for(int i = 0; i < 5; i++) {
			textArea[i] = new JTextArea(2, 15);
			
			labelPanel.add(money[i]);
			outputPanel.add(textArea[i]);
		}
		
		// 컨텐트팬에 패널들 붙여주기
		c.add(inputPanel, BorderLayout.NORTH);
		c.add(labelPanel, BorderLayout.WEST);
		c.add(outputPanel, BorderLayout.CENTER);
		
		setSize(240, 300);
		setVisible(true);
	}
	
	class MyEventListener implements ActionListener {
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == button) {
	            // 버튼이 눌렸을 때 처리할 내용
	            String str = tField.getText();
	            try {
	            	// 입력된 String값 정수로 변환해서 number 변수에 할당
	                int number = Integer.parseInt(str);
	                
	                // textArea 배열 전부 초기화. 버튼을 누를 때마다 textArea에 글자가 추가
	                // 되는 것을 방지하기 위함. JTextComponent 클래스를 상속받아 setText 메서드 사용 가능
	                for(int i = 0; i < textArea.length; i++) {
	                	textArea[i].setText("");
	                }
	                
	                // textArea에 계산 한 값 넣어주기 
	                textArea[0].append(String.valueOf(number/50000)+"장");
	                number = number%50000;
	                textArea[1].append(String.valueOf(number/10000)+"장");
	                number = number%10000;
	                textArea[2].append(String.valueOf(number/5000)+"장");
	                number = number%5000;
	                textArea[3].append(String.valueOf(number/1000)+"장");
	                number = number%1000;
	                textArea[4].append(String.valueOf(number)+"원");
	                
	            } catch (NumberFormatException er) {
	                // 형변환에 실패한 경우 예외 처리
	                System.err.println("숫자로 변환할 수 없는 문자열입니다.");
	            }
	        }
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Prac02();
	}

}
