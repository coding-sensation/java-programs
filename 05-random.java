// This Java Program generates a random integer between 0 and 9

import java.util.*; // Random is part of the util package

class main5 {
    public static void main(String[] args) {
        Random random = new Random();
        int random_nr = random.nextInt(10); // 10 represents the range 0-9
        System.out.print(random_nr);
    }
}

// OUTPUT EXAMPLE
// Random Number: 7
