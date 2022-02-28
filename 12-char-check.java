// This Java program checks if character is contained in a given String

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        String string;
        String ch;
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        string = sc.nextLine();

        System.out.println("Enter a character: ");
        ch = String.valueOf(sc.next().charAt(0));

        if (string.contains(ch)) {
            System.out.println("String contains input character.");
        } else {
            System.out.println("String doesn't contain input character.");
        }
    }
}

// OUTPUT EXAMPLE
// Enter a string: Character
// Enter a character: r
// String contains input character.



