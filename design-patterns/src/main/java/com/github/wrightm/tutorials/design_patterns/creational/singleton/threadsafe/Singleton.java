package com.github.wrightm.tutorials.design_patterns.creational.singleton.threadsafe;

public class Singleton {
	// instaniated when loaded not when first used
	private static Singleton singleton = new Singleton();
	
	private Singleton(){
	}
	
	public Singleton getInstance(){
		return singleton;
	}
	
	public String getDescription(){
		return "I am a thread safe singleton but I am instaniated on class loading!";
	}
}
