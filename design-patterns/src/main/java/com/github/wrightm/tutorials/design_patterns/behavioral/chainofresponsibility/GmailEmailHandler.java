package com.github.wrightm.tutorials.design_patterns.behavioral.chainofresponsibility;

public class GmailEmailHandler extends EmailHandler {

	EmailHandler handler;

	public void handleRequest(Email email) {
		if(email.getFrom().endsWith("Tony")){
			System.out.println("GmailEmailHandler");
			passToNextHandler(email);
		}
	}
	
}
