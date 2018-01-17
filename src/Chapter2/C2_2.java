package Chapter2;

import java.util.Scanner;

/**
 * Displays the Volume and Area of a cylinder with any input
 *
 * @author Sherri Oliven
 */

public class C2_2 {
      /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder:");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.println("The Area is: " + area
                + " The Volume is: " + volume);
    }

}
