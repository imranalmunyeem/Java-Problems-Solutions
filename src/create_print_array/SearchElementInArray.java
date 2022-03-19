package create_print_array;

import java.util.Arrays;

public class SearchElementInArray {
	public static void main(String args[]) {
		int x[] = { 2, 6, 7, 9, 1, 8, 4 };
		int index = Arrays.binarySearch(x, 7); //put values here to search for index
		System.out.println("This element is found at index: " + index);
	}

}