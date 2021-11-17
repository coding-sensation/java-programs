// This Java Program calculates the sum of digits

import java.util.Scanner;

class main11 {
    public static void main(String[] args) {
        int sum = 0;
        int n, m;

        //Enter a number
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        //Separate the digits
        while (n>0) {
            m = n % 10;
            sum = sum + m;
            n = n/10;
        }
        System.out.println("The sum of digits is " + sum + ".");
    }

}
// OUTPUT EXAMPLE
// Enter a number: 1234
// The sum of digits is 10.
