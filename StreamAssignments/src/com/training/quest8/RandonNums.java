package com.training.quest8;

import java.util.stream.Stream;

public class RandonNums {

	public static void main(String[] args) {
		Stream.generate(Math::random)
        .limit(5)
        .forEach(System.out::println);
	}

}
