// This Java Program checks if the given year is a leap year or not.
import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = sc.nextInt();


        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } else {
                System.out.println(year + " is a leap year");
            }
        }
        else { System.out.println(year + " is not a leap year");


        }
    }
}

// OUTPUT EXAMPLE
// Enter year: 1991
// 1991 is not a Leap Year







// OUTPUT EXAMPLE
// Enter year: 1991
// 1991 is not a Leap Year