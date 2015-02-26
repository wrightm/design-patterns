package com.github.wrightm.tutorials.design_patterns.creational.singleton.threadsafe;

public class SingletonExpensiveThreadSafe {
	private static SingletonExpensiveThreadSafe uniqueInstance;
 
	// other useful instance variables here
 
	private SingletonExpensiveThreadSafe() {}

	public static synchronized SingletonExpensiveThreadSafe getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonExpensiveThreadSafe();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
	public String getDescription() {
		return "I'm a thread safe but expensive Singleton!";
	}
}
