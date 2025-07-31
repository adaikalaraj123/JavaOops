package com.training.basic;

import java.util.Arrays;

public class Smaller {

	public static void main(String[] args) {
		int[] arr= {3,46,33,4,22,43,98,43};
		System.out.println("given array is:"+Arrays.toString(arr));
		int smallest = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("Smallest Element in the array is "+smallest);
	}

}
