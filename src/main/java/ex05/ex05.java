package ex05;

import java.util.Scanner;

public class ex05 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the first number? ");
        String s1 = input.next();
        System.out.print("What is the second number? ");
        String s2 = input.next();

        int first = Integer.parseInt(s1);
        int second = Integer.parseInt(s2);

        int total1 = first + second;
        int total2 = first - second;
        int total3 = first * second;
        int total4 = first / second;

        System.out.println(first + " + " + second + " = " + total1 + "\n" +
                first + " - " + second + " = " + total2 + "\n" +
                first + " * " + second + " = " + total3 + "\n" +
                first + " / " + second + " = " + total4);
    }
}
