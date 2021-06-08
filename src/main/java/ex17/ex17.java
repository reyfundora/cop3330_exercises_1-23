/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex17;

import java.util.Scanner;

public class ex17 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean correct = false;

        while (correct.equals(false)) {
            System.out.print("What is your weight in pounds? ");
            String weight_in = input.nextLine();
            System.out.print("What is your gender?\nPress 1 for male; 2 for female. ");
            String gender_in = input.nextLine();
            System.out.print("What was your total alcohol consumption (in ounces)? " );
            String A_in = input.nextLine();
            System.out.print("How much time (hours) has passed since your last drink? ");
            String time_in = input.nextLine();
            System.out.print("\n");

            try {
                double weight =  Double.parseDouble(weight_in);
                double gender = Double.parseDouble(gender_in);
                double A = Double.parseDouble(A_in);
                double time = Double.parseDouble(time_in);
                double r = 0;

                if (gender != 1 && gender != 2) {
                    System.out.println("Invalid number for gender. When prompted, press 1 for male " +
                                       "or 2 for female. Try again.\n");
                    correct = false;
                    continue;
                }
                if (gender == 1) {
                    r = 0.73;
                }
                if (gender == 2) {
                    r = 0.66;
                }

                double BAC = (A * 5.14 / weight * r) - .015 * time;
                System.out.printf("Your BAC is %.6f.\n", BAC);
                if (BAC >= .08) System.out.println("It is not legal for you to drive.");
                else if (BAC < .08) System.out.println("It is legal for you to drive.");

                correct = true;
            }
            catch (Exception e) {
                System.out.println("Please only enter numeric values. Try again.\n");
                correct = false;
            }
        }
    }
}
