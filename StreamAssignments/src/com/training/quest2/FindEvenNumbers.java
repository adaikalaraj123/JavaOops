package com.training.quest2;

import java.util.stream.IntStream;

public class FindEvenNumbers {

	public static void main(String[] args) {
		System.out.println("Even number from 1 to 100 are:");
		IntStream.rangeClosed(1, 100)
		.filter(num->num%2==0)
		.forEach(num->System.out.print(num+" "));
	}

}
