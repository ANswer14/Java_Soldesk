package com.lyh.may234.main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.lyh.may234.frame.BMIFrame;

public class GMain4 {
	public static void main(String[] args) {
		// 제목이  BMI검사인 JFrame
		JFrame jf = new JFrame("BMI 검사");
		
		// 3행 2열짜ㅇ리 GridLayout
		GridLayout gl = new GridLayout(3, 2);
		
		// JFrame의 레이아웃 속성을 gl로 사용
		jf.setLayout(gl);
		
		JPanel jp = new JPanel();
		jf.add(jp);
		JLabel height = new JLabel("키(cm) : ");
		JTextField field1 = new JTextField(15);
		JLabel weight = new JLabel("체중(kg) : ");
		JTextField field2 = new JTextField(15);
		JTextField field3 = new JTextField(15);
		JButton button = new JButton("확인");
		
		jp.add(height);
		jp.add(field1);
		jp.add(weight);
		jp.add(field2);
		jp.add(field3);
		jp.add(button);
		
		BMIFrame BMI = new BMIFrame(field1, field2, field3);
		button.addActionListener(BMI);
		
		jf.setSize(300, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("BMI검사");
		jf.setVisible(true);
	}
}
