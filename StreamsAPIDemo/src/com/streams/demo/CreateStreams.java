package com.streams.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams {
	public static void main(String[] args) {
		List<String> courses = Arrays.asList("Java","JSP","CSS","HTML","Spring","Java","Micro","Javascript");
		courses.stream().forEach(System.out::println);
		
		//Array
		Integer[] nums = new Integer[] {10, 12, 14, 16, 18};
		Stream.of(nums).forEach(System.out::println);
		
		//from primitive array
		int[] nums1 = {10, 11, 12, 13, 14, 15};
		Arrays.stream(nums1).forEach(System.out::println);
		
		Stream.generate(()->10).limit(5).forEach(System.out::println);
	}
}
