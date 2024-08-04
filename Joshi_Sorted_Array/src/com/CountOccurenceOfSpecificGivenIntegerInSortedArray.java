/*
 * Sample input:-
 * Enter the size of Array:8
 * Enter the Elements:
 * 1 2 3 3 4 5 5 6
 * Enter the value which you wnat to find:6
 * 
 * Sample Output:-
 * 1
 */
package com;

import java.util.Scanner;

public class CountOccurenceOfSpecificGivenIntegerInSortedArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array:");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		System.out.print("Enter the value which you wnat to find:");
		int k=s.nextInt();
		
		countOccurence(ar, k);
	}
	public static void countOccurence(int[] ar,int k) {
		int count=0;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]==k) {
				count++;
			}
		}
		System.out.println(count);
	}

}
