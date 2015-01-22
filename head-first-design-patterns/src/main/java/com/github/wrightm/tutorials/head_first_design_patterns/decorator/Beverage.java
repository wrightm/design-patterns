package com.github.wrightm.tutorials.head_first_design_patterns.decorator;

public abstract class Beverage {
	public enum Size { TALL, GRANDE, VENTI};
	Size size = Size.TALL;
	String description = "Unknown Beverage";
	
	public String getDescription(){
		return description;
	}
	
	public void setSize(Size size){
		this.size = size;
	}
	
	public Size getSize(){
		return this.size;
	}
	public abstract double cost();
}
