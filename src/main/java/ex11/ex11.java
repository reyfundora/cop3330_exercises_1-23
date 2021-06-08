/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex11;

import java.util.Scanner;

public class ex11 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        String euros = input.next();
        System.out.print("What is the exchange rate? ");
        String rate = input.next();

        double amount_from = Double.parseDouble(euros);
        double rate_from = Double.parseDouble(rate);
        double rate_to = 100;
        double amount_to = (amount_from * rate_from) / rate_to;

        System.out.printf("$%.2f euros at an exchange rate of $%.2f is \n$%.2f U.S. dollars.\n",
                          amount_from, rate_from, amount_to);
    }
}
