package com.shristi.arrays;

import java.util.Scanner;

public class TwoDimScanner {
	public static void main(String[] args) {
		int[][] scores=new int[3][];
		scores[0] = new int[3];
		scores[1] = new int[2];
		scores[2] = new int[4];
		scores[2][5]=45;
//		System.out.println(scores[3]);
//		System.out.println(scores.length); //3
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter Scores:");
//		for(int i=0;i<scores.length;i++) {
//			System.out.println("enter row value "+i+" : ");
//			for(int j=0;j<scores[i].length;j++) {
//				System.out.println("enter column value "+j+" : ");
//				scores[i][j]=sc.nextInt();
//			}
//		}
//		for(int[] score:scores) {
//			for(int val:score) {
//				System.out.print(val+" ");
//			}
//			System.out.println();
//		}
//		sc.close();
	}
}
