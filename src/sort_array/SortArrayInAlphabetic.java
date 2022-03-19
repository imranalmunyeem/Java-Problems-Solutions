//Sort String Array In Alphabetical Order
package sort_array;

import java.util.Collections;
import java.util.Arrays;

public class SortArrayInAlphabetic {
	public static void main(String[] args) {
		String str_Array[] = { "Java", "Python", "Perl", "C++", "C#", "AS400" };

		System.out.printf("Original Array: \n%s\n\n", Arrays.toString(str_Array));

		// Sorts str_Array in ascending order
		Arrays.sort(str_Array);
		System.out.printf("Array sorted in ascending order: \n%s\n\n", Arrays.toString(str_Array));

		// Sorts str_Array in descending order
		Arrays.sort(str_Array, Collections.reverseOrder());

		System.out.printf("Array sorted in descending order : \n%s\n\n", Arrays.toString(str_Array));
	}
}
