package BasicAssignments;

import java.util.Arrays;

public class SecondSmallestElement {

	public static void main(String[] args) {
		int arr[]= {12,33,43,1,6,34,22,56};
		System.out.println("given array is "+Arrays.toString(arr));
		int min = 0;
		int secondmin = 0;
		if(arr[0]<arr[1]) {
			min = arr[0];
			secondmin = arr[1];
		}else {
			min = arr[1];
			secondmin = arr[0];
		}
		for(int i=2;i<arr.length;i++) {
			if(arr[i]<min) {
				secondmin=min;
				min=arr[i];
			}else if(arr[i]<secondmin && arr[i]!=secondmin) {
				secondmin=arr[i];
			}
		}
		System.out.println("second Smallest value is "+secondmin);
	}

}
