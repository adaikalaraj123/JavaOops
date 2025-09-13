package com.training.quest7;

import java.util.stream.Stream;

public class SumNumbersAsString {

	public static void main(String[] args) {
		String[] nums= {"2","5","8","23","12"};
		int sum = Stream.of(nums)
				.mapToInt(Integer::parseInt)
				.sum();
		System.out.println("Sum of nums:"+sum);
	}

}
