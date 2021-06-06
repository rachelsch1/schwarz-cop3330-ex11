package ex11.base;

/* UCF COP3330 Summer 2021 Assignment 1 Solution
   Copyright 2021 Rachel Schwarz
*/

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        String str1 = input.nextLine();
        int euros = Integer.parseInt(str1);

        System.out.print("What is the exchange rate? ");
        String str2 = input.nextLine();
        double rate = Double.parseDouble(str2);

        double dollars = euros * rate;

        String outputString = euros + " euros at an exchange rate of " + rate + " is\n";

        System.out.format(outputString + "%.2f U.S. dollars.", dollars);
    }
}
