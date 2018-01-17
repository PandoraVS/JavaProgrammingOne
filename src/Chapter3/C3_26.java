package Chapter3;

import java.util.Scanner;

/**
 * Program to enter an interger and displays truth or false based on the
 * question
 *
 * @author Sherri Oliven
 */

public class C3_26 {
      /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */


    public static void main(String[] args) {
        //Creating the Scanner
        Scanner input = new Scanner(System.in);

        //Allowing input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        //if statements for determining true or false and displaying value to user
        System.out.println("is " + number + " divisible by 5 and 6? " + (number % 5 == 0 && number % 6 == 0));

        System.out.println("is " + number + "  divisible by 5 or 6? " + (number % 5 == 0 || number % 6 == 0));

        System.out.println("is " + number + " divisible by 5 or 6, "
                + " but not both? " + (number % 5 == 0 ^ number % 6 == 0));

    }
}
