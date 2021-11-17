// This Java Program checks if a number is positive, negative or zero

import java.util.Scanner;

class main10 {
    public static void main(String[] args) {
        float number;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextFloat();
        if (number > 0) { System.out.println("You entered a positive number."); }
        if (number == 0) { System.out.println("You entered zero."); }
        if (number < 0) { System.out.println("You entered a negative number."); }
    }
}
// OUTPUT EXAMPLE
// Enter a number: -3
// You entered a negative number.