//Program to sort array in descending order
package sort_array;

import java.util.Collections;
import java.util.Arrays;

public class SortNumbericArrayInDecending {
	public static void main(String[] args) {
		// Collections.reverseOrder do not work for primitive Types
		// define an array with Integer
		Integer[] IntArray = { 52, 45, 32, 64, 12, 87, 78, 98, 23, 7 };

		// print original array
		System.out.printf("Original Array: %s", Arrays.toString(IntArray));

		// Sorts IntArray in descending order
		Arrays.sort(IntArray, Collections.reverseOrder());

		// print sorted array
		System.out.printf("\n\nSorted Array: %s", Arrays.toString(IntArray));
	}
}