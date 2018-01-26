package Chapter7;

import java.util.*;

/**
 * Program to fill an array with input specified from user then calculate the
 * average
 *
 * @author Sherri Oliven
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will be read: ");
        int[] mylist = new int[input.nextInt()];

        System.out.printf("Enter %d elements: ", mylist.length);
        fillArray(mylist, input);
        System.out.println("The Average is " + Average(mylist));
        Contents(mylist);
    }

    /**
     * Method to Fill the array
     *
     *
     * @param  input is the input given by the user
     * @param mylist is the empty array with declared number of elements
     *
     */
    public static void fillArray(int[] mylist, Scanner input) {
        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = input.nextInt();
        }
    }

    /**
     * Method to gather the average value of the elements in the array
     *
     * @param mylist to get all the elements in the list to get the average
     * @return the sum of the elements divided by the length for the average
     */
    public static double Average(int[] mylist) {
        double sum = 0;

        for (int counter = 0; counter < mylist.length; counter++) {
            sum += mylist[counter];
        }
        return (sum / mylist.length);
    }

    /**
     * Method to display the contents of the Array
     *
     * @param mylist is the Array contents specified from the user
     *
     */
    public static void Contents(int[] mylist) {
        System.out.println("The Contents of the Array:");
        System.out.println(Arrays.toString(mylist));

    }
}
