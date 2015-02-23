package com.github.wrightm.tutorials.design_patterns.behavioral.strategy;

public class CantFly implements FlyBehaviour {

	public void fly() {
		System.out.println("FlyBehaviour: I can't fly dont push me!");
	}

}
