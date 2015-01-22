package com.github.wrightm.tutorials.head_first_design_patterns.decorator;

import com.github.wrightm.tutorials.head_first_design_patterns.decorator.Beverage.Size;

public class Starbucks {

	static public void main(String[] args){
		
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()+ " $" + String.format("%.2f", beverage.cost()));
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Milk(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " $" + String.format("%.2f", beverage2.cost()));
		
		Beverage beverage3 = new HouseBlend();
		beverage3.setSize(Size.VENTI);
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Milk(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " $" + String.format("%.2f", beverage3.cost()));
		
	}
}
