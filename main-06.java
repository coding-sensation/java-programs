// This Java Program converts kilometers to miles

import java.text.DecimalFormat;
import java.util.Scanner;

class main6 {
    private static DecimalFormat df = new DecimalFormat("0.00"); // To round up the result
     public static void main(String[] args) {
         float kilometers;
         float miles;
         float conversion_factor = 0.621371f;
         System.out.println("Enter value in kilometers: ");
         Scanner sc = new Scanner(System.in);
         kilometers = sc.nextFloat();

         miles = kilometers * conversion_factor;
         System.out.print(kilometers + " kilometers is equal to " + df.format(miles) + " miles.");
     }
}

// OUTPUT EXAMPLE
// Enter value in kilometers: 23
// 23.00 kilometers is equal to 14.29 miles.
