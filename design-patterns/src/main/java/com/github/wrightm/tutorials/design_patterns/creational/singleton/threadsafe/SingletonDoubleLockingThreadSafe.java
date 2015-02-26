package com.github.wrightm.tutorials.design_patterns.creational.singleton.threadsafe;

public class SingletonDoubleLockingThreadSafe {

	private static SingletonDoubleLockingThreadSafe singletonDoubleLockingThreadSafe;
	
	private SingletonDoubleLockingThreadSafe(){
	}
	
	public static SingletonDoubleLockingThreadSafe getInstance(){
		if(singletonDoubleLockingThreadSafe == null){
			synchronized (SingletonDoubleLockingThreadSafe.class) {
				if(singletonDoubleLockingThreadSafe == null){
					singletonDoubleLockingThreadSafe = new SingletonDoubleLockingThreadSafe();
				}
			}
		}
		return singletonDoubleLockingThreadSafe;
	}
	
	public String getDescription(){
		return "I am a less expensive double locking thread";
	}
	
}
