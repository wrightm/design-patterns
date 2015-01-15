package com.github.wrightm.tutorials.head_first_design_patterns.factory.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class DavesToppingFactory implements ToppingFactory {
	
	public List<Topping> createToppings(){
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(new Cheese());
		toppings.add(new Tomatoes());
		toppings.add(new Mushrooms());
		return toppings;
	}

}
