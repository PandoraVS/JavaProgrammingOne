package Chapter7;

import java.util.Scanner;

/**
 * Program to determine the minimum and maximum number in the array
 *
 * @author Sherri Oliven
 */
public class C7_9 {

    public static void main(String args[]) {
        /**
         * Main Method
         *
         * @param args arguments from the command prompt
         */
        double[] Array = new double[10];

        System.out.println("Enter 10 Numbers: ");
        FillArray(Array);
        System.out.printf("The minimum number is: " + minimum(Array));

    }

    /**
     * Method to fill the array
     *
     * @param Array a blank array to hold the input given by the user
     */
    public static void FillArray(double[] Array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < Array.length; i++) {
            Array[i] = input.nextDouble();
        }

    }

    /**
     * Main to find the minimum value in the array
     *
     * @param Array filled in by the user
     * 
     * @return min returns the minimum value of the elements
     */
    public static double minimum(double[] Array) {
        double min = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (min > Array[i]) {
                min = Array[i];
            }

        }
        return min;
    }
}
