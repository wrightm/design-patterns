package com.github.wrightm.tutorials.head_first_design_patterns.factory.abstractfactory;

public class BarryPizza extends Pizza {

	public BarryPizza(ToppingFactory toppingFactory) {
		super(toppingFactory);
		name = "The Barry";
	}

}
