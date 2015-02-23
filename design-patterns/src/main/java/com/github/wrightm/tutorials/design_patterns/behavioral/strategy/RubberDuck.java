package com.github.wrightm.tutorials.design_patterns.behavioral.strategy;

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
