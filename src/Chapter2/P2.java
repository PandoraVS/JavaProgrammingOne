package Chapter2;

import java.util.Scanner;

/**
 * Program to display the price of the meal and the tip
 *
 * @author Sherri Oliven
 */

public class P2 {
      /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of the meal, the price of the drink, "
                + "and the price of the dessert in dollars.(in order):");
        double meal = input.nextDouble();
        double drink = input.nextDouble();
        double dessert = input.nextDouble();

        double food = (meal + drink + dessert);

        double salestax = food * 0.10;
        double tip = (food + salestax) * 0.15;

        System.out.println(food + " is the price of the entire meal ordered in dollars "
                + salestax + " is the price in sales tax, and " + tip + " is the price in tip."
                + " The entire meal would cost = " + (food + salestax + tip) + " dollars.");
    }
}
