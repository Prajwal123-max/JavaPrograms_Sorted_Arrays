package com;

import java.util.Scanner;

public class FirstElementNOtInSortingOrder {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array:");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		int res=firstElementNotInSortingOrder(ar);
		if(res==-1) {
			System.out.println("not found");
		}else {
			System.out.println(res);
		}
	}
	public static int firstElementNotInSortingOrder(int[] ar) {
		for(int i=0; i<ar.length-1; i++) {
			if(ar[i]>ar[i+1]) {
				return ar[i+1];
			}
		}
		return -1;
	}

}
