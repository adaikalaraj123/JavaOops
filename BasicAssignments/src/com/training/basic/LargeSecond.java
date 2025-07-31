package com.training.basic;

import java.util.Arrays;

public class LargeSecond {

	public static void main(String[] args) {
		int arr[]= {12,33,43,1,6,34,22,56};
		System.out.println("given array is "+Arrays.toString(arr));
		int max = 0;
		int secondmax = 0;
		if(arr[0]>arr[1]) {
			max = arr[0];
			secondmax = arr[1];
		}else {
			max = arr[1];
			secondmax = arr[0];
		}
		for(int i=2;i<arr.length;i++) {
			if(arr[i]>max) {
				secondmax=max;
				max=arr[i];
			}else if(arr[i]<secondmax && arr[i]!=secondmax) {
				secondmax=arr[i];
			}
		}
		System.out.println("second Smallest value is "+secondmax);
	}

}
