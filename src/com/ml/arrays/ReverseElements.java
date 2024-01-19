package com.ml.arrays;

import java.util.Arrays;

public class ReverseElements {

	private static int[] reverseElements(int a[]) {
		int x[] = new int[a.length];
		int j = a.length-1;
		for(int i = 0; i<a.length; i++) {
				if(j>=0) {
					x[j] = a[i];
					j--;
				}
		}
		return x;
	}
	public static void main(String[] args) {
		int a[] = {1,2,5,4,9,3};
		Arrays.stream(a).forEach((i)->System.out.print(i+"  "));
		System.out.println("\n\n");
		int x[] = reverseElements(a);
		for(int i : x)
			System.out.print(i+"  ");
	}

}
