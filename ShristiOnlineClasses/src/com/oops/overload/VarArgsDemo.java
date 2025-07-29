package com.oops.overload;

public class VarArgsDemo {
	public static void main(String[] args) {
		sum();
		sum(10,20);
		sum(10,20,30,40);
		sum(10,20,40);
	}
	
	static void sum(int x, int y) {
		System.out.println(x*y);
	}
	static void sum(int... marks) {
		System.out.println(marks.length);
		int sum=0;
		for(int mark:marks) {
			sum+=mark;
		}
		System.out.println(sum);
	}
}