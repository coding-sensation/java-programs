// This Java Program converts a decimal to a binary number

import java.util.Scanner;

class main8 {
     public static void main(String[] args) {
         int decimal_number;
         String binary_number;
         System.out.println("Enter the number to convert: ");
         Scanner sc = new Scanner(System.in);
         decimal_number = sc.nextInt();
         // Built in function from java to convert your desired decimal to a Binary number
         binary_number = Integer.toBinaryString(decimal_number);
         System.out.println("Binary of Given Number is: " + binary_number + ".");
     }
}

// OUTPUT EXAMPLE
// Enter the number to convert : 7
// Binary of Given Number is : 111.