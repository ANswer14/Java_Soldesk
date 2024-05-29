package com.lyh.may233.game;

import com.beaver.may233.Avengers.Avengers;
import com.lyh.may233.avengers.Ironman;

public class Human {
	private String name;
	private Avengers hero;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	
	public Human(String name) {
		super();
		this.name = name;
		System.out.println(name);
	}


	public void printInfo() {
		System.out.print(name);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public void pick(Avengers a) {
		hero = a;
		System.out.println("등장");
	}
	
	public void requestHelp(/*Ironman i*/) {
		hero.attack();
//		System.out.printf("도와주세요 %s\n", i.getName());
	}
}
