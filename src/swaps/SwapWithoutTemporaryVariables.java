// Swap two numbers without using temporary variable

package swaps;

public class SwapWithoutTemporaryVariables {
	public static void main(String[] args) {

		float first = 45.0f, second = 39.5f;

		System.out.println("--Before swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);

		first = first - second;
		second = first + second;
		first = second - first;

		System.out.println("--After swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
	}
}
