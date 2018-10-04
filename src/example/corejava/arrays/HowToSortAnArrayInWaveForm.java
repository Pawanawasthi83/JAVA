package example.corejava.arrays;

import java.util.Arrays;

public class HowToSortAnArrayInWaveForm {
	// First sort the input array, then swap all adjacent elements.
	public static void main(String[] args) {

		sortArrayInWaveForm(new int[]{10, 90, 49, 2, 1, 5, 23});

		sortArrayInWaveFormBySingleTraversal(new int[] { 10, 90, 49, 2, 1, 5, 23 });

	}

	private static void sortArrayInWaveFormBySingleTraversal(int[] inputArr) {

		for (int i = 0; i < inputArr.length - 1; i += 2) {

			if (i > 0 && inputArr[i] < inputArr[i - 1]) {
				swap(inputArr, i, i - 1);
			}
			if (inputArr[i] < inputArr[i + 1]) {
				swap(inputArr, i, i + 1);
			}

		}

		System.out.println(Arrays.toString(inputArr));

	}

	public static void sortArrayInWaveForm(int[] inputArray) {

		int[] sortedArray = sortArray(inputArray);

		System.out.println(Arrays.toString(sortedArray));

		System.out.println("Sorted Array In Wave form");

		for (int j = 0; j < sortedArray.length - 1; j += 2) {
			swap(sortedArray, j, j + 1);

		}
		System.out.println(Arrays.toString(sortedArray));

	}

	public static int[] sortArray(int[] inputArray) {

		for (int i = 0; i < inputArray.length - 1; i++) {
			for (int j = 0; j < inputArray.length - 1 - i; j++) {
				if (inputArray[j] > inputArray[j + 1]) {
					swap(inputArray, j, j + 1);
				}
			}
		}

		return inputArray;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
