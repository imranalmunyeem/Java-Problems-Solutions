//Swap two numbers using temporary variable

package swaps;

public class SwapUsingTemporaryVariables {
	public static void main(String[] args) {

		float first = 3.24f, second = 2.34f;

		System.out.println("--Before swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);

		// Value of first is assigned to temporary
		float temporary = first;

		// Value of second is assigned to first
		first = second;

		// Value of temporary (which contains the initial value of first) is assigned to
		// second
		second = temporary;

		System.out.println("--After swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
	}
}