package com.lyh.may234.frame;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// JFrame : Swing에서 윈도우를 나타내는 Class
//	JPannel(보조 프레임), JButton(버튼), JLabel(라벨), JTextField(글자입력), ...

// layout : 
// 		flowLayout - 일렬배치 (왼쪽 -> 오른쪽)
//		BorderLayout - Frame 형식(상하좌우)
//		GridLayout - 격자 형태(행렬)
//		setLocation, setBounds - 위치 임의로 지정

public class MakeFrame extends JFrame{
	// 버튼 10개 각각 번호를 붙여서 (1 ~ 10) 붙여서 가운데 정렬
	JPanel pl;
	
	public MakeFrame() {
	    setSize(500, 500);		// frame size		
		setTitle("GUI 연습");	// frame title
		pl = new JPanel();		// 패널 하나 생성
		pl.setLayout(new FlowLayout());	// 가운데 정렬
		for (int i = 1; i <= 10; i++) {
			pl.add(new JButton("버튼" + i)); /// pl안에 button을 넣은 상태
		}
		add(pl); // JPanel을 JFrame안에 넣기
		setVisible(true); // JFrame 보이게 하기 (반대 : false)
	}
}
