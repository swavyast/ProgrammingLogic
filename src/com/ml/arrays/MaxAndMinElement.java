package com.ml.arrays;

public class MaxAndMinElement {
	
	//with help of sorting
	
	private static int findMinElement(int array[]) {
		sortArray(array);
		return array[0];
	}
	
	private static int findMaxElement(int array[]) {
		sortArrayDesc(array);
		return array[0];
	}
	
	private static int[] sortArray(int array[]) { //ascending order
		for(int i = 0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i]>array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
	
	private static int[] sortArrayDesc(int array[]) { //descending order
		for(int i = 0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i]<array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
	
	//without sorting
	
	private static int maxElement(int array[]) {
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		for(int i:array) {
			if(i<max&&i>min) {
				min = max;
				max = i;
			}
		}
		
		return max;
	}
	
	private static int secondMax(int array[]) {
		int secondMax = 0;
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		for(int i=0; i<array.length; i++) {
				if(array[i]>min&&array[i]<max) {
					min = secondMax;
					secondMax = array[i];
			}
		}
		return secondMax;
	}
	
	private static int minElement(int array[]) {
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		for(int i : array) {
			if(i>min&&i<max) {
				min = max;
				max = i;
			}
		}
		return min;
	} 

	public static void main(String[] args) {
	int a [] = {5, 6, 1, 2, 65, 6, 7, 8, 9, 3};
	int min = findMinElement(a);
	System.out.println(min);
	int max = findMaxElement(a);
	System.out.println(max);
	int ar [] = sortArray(a);
	for(int i : ar)
		System.out.print(i+ "  ");
	System.out.println("\n");
	int ar1 [] = sortArrayDesc(a);
	for(int i : ar1)
		System.out.print(i+ "  ");
	System.out.println("\n\n");
	int sMax = secondMax(a);
	System.out.println(sMax);
	
	int max1 = maxElement(a);
	System.out.println(max1);
	int min1 = maxElement(a);
	System.out.println(min1);
	}
}
