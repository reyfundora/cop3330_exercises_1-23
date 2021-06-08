/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex10;

import java.util.Scanner;

public class ex10 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        String price1 = input.next();
        System.out.print("Enter the quantity of item 1: ");
        String quantity1 = input.next();
        System.out.print("Enter the price of item 2: ");
        String price2 = input.next();
        System.out.print("Enter the quantity of item 2: ");
        String quantity2 = input.next();
        System.out.print("Enter the price of item 3: ");
        String price3 = input.next();
        System.out.print("Enter the quantity of item 3: ");
        String quantity3 = input.next();

        double p1 = Double.parseDouble(price1);
        double p2 = Double.parseDouble(price2);
        double p3 = Double.parseDouble(price3);
        double q1 = Double.parseDouble(quantity1);
        double q2 = Double.parseDouble(quantity2);
        double q3 = Double.parseDouble(quantity3);

        double total1 = p1 * q1; double total2 = p2 * q2; double total3 = p3 * q3;
        double subtotal = total1 + total2 + total3;
        double tax = subtotal *.055;
        double total = subtotal + tax;

        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);
    }
}
