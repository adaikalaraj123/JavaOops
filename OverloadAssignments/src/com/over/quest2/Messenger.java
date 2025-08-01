package com.over.quest2;

public class Messenger {
	void sendMail(String message){// add simple print stmts
		System.out.println("Message:"+message); 
	}
	void sendMail(String tousername, String message){// add simple print stmts
		System.out.println("Tousername:"+tousername+", Message:"+message);
	} 
		 
	void sendMail(String tousername, String message,String subject){// add simple print stmts
		System.out.println("Tousername:"+tousername+", Message:"+message+", Subject:"+subject);
	}
}
