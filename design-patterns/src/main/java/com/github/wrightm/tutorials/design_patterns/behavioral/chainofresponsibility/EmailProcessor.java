package com.github.wrightm.tutorials.design_patterns.behavioral.chainofcommand;

public class EmailProcessor {

	EmailHandler prevHandler;
	EmailHandler firstHandler;
	
	public void addHandler(EmailHandler handler){
		if(prevHandler != null){
			prevHandler.setNext(handler);
		} else {
			firstHandler = handler;
		}
		prevHandler = handler;
	}
	
	public void handleRequest(Email email){
		firstHandler.handleRequest(email);
	}
}
