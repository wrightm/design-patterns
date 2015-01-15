package com.github.wrightm.tutorials.head_first_design_patterns.factory.abstractfactory;

public abstract class PizzaStore {
	
	protected abstract Pizza createPizza(String type);
	
	public Pizza orderPizza(String type){
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a "+ pizza.getName()+"---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.bake();
		return pizza;
	}

}
