/*
 * Sample Input:-
 * Enter the size of Array:5
 * Enter the Elements:
 * 1 2 3 3 5
 * 
 * Sample Output:-
 * 3
 * 
 */
package com;

import java.util.Scanner;

public class LargestRepeatedElement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array:");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		largestRepeatedElement(ar);
	}
	public static void largestRepeatedElement(int[] ar) {
		boolean found=false;
		for(int i=ar.length-1; i>=1; i--) {
			if(ar[i]==ar[i-1]) {
				found=true;
				System.out.println(ar[i]);
				break;
			}
		}
		if(!found) {
			System.out.println("Not found");
		}
	}

}
