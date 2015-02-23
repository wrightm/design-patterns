package com.github.wrightm.tutorials.design_patterns.creational.factory.abstractfactory;

public class BarryPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		
		if(type.equals("The Barry")){
			return new BarryPizza(new BarryToppingFactory());
		} 
		return null;
	
	}

}
