/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex09;

import java.util.Scanner;

public class ex09 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the length of the ceiling? ");
        String l = input.next();
        System.out.print("What is the width of the ceiling? ");
        String w = input.next();

        double length = Double.parseDouble(l);
        double width = Double.parseDouble(w);
        double area_feet = length * width;
        final double GALLON = area_feet / 350;

        System.out.printf("You will need to purchase %.0f gallons of paint to cover " +
                          "%.0f square feet.\n", GALLON + 1, area_feet);
    }
}
