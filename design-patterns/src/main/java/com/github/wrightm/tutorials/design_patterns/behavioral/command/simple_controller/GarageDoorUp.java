package com.github.wrightm.tutorials.design_patterns.behavioral.command.simple_controller;

public class GarageDoorUp implements Command {

	private GarageDoor garageDoor;
	
	public GarageDoorUp(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	public void execute() {
		garageDoor.up();
	}

}
