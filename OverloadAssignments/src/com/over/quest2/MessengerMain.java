package com.over.quest2;

public class MessengerMain {

	public static void main(String[] args) {
		Messenger messenger = new Messenger();
		messenger.sendMail("Hello! This is a general notification.");

        messenger.sendMail("john@example.com", "Hi John, your report is due tomorrow.");

        messenger.sendMail("sara@example.com", "Meeting is scheduled at 3 PM", "Team Meeting");
	}

}
