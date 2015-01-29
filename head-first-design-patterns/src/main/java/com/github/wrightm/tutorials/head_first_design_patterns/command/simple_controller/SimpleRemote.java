package com.github.wrightm.tutorials.head_first_design_patterns.command.simple_controller;

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