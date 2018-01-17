package Chapter3;

import java.util.Scanner;

/**
 * Program to guess for heads or tails with input
 *
 * @author Sherri Oliven
 */

public class C3_14 {
      /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */


    public static void main(String[] args) {
        //Creating the Scanner
        Scanner input = new Scanner(System.in);

        //Allowing input
        System.out.print("Enter either 0 - for heads or enter 1 - for tails : ");
        int number = input.nextInt();

        //generating between heads or tails 
        int number1 = ((int) (Math.random() * 2));
        //determining if the user’s guess was right or wrong
        if (number1 != number) {
            System.out.println("Your guess was incorrect. It was " + number1);

        } else if (number1 == number) {
            System.out.println("Your guess was correct! Good guess!");
        }

    }
}
