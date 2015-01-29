package com.github.wrightm.tutorials.head_first_design_patterns.command.simple_controller;

public class LightOff implements Command {

	private Light light;
	
	public LightOff(Light light){
		this.light = light;
	}
	
	public void execute() {
		light.off();
	}
	
}
