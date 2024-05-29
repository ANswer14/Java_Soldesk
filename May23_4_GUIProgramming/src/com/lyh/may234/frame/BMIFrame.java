package com.lyh.may234.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JTextField;

// 계산
// String => double
//		=> Double.parseDouble();

// BMI : XX.X이고, 당신은 XX입니다.
// System.out.printf(); = String.format();

public class BMIFrame implements ActionListener{
	private JTextField field1;
	private JTextField field2;
	private JTextField field3;
	public BMIFrame() {
		// TODO Auto-generated constructor stub
	}
	public BMIFrame(JTextField field1, JTextField field2, JTextField field3) {
		super();
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		double height = Double.parseDouble(field1.getText());
		double weight = Double.parseDouble(field2.getText());
		double BMI = weight / (height * height / 10000);
		String c = null;
		String a = null;
		if (BMI < 18.5) {
			a = "저체중";
		}else if (BMI < 23) {
			a = "정상";
		}else if (BMI < 25) {
			a = "과체중";
		}else if (BMI < 30) {
			a = "경도비만";
		}else {
			a = "중등도비만";
		}
		c = String.format("BMI가%.1f 이므로 %s입니다" , BMI, a);
		field3.setText(c);
	}
	
}
