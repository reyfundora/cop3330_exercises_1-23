package ex16;

import java.util.Scanner;

public class ex16 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int legal_age = 16;

        System.out.print("What is your age? ");
        String age_in = input.next();

        int age = Integer.parseInt(age_in);
        String ternary = (age >= 16) ? "You are old enough to legally drive." :
                                       "You are not old enough to legally drive.";
        System.out.println(ternary);
    }
}
