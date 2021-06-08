/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex14;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex14 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("What is the order amount? ");
        String order_in = input.next();
        System.out.print("What is the state? ");
        String state = input.next();
        state = state.toUpperCase();

        String state_WI = "WI", subtotal_text = "", tax_text = "";

        double order = Double.parseDouble(order_in);
        double tax, tax_add, total = order;

        if (state.equals(state_WI)) {
            tax = 5.5 / 100;
            tax_add = order * tax;
            total = order + tax_add;

            subtotal_text = "The subtotal is $" + df.format(order) + ".\n";
            tax_text = "The tax is $" + df.format(tax_add) + ".\n";
        }

        System.out.printf(subtotal_text + tax_text + "The total is $%.2f.\n", total);
    }
}
