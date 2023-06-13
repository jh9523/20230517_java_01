package kh.lclass.swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx extends JFrame {
	public JComponentEx() {
		super("JComponent의 공통 메소드 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton(" Disabled Button ");
		JButton b3 = new JButton("getX(), getY()");
		
		b1.setBackground(Color.YELLOW);		// 배경색 설정
		b1.setForeground(Color.MAGENTA);	// 글자색 설정
		b1.setFont(new Font("Arial",Font.ITALIC, 20));	// Arial, 20픽셀 폰트 설정
		b2.setEnabled(false);	// 버튼 비활성화
		
	}
}
