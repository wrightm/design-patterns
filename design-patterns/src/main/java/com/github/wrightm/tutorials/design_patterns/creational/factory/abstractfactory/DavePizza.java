package com.github.wrightm.tutorials.design_patterns.creational.factory.abstractfactory;

public class DavePizza extends Pizza {

	public DavePizza(ToppingFactory toppingFactory) {
		super(toppingFactory);
		name = "The Big Dave";
	}

}
