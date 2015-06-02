package com.github.wrightm.tutorials.design_patterns.behavioral.chainofresponsibility;

public abstract class EmailHandler {
	
	private EmailHandler handler;
	
	public void setNext(EmailHandler handler){
		this.handler = handler;
	}
	
	public void passToNextHandler(Email email){
		if(handler != null){
			handler.handleRequest(email);
		}
	}
	
	public abstract void handleRequest(Email email);
}
