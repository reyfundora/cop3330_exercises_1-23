/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex21;

import java.util.Scanner;

public class ex21 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean correct = false;
        String month = "none";

        while (correct.equals(false)) {

            System.out.print("Please enter the number of the month: ");
            String num_in = input.nextLine();

            try {
                int test = Integer.parseInt(num_in);
                if (test < 1 || 12 < test ) {
                    System.out.println("""
                            
                            Number chosen is not associated with a month.
                            Only enter integer values from 1 to 12.
                            """);
                    correct = false; continue;
                }
            }
            catch (Exception e) {
                System.out.println("""
                        
                        Invalid input. Only enter integer values from 1 to 12.
                        """);
                correct = false; continue;
            }

            switch (num_in) {
                case "1" -> month = "January";
                case "2" -> month = "February";
                case "3" -> month = "March";
                case "4" -> month = "April";
                case "5" -> month = "May";
                case "6" -> month = "June";
                case "7" -> month = "July";
                case "8" -> month = "August";
                case "9" -> month = "September";
                case "10" -> month = "October";
                case "11" -> month = "November";
                case "12" -> month = "December";
            }

            System.out.printf("The name of the month is %s.\n", month);
            correct = true;
        }
    }
}
