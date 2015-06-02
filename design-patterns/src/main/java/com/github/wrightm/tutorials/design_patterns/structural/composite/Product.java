package com.github.wrightm.tutorials.design_patterns.structural.composite;

public class Product extends Entity {
	private final int value;
	public Product(final int value) {
		this.value = value;
	}
	@Override
	public void transverse() {
		System.out.println(indent.toString() + value);
	}

}
