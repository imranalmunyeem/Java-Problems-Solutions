////Calculate Square for the numbers 1 to 10
package calculations;

class GetSquare extends Thread {
	public void run() {
		for (int x = 1; x <= 10; x++) {
			System.out.println("The square of " + x + " is " + (x * x));
		}
	}
}

public class Square {

	public static void main(String args[]) {
		GetSquare gs = new GetSquare();
		gs.start();
	}

}
