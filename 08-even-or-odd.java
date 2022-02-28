// This Java Program checks if a number is odd or even

import java.util.Scanner;

class main9 {
     public static void main(String[] args) {
         int number;
         System.out.println("Enter a number: ");
         Scanner sc = new Scanner(System.in);
         number = sc.nextInt();
         if ((number % 2) == 0)
         {
             System.out.println(number + " is an even number.");
         }
         else {
             System.out.println(number + " is an odd number.");
         }
     }
}
// OUTPUT EXAMPLE
// Enter a number: 7
// 7 is an odd number.