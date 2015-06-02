package com.github.wrightm.tutorials.design_patterns.behavioral.chainofresponsibility;

public class EmailClient {

	private EmailProcessor emailProcessor;
	
	public EmailClient() {
		createProcess();
	}
	
	private void createProcess(){
		emailProcessor = new EmailProcessor();
		emailProcessor.addHandler(new BusinessEmailHandler());
		emailProcessor.addHandler(new GmailEmailHandler());
	}
	
	public void addRule(EmailHandler handler){
		emailProcessor.addHandler(handler);
	}
	
	public void  emailRecieved(Email email){
		emailProcessor.handleRequest(email);
	}
}
