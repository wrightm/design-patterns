package com.github.wrightm.tutorials.design_patterns.structural.composite;

// 1. lowest common denominator
interface Component {
	void transverse(); 
}

// 2. Isa relationship
class Primitive implements Component {
	private final int value;
	public Primitive(final int value) { 
		this.value = value;
	}
	public void transverse() {
		System.out.println(value + " ");
	}
}

// 2. Isa relationship
// 3. Couple to interface
abstract class Composite implements Component {
	private Component[] children = new Component[9];
	private int total = 0;
	private int value;
	
	public Composite(int value){
		this.value = value;
	}
	public void add(Component c){ // 3. Couple to interface
		children[total++] = c;
	}
	public void traverse(){
		System.out.print( value + " ");
		for(int i=0; i<total; i++){
			children[i].transverse(); // 4. Delegation and polymorphism.
		}
	}
}

class Row extends Composite {
	public Row(int value){
		super(value);
	}

	public void transverse() {
		System.out.print("Row");
		super.traverse();
	}
}

class Column extends Composite {
	public Column(int value){
		super(value);
	}
	public void transverse() {
		System.out.print("Col");
		super.traverse();
	}
}

public class CompositeDemo {
	public static void main( String[] args ) {
	  Composite first  = new Row( 1 );          // Row1
	  Composite second = new Column( 2 );       //   |
	  Composite third  = new Column( 3 );       //   +-- Col2
	  Composite fourth = new Row( 4 );          //   |     |
	  Composite fifth  = new Row( 5 );          //   |     +-- 7
	  first.add( second );                      //   +-- Col3
	  first.add( third  );                      //   |     |
	  third.add( fourth );                      //   |     +-- Row4
	  third.add( fifth  );                      //   |     |     |
	  first.add(  new Primitive( 6 ) );         //   |     |     +-- 9
	  second.add( new Primitive( 7 ) );         //   |     +-- Row5
	  third.add(  new Primitive( 8 ) );         //   |     |     |
	  fourth.add( new Primitive( 9 ) );         //   |     |     +-- 10
	  fifth.add(  new Primitive(10 ) );         //   |     +-- 8
	  first.traverse();                         //   +-- 6
	}  
}