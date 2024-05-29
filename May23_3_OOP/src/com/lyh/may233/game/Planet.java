package com.lyh.may233.game;

import com.lyh.may233.avengers.Ironman;

public class Planet {
	private String name;
	private double size;
	private boolean visibility;
	
	public Planet() {
		// TODO Auto-generated constructor stub
	}

	public Planet(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public boolean isVisibility() {
		return visibility;
	}

	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}

	public void add(Human h) {
		System.out.printf("%s에 %s이가 입주 !\n", name, h.getName());
	}
	
//	public void playSituation(Ironman i, Human h) {
//		h.requestHelp(i);
//		i.attack();
//	}
}
