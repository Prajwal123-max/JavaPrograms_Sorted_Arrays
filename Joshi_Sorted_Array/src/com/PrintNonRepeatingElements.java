/*
 * Sample Input:-
 * Enter the size of Array:8
 * Enter the Elements:
 * 1 2 3 3 4 4 4 5
 * 
 * Sample Output:-
 * 1 2 5 
 * 
 */
package com;

import java.util.Scanner;

public class PrintNonRepeatingElements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array:");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		printNonRepeatingElements(ar);
	}
	public static void printNonRepeatingElements(int[] ar) {
		
		for(int i=0; i<ar.length; i++) {
			boolean notUnique=false;
			for(int j=0; j<ar.length; j++) {
				if(i!=j && ar[i]==ar[j]) {
					notUnique=true;
					break;
				}
			}
			if(!notUnique) {
				System.out.print(ar[i]+" ");
			}
		}
	}

}
