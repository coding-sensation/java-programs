// This Java Program implements the Bubble Sort Algorithm.

import java.util.Scanner;

public class main31 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int n;
        int c;
        int d;
        int swap;

        System.out.print("Enter number of elements: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print("\nEnter element #" + (i+1) + " : ");
            Scanner scan = new Scanner(System.in);
            array[i] = scan.nextInt();
        }
        for (c = 0 ; c < n - 1; c++){

            for (d = 0 ; d < n - c - 1; d++){

                if (array[d] > array[d+1]) /* For decreasing order use '<' instead of '>' */
                {
                    swap       = array[d];
                    array[d]   = array[d+1];
                    array[d+1] = swap;
                }
            }
        }

        System.out.print("Sorted list in ascending order: \n");
        for (c=0; c<n; c++)
        {
            System.out.print(array[c] + "\t");

        }


    }
}

// OUTPUT EXAMPLE
// Enter number of elements: 5
// Enter element #1: 44
// Enter element #2: 22
// Enter element #3: 77
// Enter element #4: 55
// Enter element #5: 888
// Sorted list in ascending order:
// 22  44  55  77  888
