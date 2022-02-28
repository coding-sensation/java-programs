// This Java program converts an input byte value to a bit value, or vice-versa

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        String input;
        int value;
        int result;
        System.out.println("Enter byte or bit: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        if (input.equals("byte") || input.equals("Byte")) {
            System.out.println("Enter the value you want to convert: ");
            Scanner scanner = new Scanner(System.in);
            value = scanner.nextInt();
            result = value * 8;
            System.out.println("The value in bits of the entered byte value is " + result +".");
        } else if (input.equals("bit") || input.equals("Bit")) {
            System.out.println("Enter the value you want to convert: ");
            Scanner scanner = new Scanner(System.in);
            value = scanner.nextInt();
            result = value / 8;
            System.out.println("The value in bytes of the entered bit value is " + result +".");
        } else {
            System.out.println("Error: Wrong input");
        }
    }
}
// OUTPUT EXAMPLE
// Enter a byte or bit: byte
// Enter the value you want to convert: 8
// The value in bit of the entered byte value is 64.

