package com.github.wrightm.tutorials.head_first_design_patterns.factory.abstractfactory;

public class BarryPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		
		if(type.equals("The Barry")){
			return new BarryPizza(new BarryToppingFactory());
		} 
		return null;
	
	}

}
