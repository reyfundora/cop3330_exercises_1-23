package ex03;

import java.util.Scanner;

public class ex03 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What is the quote? ");
        String quote = input.nextLine();
        System.out.print("Who said it? ");
        String who = input.nextLine();

        System.out.println(who + " says, " + "\"" + quote + "\"");
    }
}
