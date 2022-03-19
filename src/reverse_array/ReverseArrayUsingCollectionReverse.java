
// Reversing an array using Java collections

package reverse_array;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayUsingCollectionReverse {
	public static void main(String args[]) {
		ArrayList al = new ArrayList();
		al.add("E");
		al.add("J");
		al.add("I");
		al.add("K");
		al.add("E");

		System.out.println("Before reversal: " + al);

		Collections.reverse(al);
		System.out.println("After reversal: " + al);
	}

}

/*Using Collections.reverse() method
The third method is to use the function java.util.Collections.reverse(List list) method. This method reverses the elements in the specified list. Hence, we convert the array into a list first by using java.util.Arrays.asList(array) and then reverse the list. 
*/