package com.github.wrightm.tutorials.design_patterns.structural.composite.menuiterator;

import java.util.Iterator;
  
public class NullIterator implements Iterator<MenuComponent> {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public MenuComponent next() {
		return null;
	}	
}
