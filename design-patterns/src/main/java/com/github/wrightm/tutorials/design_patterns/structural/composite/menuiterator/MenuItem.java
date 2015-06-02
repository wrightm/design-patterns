package com.github.wrightm.tutorials.design_patterns.structural.composite.menuiterator;

import java.util.Iterator;

public class MenuItem implements MenuComponent {

	private final String name;
	private final String description;
	private final boolean vegetarian;
	private final double price;
    
	public MenuItem(final String name, 
	                final String description, 
	                final boolean vegetarian, 
	                final double price) 
	{ 
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	@Override
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	@Override
	public MenuComponent getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		return description;
	}

	@Override
	public String getDescription() {
		return name;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public boolean isVegetarian() {
		return vegetarian;
	}

	@Override
	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}

	@Override
	public void print() {
		System.out.print("  " + getName());
		if (isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println("     -- " + getDescription());
	}
 
	

}

