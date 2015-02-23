package com.github.wrightm.tutorials.design_patterns.behavioral.command.simple_controller;

//
// Invoker
//
public class SimpleRemote {

	Command slot;
	
	public SimpleRemote(){
	}
	
	public void setCommand(Command command){
		slot = command;
	}
	
	public void buttonWasPressed(){
		slot.execute();
	}
}