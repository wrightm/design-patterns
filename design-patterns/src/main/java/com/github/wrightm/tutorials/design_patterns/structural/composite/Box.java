package com.github.wrightm.tutorials.design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box extends Entity {

	private final List children = new ArrayList();
	private final int value;
	
	public Box(final int value){
		this.value = value;
	}
	
	public void add(Entity c) {
		children.add(c);
	}
	
	@Override
	public void transverse() {
		System.out.println(indent.toString() + value);
		indent.append("   ");
		for(int i=0; i < children.size(); i++){
			((Entity)children.get(i)).transverse();
		}
		indent.setLength(indent.length() - 3);
	}

}