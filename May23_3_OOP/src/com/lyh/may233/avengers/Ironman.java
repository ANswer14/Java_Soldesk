package com.lyh.may233.avengers;

import com.beaver.may233.Avengers.Avengers;

public class Ironman implements Avengers {
	String name;

	public Ironman() {
		// TODO Auto-generated constructor stub
	}

	public Ironman(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void attack() {
		System.out.println("빔");
	}

}
