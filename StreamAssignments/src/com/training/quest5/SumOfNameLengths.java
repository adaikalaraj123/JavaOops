package com.training.quest5;

import java.util.Arrays;
import java.util.List;

public class SumOfNameLengths {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Raja","Roja","Alwin","Raja","Swamy","Sherin","Vijay","Ajith");
		int totalLength = names.stream()
				.mapToInt(String::length)
				.sum();
		System.out.println("Total length of all names: " + totalLength);
	}

}
