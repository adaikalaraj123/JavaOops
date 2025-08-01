package com.over.quest3;

public class ProcessMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Processor processor = new Processor();
		processor.calculate(25);
        processor.calculate(16.0);
        processor.calculate(6, 4);
        processor.calculate(10.5, 5.2);
        processor.calculate(2.0, 3); 
	}

}
