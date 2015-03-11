package com.github.wrightm.tutorials.design_patterns.behavioral.chainofcommand;

public class BusinessEmailHandler extends EmailHandler {

	EmailHandler handler;

	public void handleRequest(Email email) {
		if(email.getFrom().endsWith("Tony")){
			System.out.println("BusinessEmailHandler");
			passToNextHandler(email);
		}
	}

}
