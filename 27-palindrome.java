// This Java Program checks if a given number is palindrome.

import java.util.Scanner;

public class main30 {
    public static void main(String[] args) {
        int n;
        int reversed = 0;
        int remainder;
        int original;

        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        original = n;

        while (n != 0) {
            remainder = n%10;
            reversed = reversed*10 + remainder;
            n /= 10;

        }

        if (original == reversed) {
            System.out.print(original + " is a palindrome.");
        }
        else {
            System.out.print(original + " is not a palindrome.");
        }

    }
}
// OUTPUT EXAMPLE
// Enter a number: 121
// 121 is a palindrome


