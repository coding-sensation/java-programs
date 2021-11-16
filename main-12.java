// This Java program reverses the input number

import java.util.Scanner;

class main11 {
    public static void main(String[] args) {
        int number;
        int reverse = 0;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        while (number> 0) {
            int remainder = number%10;
            reverse = reverse * 10 + remainder;
            number = number / 10;

        }
        System.out.println("Reverse of entered number is " +reverse+ ".");
    }
}
// OUTPUT EXAMPLE
// Enter a number : 12345
// Reverse of entered number is 54321.
