// This Java Program converts the temperature in Celsius to Fahrenheit

import java.text.DecimalFormat;
import java.util.Scanner;

class main {
    private static DecimalFormat df = new DecimalFormat("0.0"); // To round up the result
    public static void main(String[] args) {
        float celsius;
        float fahrenheit;
        System.out.println("Enter a temperature value: ");
        Scanner sc = new Scanner(System.in);
        celsius = sc.nextFloat();
        fahrenheit = (celsius * 1.8f) + 32f;
        System.out.println(df.format(celsius)+ " degrees in Celsius is equal to " + df.format(fahrenheit) + " in Fahrenheit.");
        // We use df.format to use the function that rounds up the desired number
    }
}
// OUTPUT EXAMPLE
// Enter a temperature value: 37.7
// 37.7 degrees in Celsius is equal to 99.9 degrees in Fahrenheit.
