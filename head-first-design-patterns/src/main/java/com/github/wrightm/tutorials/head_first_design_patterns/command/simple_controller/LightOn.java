package com.github.wrightm.tutorials.head_first_design_patterns.command.simple_controller;

public class LightOn implements Command {

	private Light light;
	
	public LightOn(Light light){
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
