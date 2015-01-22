package com.github.wrightm.tutorials.head_first_design_patterns.decorator;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
	
	@Override
	public double cost() {
		return 0.99;
	}

}
