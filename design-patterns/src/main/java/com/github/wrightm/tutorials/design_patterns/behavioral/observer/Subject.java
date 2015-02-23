package com.github.wrightm.tutorials.design_patterns.behavioral.observer;

public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
