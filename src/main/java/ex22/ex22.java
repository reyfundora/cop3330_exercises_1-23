/*
*  UCF COP3330 Summer 2021 Assignment 1 Solution
*  Copyright 2021 Rey Fundora
*/

package ex22;

import java.util.Scanner;

public class ex22 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean correct = false;

        while (correct.equals(false)) {
            System.out.print("Enter the first number: ");
            String num1_in = input.next();
            System.out.print("Enter the second number: ");
            String num2_in = input.next();
            System.out.print("Enter the third number: ");
            String num3_in = input.next();

            try {
                double num1 = Double.parseDouble(num1_in);
                double num2 = Double.parseDouble(num2_in);
                double num3 = Double.parseDouble(num3_in);


                if (num1 == num2 && num1 == num3) {
                    System.out.println("\nAll numbers are the same!");
                    correct = true; continue;
                }

                double largest = num1;
                if (largest < num2) largest = num2;
                if (largest < num3) largest = num3;

                System.out.printf("The largest number is %.1f.\n", largest);
                correct = true;
            }
            catch (Exception e) {
                System.out.println("\nInvalid input. Only enter numeric values.\n");
                correct = false;
            }
        }
    }
}
