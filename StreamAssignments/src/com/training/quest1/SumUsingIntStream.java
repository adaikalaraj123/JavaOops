package com.training.quest1;

import java.util.stream.IntStream;

public class SumUsingIntStream {

	public static void main(String[] args) {
		int[] nums= {2,4,5,7,8};
		int sum = IntStream.of(nums).sum();
		System.out.println("Sum is:"+sum);
	}
}
