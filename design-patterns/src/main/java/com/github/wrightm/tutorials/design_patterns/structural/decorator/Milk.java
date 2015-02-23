package com.github.wrightm.tutorials.design_patterns.structural.decorator;

public class Milk extends CondimentDecorator {

	public Milk(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.10;
	}

}
