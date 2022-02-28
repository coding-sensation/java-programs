import java.util.Scanner;

// This Java program finds the sum of the series (1)+(1+2)+(1+2+3)+(1+2+3+...+n)
public class task15 {
    public static void main(String[] args) {
        double sum ;
        int n;
        int total = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for nth term: ");
        n = sc.nextInt();

        for (int i =1; i <= n; i++) {
            sum = 0;
            for (int j = 1; j <= i; j++) {
                total += j;
                sum += j;
                System.out.print(j);


                if (j < i) {
                    System.out.print("+");
                }
            }
            System.out.print(" = " + sum + "\n");
        }
            System.out.print("\nThe sum of the above series is: " + total +"\n");


    }
}

// OUTPUT EXAMPLE
//Enter the value for nth term: 8
//1 = 1
//1+2 = 3
//1+2+3 = 6
//1+2+3+4 = 10
//1+2+3+4+5 = 15
//1+2+3+4+5+6 = 21
//1+2+3+4+5+6+7 = 28
//1+2+3+4+5+6+7+8 = 36
//The sum of the above series is: 120
