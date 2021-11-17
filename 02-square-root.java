// This Java Program calculates the Square root

import java.util.*;
import java.math.*;
class Main {
  public static void main(String[] args) {
    Double number;
    System.out.print("Enter a number:");

	// Creates a new Scanner instance which points to the input stream passed as argument
	Scanner sc = new Scanner(System.in);
	
    number = sc.nextDouble();
    Double squareRoot = Math.sqrt(number);

    System.out.println("The square root of " + number + " is " + squareRoot + ".");
  }
}

// OUTPUT EXAMPLE
// Enter a number: 25
// The square root of 25 is 5.
