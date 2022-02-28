// This Java Program prints a right triangle using numbers.

import java.util.Scanner;

public class main26 {
    public static void main(String[] args) {
        int i;
        int j;
        int n;

        System.out.print("Enter a positive integer: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i=0; i<=n;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.print("\n");
        }

    }
}
// OUTPUT EXAMPLE
// Enter a positive integer :6
// 1
// 22
// 333
// 4444
// 55555
// 666666