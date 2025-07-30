package com.training.question4;

public class TicketBooking {
	void bookingDetails(String busName, String destination, String source, String... passengerNames ){
		System.out.println("busName:"+busName);
		System.out.println("destination:"+destination);
		System.out.println("source:"+source);
		System.out.println("passengerNames:");
		for (String passengerName : passengerNames) {
		     System.out.println("- " + passengerName);
		 }
	}

}
