package com.github.wrightm.tutorials.head_first_design_patterns.decorator;

public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf Coffee";
	}
	
	@Override
	public double cost() {
		return 1.05;
	}

}
