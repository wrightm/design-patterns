package com.github.wrightm.tutorials.head_first_design_patterns.command.simple_controller;

public class GarageDoorUp implements Command {

	private GarageDoor garageDoor;
	
	public GarageDoorUp(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	public void execute() {
		garageDoor.up();
	}

}
