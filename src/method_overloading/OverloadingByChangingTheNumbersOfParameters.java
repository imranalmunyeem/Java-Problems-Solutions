//Overloading by changing the number of parameters

package method_overloading;

public class OverloadingByChangingTheNumbersOfParameters {
	 private static void display(int a){
	        System.out.println("Arguments: " + a);
	    }

	    private static void display(int a, int b){
	        System.out.println("Arguments: " + a + " and " + b);
	    }

	    public static void main(String[] args) {
	        display(1);
	        display(1, 4);
	    }
	}