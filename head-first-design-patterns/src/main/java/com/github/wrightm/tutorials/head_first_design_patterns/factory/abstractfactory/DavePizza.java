package com.github.wrightm.tutorials.head_first_design_patterns.factory.abstractfactory;

public class DavePizza extends Pizza {

	public DavePizza(ToppingFactory toppingFactory) {
		super(toppingFactory);
		name = "The Big Dave";
	}

}
