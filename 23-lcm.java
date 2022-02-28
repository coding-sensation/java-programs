// This Java Program finds the LCM of two numbers.


import java.util.Scanner;

public class main23 {
    public static void main(String[] args) {
        int number1;
        int number2;
        int max = 0;

        System.out.print("Enter two positive integers: ");
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextInt();
        number2 = sc.nextInt();

        max=(number1>number2) ? number1 : number2;

        while(true){

            if(max%number1==0 && max%number2==0){

                System.out.print("The least common denominator of " + number1+ " and " + number2 + " is " + max + ".");
                break;
            }
            ++max;
        }

    }
}

// OUTPUT EXAMPLE
// Enter two positive integers :22 33
//the least common denominator of 22 and 33 is 66.
