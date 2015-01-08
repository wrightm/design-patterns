package com.github.wrightm.tutorials.head_first_design_patterns.strategy;

import java.util.ArrayList;

public class DuckApp {

	public static void main(String[] args){
		
		ArrayList<Duck> ducks = new ArrayList<Duck>();
		ducks.add(new MallardDuck());
		ducks.add(new RubberDuck());
		
		for (Duck duck : ducks) {
			duck.display();
			duck.fly();
			duck.quack();
		}
		
	}
}
