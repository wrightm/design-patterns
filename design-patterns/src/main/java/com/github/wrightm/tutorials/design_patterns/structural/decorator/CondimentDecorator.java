package com.github.wrightm.tutorials.design_patterns.structural.decorator;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	
	public abstract String getDescription(); 
	public Size getSize(){
		return beverage.getSize();
	}
	
	

}
