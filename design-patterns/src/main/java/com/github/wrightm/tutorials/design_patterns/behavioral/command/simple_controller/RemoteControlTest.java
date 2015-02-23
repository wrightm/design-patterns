package com.github.wrightm.tutorials.design_patterns.behavioral.command.simple_controller;

public class RemoteControlTest {
	
	public static void main(String[] args){
		
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		
		GarageDoorUp garageDoorUp = new GarageDoorUp(garageDoor);
		LightOn lightOn = new LightOn(light);
		LightOff lightOff = new LightOff(light);
		
		SimpleRemote simpleRemote = new SimpleRemote();
		simpleRemote.setCommand(garageDoorUp);
		simpleRemote.buttonWasPressed();
		simpleRemote.setCommand(lightOn);
		simpleRemote.buttonWasPressed();
		simpleRemote.setCommand(lightOff);
		simpleRemote.buttonWasPressed();
	}
}
