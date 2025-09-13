package com.streams.demo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InStreams1 {
	public static void main(String[] args) {
		//Consumer<String> consumer = (str)->System.out.println(str);
		//Predicate<String> pred = (str)->str.length()>3;
		List<String> courses = Arrays.asList("Java","JSP","CSS","HTML","Spring","Java","Micro","JS");
		// convert to stream
		// Stream<String> st = courses.stream();
		// System.out.println(st);
		//courses.stream().filter(pred);
		//courses.stream().filter(str->str.length()>3).forEach(consumer);
		courses.stream()
			.filter(str->str.length()>3)
			.sorted()
			.forEach(str->System.out.println(str.toUpperCase()));
			//.forEach(System.out::println);
		System.out.println();
		List<String> ncourses = courses.stream()
				.filter(str->str.length()>3)
				//.sorted() //asc
				.sorted((s1,s2)->s2.compareTo(s1))
				//.limit(3)
				.skip(3) //skip first 3 
				.distinct() //remove dupliate
				//.toList()
				.collect(Collectors.toList());
				ncourses.forEach(System.out::println);
				
		System.out.println();

		courses.stream()
		.filter(str->str.startsWith("J"))
		//.map(str->str.toUpperCase())
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
		System.out.println();
		
		Iterator<Integer> it = courses.stream()
		.filter(str->str.startsWith("J"))
		.map(String::length)
		//.forEach(System.out::println);
		.iterator();
		//iterate & Print
		while(it.hasNext()) {
			Integer in = it.next();
			System.out.println(in);
		}
	}
}
