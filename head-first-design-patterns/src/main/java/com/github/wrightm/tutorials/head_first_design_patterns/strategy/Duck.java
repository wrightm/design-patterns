package com.github.wrightm.tutorials.head_first_design_patterns.strategy;

public abstract class Duck {

	protected FlyBehaviour flyBehaviour;
	protected QuackBehaviour quackBehaviour;
	
	public Duck(){
	}
	
	public void fly(){
		flyBehaviour.fly();
	}
	
	public final FlyBehaviour getFlyBehaviour(){
		return flyBehaviour;
	}
	 
	public void setFlyBehaviour(final FlyBehaviour flyBehaviour){
		this.flyBehaviour = flyBehaviour;
	}
	
	public void quack(){
		quackBehaviour.quack();
	}
	
	public final QuackBehaviour getQuackBehaviour(){
		return quackBehaviour;
	}
	
	public void setQuackBehaviour(final QuackBehaviour quackBehaviour){
		this.quackBehaviour = quackBehaviour;
	}
	
	abstract public void display();
}
