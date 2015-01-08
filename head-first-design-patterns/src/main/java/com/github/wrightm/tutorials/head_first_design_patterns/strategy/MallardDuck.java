package com.github.wrightm.tutorials.head_first_design_patterns.strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehaviour = new Fly();
		quackBehaviour = new Quack();
	}
	@Override
	public void display() {
		System.out.println("I am a Mallard!");
	}

}
