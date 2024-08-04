/*
 * Sample Input:-
 * Enter the Size of Array:5
 * Enter the Elements:
 * 1 2 3 3 5
 * 
 * Sample Output:-
 * 1->1
 * 
 */
package com;

import java.util.Scanner;

public class CountOccurenceOfTheSmallestElementInSortedArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Size of Array:");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		countOccurenceOfSmallestElementInSortedArray(ar);
	}
	public static void countOccurenceOfSmallestElementInSortedArray(int[] ar) {
		int count=0;
		for(int i=0; i<ar.length; i++) {
			if(ar[0]==ar[i]) {
				count++;
			}
		}
		System.out.print(ar[0]+"->"+count);
	}

}
