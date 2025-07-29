package BasicAssignments;

import java.util.Arrays;

public class SumAndAvgOfArray {

	public static void main(String[] args) {
		int[] arr = {12,34,23,66,78};
		System.out.println("Given Array is "+Arrays.toString(arr));
		int sum=0, avg;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Addition of array value is:"+sum);
		System.out.println("Average of array value is:"+sum/arr.length);
	}

}
