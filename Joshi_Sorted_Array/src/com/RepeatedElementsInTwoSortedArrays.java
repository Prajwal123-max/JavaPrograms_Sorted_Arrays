package com;

import java.util.Scanner;

public class RepeatedElementsInTwoSortedArrays {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENter the size of array1: ");
		int n1=s.nextInt();
		int[] ar1=new int[n1];
		System.out.println("Enter the ELements:");
		for(int i=0; i<ar1.length; i++) {
			ar1[i]=s.nextInt();
		}
		System.out.print("Enter the size of array2:");
		int n2=s.nextInt();
		int[] ar2=new int[n2];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar2.length; i++) {
			ar2[i]=s.nextInt();
		}
		repeatedElementsInTwoSortedArrays(ar1, ar2);
	}
	public static void repeatedElementsInTwoSortedArrays(int[] ar1,int[] ar2) {
		int i=0,j=0;
		boolean found=false;
		while(i<ar1.length && j<ar2.length) {
			if(ar1[i]==ar2[j]) {
				System.out.print(ar1[i]+" ");
				i++;
				j++;
				found=true;
			}else if(ar1[i]<ar2[j]) {
				i++;
			}else {
				j++;
			}
		}
		if(!found) {
			System.out.println("Not found");
		}
	}

}
