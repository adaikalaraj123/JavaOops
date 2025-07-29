package com.oops.overload;

public class Shape {
	void area(int x) {
		System.out.println("sq"+(x+x));
	}
	void area(float x) {
		System.out.println("Circle "+(Math.PI*x*x));
	}
	int area(int x, int y) {
		return x*y;
	}
	double area(int x, float y){
		return 0.5*x*y;
	}
}
