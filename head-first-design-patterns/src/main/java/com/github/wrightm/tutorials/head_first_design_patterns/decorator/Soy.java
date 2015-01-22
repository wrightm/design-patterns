package com.github.wrightm.tutorials.head_first_design_patterns.decorator;

public class Soy extends CondimentDecorator {

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription();
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		if(beverage.getSize() == Size.TALL){
			return cost += 0.10;
		} else if(beverage.getSize() == Size.GRANDE){
			return cost += 0.15;
		} else if(beverage.getSize() == Size.VENTI){
			cost += 0.20;
		}
		return cost;
	}

}
