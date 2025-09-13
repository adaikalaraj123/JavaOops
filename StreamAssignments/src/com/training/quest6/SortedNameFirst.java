package com.training.quest6;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SortedNameFirst {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Raja","Roja","Alwin","Raja","Swamy","Sherin","Vijay","Ajith");
        Optional<String> firstName = names.stream()
                .distinct()
                .sorted()
                .findFirst();
        firstName.ifPresent(name -> System.out.println("First name: " + name));
	}

}
