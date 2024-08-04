/*
 * Array1 Sorted in Asscending order.
 * Array2 Sorted in Descending order.
 * 
 * sample input:
 * Enter the size of Array1:8
 * Enter the Elements:
 * 1 3 5 7 9 11 13 15
 * Enter the size of Array2:6
 * Enter the Elements:
 * 15 13 11 9 7 5
 * 
 * Sample output:-
 * 5 7 9 11 13 15
 */
package com;

import java.util.Scanner;

public class RepeatedElementsInTwoDifferentlySortedArrays {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array1:");
		int n1=s.nextInt();
		int[] ar1=new int[n1];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar1.length; i++) {
			ar1[i]=s.nextInt();
		}
		System.out.print("Enter the size of Array2:");
		int n2=s.nextInt();
		int[] ar2=new int[n2];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar2.length; i++) {
			ar2[i]=s.nextInt();
		}
		repeatedElementsInTwoSortedArray(ar1, ar2);
	}
	public static void repeatedElementsInTwoSortedArray(int[] ar1,int[] ar2) {
		int i=0;
		int j=ar2.length-1;
		boolean found=false;
		while(i<ar1.length && j>=0) {
			if(ar1[i]==ar2[j]) {
				System.out.print(ar1[i]+" ");
				found=true;
				i++;
				j--;
			}else if(ar1[i]<ar2[j]) {
				i++;
			}else {
				j--;
			}
		}
		if(!found) {
			System.out.println("Not found");
		}
	}

}
