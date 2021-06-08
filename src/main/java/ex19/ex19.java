/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex19;

import java.util.Scanner;

public class ex19 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean correct = false;

        while (correct.equals(false)) {
            System.out.print("What is your weight in pounds? ");
            String weight_in = input.next();
            System.out.print("What is your height in inches? ");
            String height_in = input.next();

            try {
                double weight = Double.parseDouble(weight_in);
                double height = Double.parseDouble(height_in);
                double bmi = (weight / (height * height)) * 703;
                System.out.printf("Your BMI is %.1f.\n", bmi);

                if (18.5 < bmi && bmi < 25)
                    System.out.println("You are within the ideal weight range.");
                if (bmi > 25)
                    System.out.println("You are overweight. You should see your doctor.");
                if (bmi < 18.5)
                    System.out.println("You are underweight. You should go see your doctor.");

                correct = true;
            }

            catch (Exception e) {
                System.out.println("\nPlease only enter numeric values. Try Again.\n");
                correct = false;
            }
        }
    }
}
