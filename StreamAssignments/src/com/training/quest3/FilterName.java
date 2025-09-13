package com.training.quest3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterName {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Raja","Roja","Alwin","Raja","Swamy","Sherin","Vijay","Ajith");
		List<String> result = names.stream()
				.distinct()
				.filter(name->name.startsWith("S"))
				.collect(Collectors.toList());
		
		System.out.println("list of names with removed duplicates and names starting with S :"+ result);
	}

}
