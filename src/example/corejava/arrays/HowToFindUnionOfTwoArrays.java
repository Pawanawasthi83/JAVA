package example.corejava.arrays;

import java.util.Arrays;

public class HowToFindUnionOfTwoArrays {
	public static void main(String[] args) {

		// doUnionofSortedArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 5,
		// 6,8, 10 });
		// doUnionofSortedArraysWithDuplicacteValues(new int[] { 1, 3, 3, 3, 4,
		// 5, 6, 6, 8, 9, 9,0 },new int[] { 2, 5, 6, 8, 10, 25, 34 });
		doUnionOfUnshortedArrayWithDuplicateValues(new int[] { 7, 4, 3, 8, 4, 10, 6, 8, 9, 9 },
				new int[] { 2, 15, 26, 8, 10, 25, 34, 46 });
	}

	private static void doUnionOfUnshortedArrayWithDuplicateValues(int[] a, int[] b) {

		int max = 0;
		for (int m : a) {
			if (m > max) {
				max = m;
			}
		}

		for (int n : b) {
			if (n > max) {
				max = n;
			}
		}
		System.out.println(max);
		int unionArr[] = new int[max + 1];
		System.out.print(a[0]);
		++unionArr[a[0]];

		for (int i = 1; i < a.length; i++) {

			if (unionArr[a[i]] == 0) {
				System.out.print(a[i]);
				++unionArr[a[i]];

			}
		}
		for (int j = 0; j < b.length; j++) {
			if (unionArr[b[j]] == 0) {
				System.out.print(b[j]);
				++unionArr[b[j]];
			}
		}

		System.out.println(Arrays.toString(unionArr));

	}

	private static void doUnionofSortedArraysWithDuplicacteValues(int[] a, int[] b) {

		int unionArrSize = 0;

		if (a[a.length - 1] > b[b.length - 1]) {
			unionArrSize = a[a.length - 1];
		} else {
			unionArrSize = b[b.length - 1];
		}

		int[] unionArr = new int[unionArrSize + 1];
		System.out.print(a[0]);
		++unionArr[a[0]];
		for (int i = 1; i < a.length; i++) {
			if (a[i] != a[i - 1]) {
				System.err.print(a[i]);
				++unionArr[a[i]];
			}
		}

		for (int j = 0; j < b.length; j++) {
			if (unionArr[b[j]] == 0) {
				System.out.print(b[j]);
				++unionArr[b[j]];
			}
		}
		System.out.println(Arrays.toString(unionArr));
		for (int m = 0; m < unionArr.length; m++) {
			if (unionArr[m] != 0) {
				unionArr[m] = m;
			}
		}
		System.out.println(Arrays.toString(unionArr));

	}

	private static void doUnionofSortedArrays(int[] a, int[] b) {

		int m = a.length;
		int n = b.length;
		int i = 0;
		int j = 0;
		int unionArrSize = 0;
		if (a[a.length - 1] > b[b.length - 1]) {
			unionArrSize = a[a.length - 1];
		} else {
			unionArrSize = b[b.length - 1];
		}
		System.out.println(unionArrSize);

		int[] unionArr = new int[unionArrSize + 1];
		int k = 0;
		while (i < m && j < n) {
			if (a[i] < b[j]) {
				unionArr[k++] = a[i];
				i++;
			} else if (b[j] < a[i]) {
				unionArr[k++] = b[j];
				j++;
			} else {
				unionArr[k++] = a[i];
				i++;
				j++;
			}
		}

		while (i < m) {
			unionArr[k++] = a[i];
			i++;
		}
		while (j < n) {
			unionArr[k++] = b[j];
			j++;
		}

		System.out.println(Arrays.toString(unionArr));

	}

}