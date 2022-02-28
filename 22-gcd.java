// This Java Program finds the GCD of two numbers.


import java.util.Scanner;

public class main22 {
    public static void main(String[] args) {
        int number1;
        int number2;
        int hcf = 0;

        System.out.print("Enter two integers: ");
        Scanner sc = new Scanner(System.in);
        number1= sc.nextInt();
        number2= sc.nextInt();

        for( int i=1; i<=number1 || i<=number2; ++i) {
            if (number1 % i == 0 && number2 % i == 0) {
                hcf = i;
            }
        }
        System.out.print("The highest common factor of " + number1 + " and " +number2+ " is " + hcf);

    }
}


// OUTPUT EXAMPLE
// Enter two integers : 11 121
// The highest common factor of 11 and 121 is 11.

