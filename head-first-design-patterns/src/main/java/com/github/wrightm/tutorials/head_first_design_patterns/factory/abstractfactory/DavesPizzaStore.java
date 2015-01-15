package com.github.wrightm.tutorials.head_first_design_patterns.factory.abstractfactory;

public class DavesPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		
		if(type.equals("The Big Dave")){
			return new DavePizza(new DavesToppingFactory());
		}
		return null;
	}

}
