package com.ml.arrays;

public class MergeAndSortArrays {

	public static void main(String[] args) {
		int a[] = { 3, 2, 1 };
		int b[] = { 4, 6, 5 };
		int res[] = mergeArrays(a, b);
		for (int i : res)
			System.out.print(i + "  ");
		System.out.println("\n\n");
		int sortedRes[] = MergeAndSortArrays.sortArray(res);
		for (int i : sortedRes)
			System.out.print(i + "  ");
		int index = getIndex(sortArray(mergeArrays(a, b)), 1);
		System.out.println("\n\n"+index);
	}

	private static int[] mergeArrays(int a[], int b[]) {
		int merged[] = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			merged[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			merged[a.length + i] = b[i];
		}
		return merged;
	}

	private static int getIndex(int a[], int b) {
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b)
				index = i;
		}

		return index;
	}

	public static int[] sortArray(int x[]) {
		for(int i = 0; i<x.length; i++) {
			for(int j=i+1; j<x.length; j++) {
				if(x[i]>x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		return x;
	}

}
