package com.github.wrightm.tutorials.design_patterns.creational.factory.abstractfactory;

public class DavesPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		
		if(type.equals("The Big Dave")){
			return new DavePizza(new DavesToppingFactory());
		}
		return null;
	}

}
