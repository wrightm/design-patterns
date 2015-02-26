package com.github.wrightm.tutorials.design_patterns.creational.singleton.classic;

public class SingletonClient {
	public static void main(String[] args){
		final Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getDescription());
	}
}
