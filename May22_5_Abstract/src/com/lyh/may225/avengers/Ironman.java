package com.lyh.may225.avengers;

import com.lyh.may225.driver.Driver;
import com.lyh.may225.smoker.Smoker;

public class Ironman extends Avengers implements Smoker, Driver{
	private int budget;
	
	public Ironman() {
		// TODO Auto-generated constructor stub
	}
	
	

	
	public Ironman(String name, int age, int budget) {
		super(name, age);
		this.budget = budget;
	}




	public int getBudget() {
		return budget;
	}


	public void setBudget(int budget) {
		this.budget = budget;
	}


	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(budget);
	}
	
	@Override
	public void attack() {
		System.out.println("빔");
	}
	@Override
	public void drive() {
		System.out.println("운전 O");
	}
	@Override
	public void smoke() {
		System.out.println("흡연 O");
	}
	
}
