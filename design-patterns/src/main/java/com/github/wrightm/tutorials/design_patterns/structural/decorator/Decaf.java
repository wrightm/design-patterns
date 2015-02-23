package com.github.wrightm.tutorials.design_patterns.structural.decorator;

public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf Coffee";
	}
	
	@Override
	public double cost() {
		return 1.05;
	}

}
