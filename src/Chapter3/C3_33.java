package Chapter3;

import java.util.Scanner;

/**
 * Program to determine the best price of two packages
 *
 * @author Sherri Oliven
 */

public class C3_33 {
      /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Input from user
        System.out.print("Enter the weight of package 1: ");
        double weight1 = input.nextDouble();
        System.out.print("Enter the price of package 1: ");
        double price1 = input.nextDouble();
        System.out.print("Enter the weight of package 2: ");
        double weight2 = input.nextDouble();
        System.out.print("Enter the price of package 2: ");
        double price2 = input.nextDouble();
        //computing best price
        double unitprice1 = (price1 / weight1);

        double unitprice2 = (price2 / weight2);
        //distplaying best price to user
        if (unitprice1 > unitprice2) {
            System.out.println("Package 2 has the better value.");
        } else if (unitprice1 < unitprice2) {
            System.out.println("Package 1 has the better value.");
        } else if (unitprice1 == unitprice2) {
            System.out.println("Package 1 and Package 2 have the same value");
        }
    }
}
