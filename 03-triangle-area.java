// This Java Program finds the area of a triangle

import java.util.*;

 class main3 {
     public static void main(String[] args) {
         double a;
         double b;
         double c;
         double s;
         double area;
         System.out.println("Enter first side: ");
         Scanner sc = new Scanner(System.in);
         a = sc.nextDouble();
         System.out.println("Enter second side: ");
         b = sc.nextDouble();
         System.out.println("Enter third side: ");
         c = sc.nextDouble();
         // Calculate the semi-perimeter
         s = (a + b + c) / 2;
         // Calculate the area
         area = Math.pow((s * (s - a) * (s - b) * (s-c)), 0.5);  
         System.out.print(area);
     }
}

// OUTPUT EXAMPLE
// Enter first side: 5
// Enter second side: 6
// Enter third side: 7
// The area of the triangle is 14.70.
