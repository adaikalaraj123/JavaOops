package com.shristi.arrays;

import java.util.Scanner;

public class DynArrScanner {
	public static void main(String[] args) {
		int[][] scores=new int[3][2];
		System.out.println(scores.length); //3
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Scores:");
		for(int i=0;i<scores.length;i++) {
			System.out.println("row "+i+" : ");
			for(int j=0;j<scores[i].length;j++) {
				scores[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter values are:");
		for(int[] score:scores) {
			for(int val:score) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
		System.out.println("static");
		int[][] marks=new int[3][2];
		System.out.println(marks.length); //3
		//Scanner sc = new Scanner(System.in);
		marks[0][0]=10;
		marks[0][1]=30;
		marks[1][0]=20;
		marks[1][1]=50;
		marks[2][0]=70;
		marks[2][1]=90;
		
		//System.out.println("Enter Marks:");
		for(int i=0;i<marks.length;i++) {
			for(int j=0;j<marks[i].length;j++) {
				//marks[i][j]=sc.nextInt();
				System.out.println(marks[i][j]);
			}
		}
		
		System.out.println("iteration");
		for(int[] mark:marks)
			for(int val:mark)
				System.out.println(val);
	}
}
