package com.shristi.arrays;

public class OneDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[5];
		System.out.println(nums.length);
		nums[0]=100;
		nums[1]=90;
		nums[2]=80;
		nums[3]=70;
		System.out.println(nums[3]);
		System.out.println("Iterate & Print");
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
		}
		System.out.println("sum:"+sum);
		for(int num:nums)
			sum+=num;
		
		System.out.println("sum:"+sum);

	}

}
