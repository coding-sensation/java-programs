// This Java Program finds the factorial of a given number.

import java.util.Scanner;

public class main25 {
    public static void main(String[] args) {
        int i;
        int fact = 1;
        int number;

        System.out.print("Enter a positive integer: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        for (i=1; i<= number; i++)
        {
            fact = fact*i;
        }
        System.out.print("The factorial of " + number + " is: " + fact);

    }
}

// OUTPUT EXAMPLE
// Enter a positive integer :5
// The factorial of 5 is: 120.