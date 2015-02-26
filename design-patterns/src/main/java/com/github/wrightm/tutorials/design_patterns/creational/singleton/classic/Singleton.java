package com.github.wrightm.tutorials.design_patterns.creational.singleton.classic;

public class Singleton {
	private static Singleton uniqueInstance;
	
	private Singleton(){
	}
	
	public static Singleton getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
	public String getDescription(){
		return "I am a Singleton That is not thread safe! Use me at your pearl!";
	}
}
