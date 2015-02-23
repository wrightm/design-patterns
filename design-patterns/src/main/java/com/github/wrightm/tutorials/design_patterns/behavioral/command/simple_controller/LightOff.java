package com.github.wrightm.tutorials.design_patterns.behavioral.command.simple_controller;

public class LightOff implements Command {

	private Light light;
	
	public LightOff(Light light){
		this.light = light;
	}
	
	public void execute() {
		light.off();
	}
	
}
