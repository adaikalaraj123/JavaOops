package com.training.question2;

public class PaymentOptions {
	void pay(double amount) {
		System.out.println("amount:"+amount);
	}
	void pay(long cardnumber, int cvv, double amount) {
		System.out.println("cardnumber:"+cardnumber+", cvv:"+cvv+", amount:"+amount);
	}
	void pay(String upiid,double amount){
		System.out.println("pay using gpay. UPIID:"+upiid+", amount:"+amount);
    }
	void pay(String bankname,String username,double amount){
	       // print "pay using netbanking " + amount +" for "+ username;
		System.out.println("bankname: "+bankname+", username:"+username+", amount:"+amount);
	}

}
