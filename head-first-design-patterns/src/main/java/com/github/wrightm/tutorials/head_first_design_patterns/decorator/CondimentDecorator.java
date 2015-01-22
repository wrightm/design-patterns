package com.github.wrightm.tutorials.head_first_design_patterns.decorator;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	
	public abstract String getDescription(); 
	public Size getSize(){
		return beverage.getSize();
	}
	
	

}
