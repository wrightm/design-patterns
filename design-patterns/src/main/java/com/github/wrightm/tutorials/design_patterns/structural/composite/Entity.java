package com.github.wrightm.tutorials.design_patterns.structural.composite;

abstract class Entity {
	protected StringBuffer indent = new StringBuffer();
	public abstract void transverse();
}
