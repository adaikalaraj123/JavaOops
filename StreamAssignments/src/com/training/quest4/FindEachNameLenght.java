package com.training.quest4;

import java.util.Arrays;
import java.util.List;

public class FindEachNameLenght {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Raja","Roja","Alwin","Raja","Swamy","Sherin","Vijay","Ajith");
		names.stream()
		.map(String::length)
		.forEach(System.out::println);
		
		System.out.println();
		
		names.stream()
	     .forEach(name -> System.out.println(name + " -> " + name.length()));
	}

}
