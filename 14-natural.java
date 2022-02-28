// This Java Program returns the sum of the first n natural numbers


import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        int n;
        int i;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (positive integer): ");
        n = sc.nextInt();

        for (i=1; i <= n; i++)
        {
            sum = sum+i;
        }

        System.out.println("Sum of first " + n +" natural numbers is: " + sum);

    }
}

//  OUTPUT EXAMPLE
// Enter a number (positive integer): 21
// Sum of first 21 natural numbers is: 231.
