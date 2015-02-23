package com.github.wrightm.tutorials.design_patterns.structural.decorator;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
	
	@Override
	public double cost() {
		return 0.99;
	}

}
