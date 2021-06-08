/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex20;

import java.util.Scanner;

public class ex20 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean correct = false;
        double tax = 0, tax2 = 0;

        while (correct.equals(false)) {
            System.out.print("What is the order amount? ");
            String order_in = input.nextLine();
            System.out.print("What state do you live in? ");
            String state_in = input.nextLine();
            state_in = state_in.toLowerCase();

            try {
                double order = Double.parseDouble(order_in);
                if (state_in.equals("wisconsin") || (state_in.equals("wi"))) {
                    System.out.print("What is your county? ");
                    String county_in = input.nextLine();
                    county_in = county_in.toLowerCase();
                    county_in = county_in.replaceAll(" ", "_");

                    if (county_in.equals("eau_claire") || county_in.equals("eau_claire_county")) {
                        tax = order * .05;
                        tax2 = order * .005;
                        System.out.printf("The tax is $%.2f.\n", tax + tax2);
                    }
                    if (county_in.equals("dunn") || county_in.equals("dunn_county")) {
                        tax = order * .05;
                        tax2 = order * .004;
                        System.out.printf("The tax is $%.2f.\n", tax + tax2);
                    }
                }

                if (state_in.equals("illinois") || (state_in.equals("il"))) {
                    tax = order * .08;
                    System.out.printf("The tax is $%.2f.\n", tax);
                }

                System.out.printf("The total is $%.2f.\n", order + tax + tax2);
                correct = true;
            }
            catch (Exception e) {
                System.out.println("\nPlease only enter numeric values. Try again.\n");
                correct = false;
            }
        }
    }
}
