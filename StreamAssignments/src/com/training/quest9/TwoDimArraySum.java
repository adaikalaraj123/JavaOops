package com.training.quest9;

import java.util.Arrays;

public class TwoDimArraySum {

	public static void main(String[] args) {
		int[][] nums= {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		int sum = Arrays.stream(nums)
				.flatMapToInt(Arrays::stream)
				.sum();
		System.out.println("Sum of all numbers: " +sum);
		
		for (int i = 0; i < nums.length; i++) {
		    int rowSum = Arrays.stream(nums[i]).sum();
		    System.out.println("Sum of row " + (i+1) + ": " + rowSum);
		}
	}
}
