package com.github.wrightm.tutorials.head_first_design_patterns.factory.abstractfactory;

import java.util.List;

public interface ToppingFactory {
	
	public List<Topping> createToppings();

}
