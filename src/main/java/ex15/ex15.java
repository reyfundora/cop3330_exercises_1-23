package ex15;

import java.util.Scanner;

public class ex15 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String correct = "abc$123";
        System.out.print("What is the password? ");
        String password = input.next();

        if (password.equals(correct)) System.out.print("Welcome!");
        else System.out.print("I don't know you.");
    }
}
