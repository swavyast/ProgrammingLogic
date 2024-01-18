package com.ml.arrays;

public class MergeAndSortArrays {

	public static void main(String[] args) {
		int a[] = { 3, 2, 1 };
		int b[] = { 4, 6, 5 };
		int res[] = MergeAndSortArrays.mergeArrays(a, b);
		for (int i : res)
			System.out.print(i + "  ");
		System.out.println("\n\n");
		System.out.println(res.length);
		int sortedRes[] = MergeAndSortArrays.sortArray(res);
		for (int i : sortedRes)
			System.out.print(i + "  ");

		System.out.println("\n" + res[5]);
		/*
		 * System.out.println(); int res3[] =
		 * MergeAndSortArrays.sortArrayUsingWhileLoop(res); for(int i : res3)
		 * System.out.print(i+"  ");
		 */
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

	private static int getIndex(int a, int b[]) {
		int index = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] == a)
				index = i;
		}

		return index;
	}

	public static int[] sortArray(int x[]) {
		int sorted[] = new int[x.length];
		int smallest = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < sorted.length; j++) {
				for (int k = j + 1; k < sorted.length; k++) {
					if (sorted[j] > sorted[k]) {
						int temp1 = sorted[j];
						sorted[j] = sorted[k];
						sorted[k] = temp1;
					}
				}
			}
			if (i == 0) {
				smallest = x[i];
				sorted[i] = smallest;
			}
			if (x[i] < smallest) {
				int index = getIndex(smallest, sorted);
				int temp = smallest;
				smallest = x[i];
				sorted[index] = x[i];
				sorted[i] = temp;
			}
		}
		return sorted;
	}

}
