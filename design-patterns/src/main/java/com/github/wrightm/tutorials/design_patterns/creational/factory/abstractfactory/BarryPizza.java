package com.github.wrightm.tutorials.design_patterns.creational.factory.abstractfactory;

public class BarryPizza extends Pizza {

	public BarryPizza(ToppingFactory toppingFactory) {
		super(toppingFactory);
		name = "The Barry";
	}

}
