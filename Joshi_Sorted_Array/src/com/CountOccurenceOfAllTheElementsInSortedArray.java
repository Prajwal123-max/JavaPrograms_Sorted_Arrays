package com;

import java.util.Scanner;

public class CountOccurenceOfAllTheElementsInSortedArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array:");
		int n= s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		occurenceOfEachElements(ar);
	}
	public static void occurenceOfEachElements(int[] ar) {
		int count=1;
		for(int i=0; i<ar.length-1; i++) {
			if(ar[i]==ar[i+1]) {
				count++;
			}else {
				System.out.println(ar[i]+"->"+count);
				count=1;
			}
		}
		System.out.println(ar[ar.length-1]+"->"+count);
	}

}
