// This Java Program checks if a given number is prime or not.

import java.util.Scanner;

public class main24 {
    public static void main(String[] args) {
        int n;
        int flag = 0;

        System.out.print("Enter a positive integer: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 2; i <= n / 2; ++i) {

            if (n % i == 0) {

                flag = 1;

                break;
            }
        }

        if (n==1)
        {
            System.out.print("1 is neither prime nor composite");
        }
        else {
            if (flag == 0)
            {
                System.out.print(n + " is a prime number.");
            }
            else
            {
                System.out.print(n + " is not a prime number.");
            }
        }


    }
}

// OUTPUT EXAMPLE
// Enter a positive integer :5
// 5 is a prime number.