package com.github.wrightm.tutorials.design_patterns.structural.composite.menuiterator;

import java.util.*;

public interface MenuComponent {
   
	public void add(MenuComponent menuComponent);
	
	public void remove(MenuComponent menuComponent);
	
	public MenuComponent getChild(int i);
  
	public String getName();
	
	public String getDescription();
	
	public double getPrice();
	
	public boolean isVegetarian();
	
	public Iterator<MenuComponent> createIterator();
	 
	public void print();

}
