package com.github.wrightm.tutorials.design_patterns.behavioral.observer;

public interface Observer {
	public void update(final float temp, final float humidity, final float pressure);
}
