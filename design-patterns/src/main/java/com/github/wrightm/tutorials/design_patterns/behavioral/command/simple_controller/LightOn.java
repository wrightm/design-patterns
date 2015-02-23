package com.github.wrightm.tutorials.design_patterns.behavioral.command.simple_controller;

public class LightOn implements Command {

	private Light light;
	
	public LightOn(Light light){
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
