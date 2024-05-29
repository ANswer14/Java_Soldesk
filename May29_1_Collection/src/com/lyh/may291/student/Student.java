package com.lyh.may291.student;

public class Student {
	private String name;
	private int krScore;
	private int engScore;
	private int mathScore;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int krScore, int engScore, int mathScore) {
		super();
		this.name = name;
		this.krScore = krScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKrScore() {
		return krScore;
	}

	public void setKrScore(int krScore) {
		this.krScore = krScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	public void printInfo() {
		System.out.println("이름 : "+name);
		System.out.println("국어 점수 : "+krScore);
		System.out.println("영어 점수 : " +engScore);
		System.out.println("수학 점수 : "+mathScore);
	}
}
