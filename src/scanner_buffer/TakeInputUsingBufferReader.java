// Take input from the user using buffered reader and calculate

package scanner_buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakeInputUsingBufferReader {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int number1, number2, output;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		number1 = Integer.parseInt(br.readLine());
		System.out.println("Enter another number: ");
		number2 = Integer.parseInt(br.readLine());

		output = number1 * number2;
		System.out.println("Result is : " + output);
	}
}

/*The Scanner has a little buffer (1KB char buffer) as opposed to the BufferedReader (8KB byte buffer),
 *but it's more than enough. 
 *BufferedReader is a bit faster as compared to scanner because the scanner does the parsing of input data and BufferedReader simply reads a sequence of characters */
