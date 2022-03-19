package insert_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertArrayNumbers {
	public static void main(String args[]) throws NumberFormatException, IOException {
		int x[] = new int[9];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Please inert 9 Array numbers: ");
		for (int y = 0; y < 9; y++) {
			x[y] = Integer.parseInt(br.readLine());
		}
		for (int y = 0; y < x.length; y++) {
			System.out.print(" " + x[y]);
		}
	}

}
