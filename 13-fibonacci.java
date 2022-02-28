// This Java Program displays the first n terms of the Fibonacci series

import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        int count;
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm;
        int i;

        //Ask user to input the number of terms
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of terms: ");
        count = sc.nextInt();

        System.out.print("First " + count + " terms of Fibonacci series: \t");

        for (i=0; i<count; i++)
        {
            if(i <= 1)
            {
                nextTerm = i;
            }
            else {
                nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
            System.out.print(nextTerm + "\t");
        }


    }
}

//  OUTPUT EXAMPLE
// Enter the numbers of terms: 5
// First %d terms of Fibonacci series: 0 1 1 2 3