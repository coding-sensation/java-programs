// This Java Program that calculates the power of a number.

import java.util.Scanner;

public class main29 {
    public static void main(String[] args) {
        int num;
        int exponent;
        int result = 1;

        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        System.out.print("Enter an exponent: ");
        Scanner s = new Scanner(System.in);
        exponent = s.nextInt();

        for(int i=1; i<=exponent; i++)
        {
            result = result*num;
        }

        System.out.print(num + "^" + exponent + " = " + result);

    }
}
// OUTPUT EXAMPLE
// Enter a num number: 4
// Enter an exponent: 2
// 4 ^ 2 = 16.