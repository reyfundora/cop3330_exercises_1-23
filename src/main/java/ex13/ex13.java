/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex13;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        String principle = input.next();
        System.out.print("What is the rate? ");
        String rot = input.next();
        System.out.print("What is the number of years? ");
        String years = input.next();
        System.out.print("What is the number of times the interest is compounded per year? ");
        String compound = input.next();

        double P = Double.parseDouble(principle);
        double rot_percent = Double.parseDouble(rot);
        double t = Double.parseDouble(years);
        double n = Double.parseDouble(compound);

        double r = rot_percent / 100;
        double c_interest_calc = Math.pow((1 + r / n), n * t);
        double c_interest = P * c_interest_calc;

        System.out.printf("$%.2f invested at %s%% for %s years compounded %s times per year is $%.2f.\n",
                           P, rot, years, compound, c_interest);
    }
}
