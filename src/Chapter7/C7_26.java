package Chapter7;

import java.util.Scanner;

/**
 * Program to get the lists from the user and determine if they're identical
 *
 * @author Sherri Oliven
 */
public class C7_26 {

    public static void main(String[] args) {
        /**
         * Main Method
         *
         * @param args arguments from the command prompt
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list 1: ");
        int[] list1 = new int[input.nextInt()];
        FillArray(list1, input);

        System.out.print("Enter list 2: ");
        int[] list2 = new int[input.nextInt()];
        FillArray(list2, input);

        if (equals(list1, list2)) {
            System.out.println("The Two lists are strictly identical.");
        } else {
            System.out.println("The two lists are not strictly identical.");
        }
    }

    /**
     * Method to Fill the array
     *
     *
     * @param input is the input given by the user
     *
     * @param list is the empty array with declared number of elements
     *
     */
    public static void FillArray(int[] list, Scanner input) {
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
    }

    /**
     * Method to determine if the strings are equal
     *
     *
     * @param list1 is the input given by the user
     *
     * @param list2 is the empty array with declared number of elements
     *
     * @return true if the two lists are equal, false if they aren't
     */
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }

        return true;
    }

}
