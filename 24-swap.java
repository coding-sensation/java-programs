// This Java Program swaps two numbers without using a third variable.
import java.util.Scanner;

public class main27 {
    public static void main(String[] args) {
        int a;
        int b;

        System.out.print("Enter the two numbers you want to swap: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.print("Before swapping the two numbers: a = " + a + " & b = " + b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.print(" \nAfter swapping the two numbers: a = " + a + " & b = " + b);

    }
}

// OUTPUT EXAMPLE
// Enter the two numbers you want to swap: 33 88
// Before swaping the two numbers: a = 33 & b = 88.
// after swapping the two numbers: a = 88 & b = 33.