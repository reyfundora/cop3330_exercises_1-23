/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex18;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean correct = false;

        while (correct.equals(false)) {
            System.out.println("Press C to convert from Fahrenheit to Celsius.\n" +
                               "Press F to convert from Celsius to Fahrenheit.");
            String temp_in = input.next();
            temp_in = temp_in.toUpperCase();
            System.out.println("Your choice: " + temp_in);

            if (!temp_in.equals ("C") && !temp_in.equals("F"))
                System.out.println("Incorrect input. Press either C or F.\n");

            if (temp_in.equals("C")) {
                System.out.println("Please enter the temperature in Fahrenheit: ");
                String temp_F = input.next();

                double F = Double.parseDouble(temp_F);
                double C = (F - 32) * 5 / 9;
                System.out.printf("The temperature in Celsius is %.1f.\n", C);

                correct = true;
            }

            if (temp_in.equals("F")) {
                System.out.println("Please enter the temperature in Celsius: ");
                String temp_F = input.next();

                double C = Double.parseDouble(temp_F);
                double F = (C * 9 / 5) + 32;
                System.out.printf("The temperature in Fahrenheit is %.1f.\n", F);

                correct = true;
            }
        }
    }
}
