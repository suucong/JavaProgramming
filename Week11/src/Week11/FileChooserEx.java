package Week11;

import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.*;
import java.awt.event.*;

public class FileChooserEx extends JFrame {
	private JLabel imgLabel = new JLabel();
	
	public FileChooserEx() {
		setTitle("파일 탐색기 예제");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.add(imgLabel);
		createMenu();
		
		setSize(500, 250);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Open");
		
		openItem.addActionListener(new OpenFileActionListener());
		
		fileMenu.add(openItem);
		mb.add(fileMenu);
		setJMenuBar(mb);
	}
	
	class OpenFileActionListener implements ActionListener {
		private JFileChooser chooser;
		FileNameExtensionFilter filter;
		
		public OpenFileActionListener() {
			chooser = new JFileChooser();
			filter = new FileNameExtensionFilter("JPG, GIF, PNG Images", "jpg", "gif", "png");
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			chooser.setFileFilter(filter);
			
			int result = chooser.showOpenDialog(null);
			
			if(result != JFileChooser.APPROVE_OPTION) {	// 창을 강제로 닫았거나, 파일을 선택하지 않고 취소 버튼을 누른 경우
				JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				return;
			}
			
			// 정상적으로 파일을 여는 경우 
			String filePath = chooser.getSelectedFile().getPath();	// 선택한 파일의 경로 찾기
			imgLabel.setIcon(new ImageIcon(filePath));	// 이미지 출력
			pack();		// 이미지 크기에 맞추어 프레임 크기 조절
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileChooserEx();
	}
}
