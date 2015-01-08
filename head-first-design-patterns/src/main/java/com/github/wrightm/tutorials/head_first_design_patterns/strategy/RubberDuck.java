package com.github.wrightm.tutorials.head_first_design_patterns.strategy;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehaviour = new CantFly();
		quackBehaviour = new Squeak();
	}
	@Override
	public void display() {
		System.out.println("I am a Rubber Duck ;-D");
	}

}
