// This Java program convert number of days into year : month : day

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        int d;
        int y = 0;
        int m = 0;

        //input number of days
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days to convert: ");
        d = sc.nextInt();

        //calculate number of years in integer format
        y = (d - d % 365) / 365;

        //get number of days after getting number of years
        d = d % 365;

        //calculate number of months in integer format
        m = (d - d % 30) / 30;

        //get number of days after getting number of month
        d = d % 30;

        System.out.println(y + " : " + m + " : " + d);

    }
}
// OUTPUT EXAMPLE
//Enter number of days to convert : 984
//2 : 8 : 14