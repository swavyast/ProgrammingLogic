package com.ml.arrays;

public class FindElement {
	
	private static int checkIfPresent(int array[], int num) {
		int index = 0;
		for(int i = 1; i<array.length; i++) {
			if(array[i]==num) {
				index = i;
				break;
			}
		}
		return index;	
	}

	public static void main(String[] args) {
		int array [] = {5, 8, 1, 4, 9, 2, 6, 4, 3};
		int key = 3;
		int x = checkIfPresent(array, key);
		System.out.println(x);
	}
}
