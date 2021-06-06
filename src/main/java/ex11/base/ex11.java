package ex11.base;

/* At some point, you might have to deal with currency exchange rates, and you’ll need to ensure your calculations are as precise as possible.

Write a program that converts currency. Specifically, convert euros to U.S. dollars. Prompt for the amount of money in euros you have, and prompt for the current exchange rate of the euro. Print out the new amount in U.S. dollars.

The formula for currency conversion is derived from

c_to / c_frame = rate
where

c_to is the amount in U.S. dollars.
c_from is the amount in euros.
rate is the per-unit current exchange rate from c_from to c_to.
Example Output
How many euros are you exchanging? 81
What is the exchange rate? 1.3751
81 euros at an exchange rate of 1.3751 is
111.38 U.S. dollars.
Constraints
Ensure that fractions of a cent are rounded up to the next penny.
Use a single output statement.
Challenges
Build a dictionary of conversion rates and prompt for the countries instead of the rates.
Wire up your application to an external API that provides the current exchange rates.
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
