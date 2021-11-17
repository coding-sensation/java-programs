// This Java Program swaps two numbers

import java.util.*;
import java.util.Scanner;

class main4 {
    public static void main(String[] args) {
        int x;
        int y;
        int swap_operator; // This variable is going to be used as an intermediary
        System.out.println("Enter a value for x: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("Enter a value for y: ");
        y = sc.nextInt();
        swap_operator = x;
        x = y;
        y = swap_operator;
        System.out.print("x = " + x);
        System.out.print(System.lineSeparator()); // This is just used to separate the outputs into separate lines
        System.out.print("y = " + y) ;
    }

}

// OUTPUT EXAMPLE
// Enter a value for x: 23
// Enter a value for y: 7
// x = 7.
// y = 23.