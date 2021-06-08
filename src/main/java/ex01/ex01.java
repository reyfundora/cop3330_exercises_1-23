package ex01;

import java.util.Scanner;

public class ex01 {
    public static void main (String[] args){
        System.out.print("What is your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.next();

        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
