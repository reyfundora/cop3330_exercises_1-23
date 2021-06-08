/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex12;

import java.util.Scanner;

public class ex12 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        String principle = input.next();
        System.out.print("Enter the rate of interest: ");
        String rot = input.next();
        System.out.print("Enter the number of years: ");
        String years = input.next();

        double P = Double.parseDouble(principle);
        double rot_percent = Double.parseDouble(rot);
        double t = Double.parseDouble(years);

        double r = rot_percent / 100;
        double simple_interest = P * (1 + (r * t));

        System.out.printf("After %s years at %s%%, the investment will be worth $%.2f.\n",
                          years, rot, simple_interest);
    }
}
