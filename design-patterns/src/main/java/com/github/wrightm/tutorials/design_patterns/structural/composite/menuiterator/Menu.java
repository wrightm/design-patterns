package com.github.wrightm.tutorials.design_patterns.structural.composite.menuiterator;

import java.util.Iterator;
import java.util.ArrayList;

public class Menu implements MenuComponent {

	private Iterator<MenuComponent> iterator = null;
	private ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	private final String name;
	private final String description;
	
	public Menu(final String name, final String description) {
		this.name = name;
		this.description = description;
	}
	
	@Override
	public void add(final MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}

	@Override
	public void remove(final MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}

	@Override
	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double getPrice() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Iterator<MenuComponent> createIterator() {
		if (iterator == null) {
			iterator = new CompositeIterator(menuComponents.iterator());
		}
		return iterator;
	}

	@Override
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
  
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			menuComponent.print();
		}
	}
	
	
}