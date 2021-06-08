/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex08;

import java.util.Scanner;

public class ex08 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many people? ");
        String people = input.next();
        System.out.print("How many pizzas do you have? ");
        String pizzas = input.next();
        System.out.print("How many slices per pizza? ");
        String slices = input.next();

        int people_int = Integer.parseInt(people);
        int pizzas_int = Integer.parseInt(pizzas);
        int slices_int = Integer.parseInt(slices);
        int total_slices = pizzas_int * slices_int;
        int each_person = total_slices / people_int;
        int remainder = total_slices % people_int;

        System.out.printf("%d people with %d pizzas (%d slices)\n",
                          people_int, pizzas_int, total_slices);
        System.out.printf("Each person gets %d pieces of pizza.\n", each_person);
        System.out.printf("There are %d leftover pieces.\n", remainder);
    }
}
