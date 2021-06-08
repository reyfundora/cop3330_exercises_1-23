/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex23;

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("For the following questions, please type either 'yes' or 'no' accordingly.");

        System.out.print("Is the car silent when you turn the key? ");
        String D1 = input.next(); D1 = D1.toLowerCase();

        if (D1.equals("y") || D1.equals("yes")) {
            System.out.print("Are the battery terminals corroded? ");
            String D2 = input.next(); D2 = D2.toLowerCase();
            if (D2.equals("y") || D2.equals("yes"))
                System.out.println("Clean terminals and try starting again.");
            else if (D2.equals("n") || D2.equals("no"))
                System.out.println("Replace cables and try again.");
        }

        if (D1.equals("n") || D1.equals("no")) {
            System.out.print("Does the car make a slicking noise? ");
            String D2 = input.next(); D2 = D2.toLowerCase();
            if (D2.equals("y") || D2.equals("yes"))
                System.out.println("Replace the battery.");

            else if (D2.equals("n") || D2.equals("no")) {
                System.out.print("Does the car crank up but fail to start? ");
                String D3 = input.next(); D3 = D3.toLowerCase();
                if (D3.equals("y") || D3.equals("yes"))
                    System.out.println("Check your spark plug connections.");

                else if (D3.equals("n") || D3.equals("no")){
                    System.out.print("Does the engine start and then die? ");
                    String D4 = input.next(); D4 = D4.toLowerCase();
                    if (D4.equals("y") || D4.equals("yes")) {
                        System.out.print("Does the car have fuel injections? ");
                        String D5 = input.next(); D5 = D5.toLowerCase();
                        if (D5.equals("y") || D5.equals("yes"))
                            System.out.println("Get it in for service.");
                        else if (D5.equals("n") || D5.equals("no"))
                            System.out.println("Check to ensure the choke is opening and closing.");
                    }

                    else if (D4.equals("n") || D4.equals("no"))
                        System.out.println("This should not be possible.");
                }
            }
        }
    }
}
