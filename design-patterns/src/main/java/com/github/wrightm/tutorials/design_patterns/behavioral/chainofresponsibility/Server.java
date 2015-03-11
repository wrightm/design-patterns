package com.github.wrightm.tutorials.design_patterns.behavioral.chainofcommand;

public class Server {

	public static void main(String[] args){
		EmailClient emailClient = new EmailClient();
		emailClient.emailRecieved(new Email());
	}
}
