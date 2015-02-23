package com.github.wrightm.tutorials.design_patterns.creational.factory.abstractfactory;

public class OrderPizzaApp {
	
	static public void main(String[] args){
		PizzaStore barryPizzaStore = new BarryPizzaStore();
		barryPizzaStore.orderPizza("The Barry").toString();
		
		PizzaStore davePizzaStore = new DavesPizzaStore();
		davePizzaStore.orderPizza("The Big Dave").toString();
	}

}
