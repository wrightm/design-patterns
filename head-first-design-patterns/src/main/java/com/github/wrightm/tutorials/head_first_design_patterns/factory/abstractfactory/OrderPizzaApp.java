package com.github.wrightm.tutorials.head_first_design_patterns.factory.abstractfactory;

public class OrderPizzaApp {
	
	static public void main(String[] args){
		PizzaStore barryPizzaStore = new BarryPizzaStore();
		barryPizzaStore.orderPizza("The Barry").toString();
		
		PizzaStore davePizzaStore = new DavesPizzaStore();
		davePizzaStore.orderPizza("The Big Dave").toString();
	}

}
