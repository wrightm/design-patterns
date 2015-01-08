package com.github.wrightm.tutorials.head_first_design_patterns.strategy;

public class CantFly implements FlyBehaviour {

	public void fly() {
		System.out.println("FlyBehaviour: I can't fly dont push me!");
	}

}
