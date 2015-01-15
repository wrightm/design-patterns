package com.github.wrightm.tutorials.head_first_design_patterns.factory.abstractfactory;

import java.util.List;

abstract public class Pizza {
	protected String name;
	protected String dough;
	protected String sauce;
	protected List<Topping> toppings;
	
	public Pizza(ToppingFactory toppingFactory){
		toppings = toppingFactory.createToppings();
	}
	
	public String getName(){
		return name;
	}
	
	public void prepare(){
		System.out.println("Preparing: "+ name);
	}
	
	public void bake(){
		System.out.println("Baking: "+ name);
	}
	
	public void cut(){
		System.out.println("Cuttin: "+ name);
	}
	
	public void box(){
		System.out.println("Boxing: "+ name);
	}
	
	public String toString(){
		StringBuilder display = new StringBuilder();
		display.append("----"+name+"----\n");
		display.append(dough+"\n");
		display.append(sauce + "\n");
		for(Topping topping: toppings){
			display.append(topping + "\n");
		}
		return display.toString();
	}
}
