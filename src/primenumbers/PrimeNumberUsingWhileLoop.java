////Program to Check Prime Number using a while loop
package primenumbers;

public class PrimeNumberUsingWhileLoop{
	public static void main(String[] args)
	   {
    int num = 23, i = 2;
    boolean flag = false;
    while (i <= num / 2) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }

      ++i;
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}