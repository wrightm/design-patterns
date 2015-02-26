package com.github.wrightm.tutorials.design_patterns.creational.singleton.threadsafe;

public class SingletonClient {
	public static void main(String[] args) {
		SingletonExpensiveThreadSafe singleton = SingletonExpensiveThreadSafe.getInstance();
		System.out.println(singleton.getDescription());
	}
}
