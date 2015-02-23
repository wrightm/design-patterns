package com.github.wrightm.tutorials.design_patterns.creational.factory.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class BarryToppingFactory implements ToppingFactory {

	public List<Topping> createToppings() {
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(new Cheese());
		toppings.add(new Tomatoes());
		return toppings;
	}

}
