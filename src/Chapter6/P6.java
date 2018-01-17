/*
 * Program to convert dollars to another currency
 * 
 * @author Sherri Oliven
 */
package Chapter6;

import java.util.Scanner;

public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     *
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //implementing a stop variable
        int stop = 0;
        double converting = 0;
        String Asking;
        //Asking Initial Conversions
        System.out.print("How many Euros will a dollar buy?: ");
        double eurosperdollar = input.nextDouble();
        System.out.print("How many Pound Sterling will a dollar buy? ");
        double poundperdollar = input.nextDouble();
        System.out.print("How many Yen will a dollar buy? ");
        double yenperdollar = input.nextDouble();
        while (stop == 0) {
            System.out.print("How many dollars are you converting?: ");
            double dollars = input.nextDouble();
            System.out.print("Which currency do you want to Convert to?(Note:  Enter E for Euros, P for pounds, or Y for Yen): ");
            String converto = input.next().toUpperCase();
            switch (converto) {
                case "E":
                    converting = eurosperdollar;
                    break;
                case "Y":
                    converting = yenperdollar;
                    break;
                case "P":
                    converting = poundperdollar;
                    break;

            }
            System.out.printf("The amount from dollars to the selected currency is %.2f \n", Conversion(dollars, converting));

            do {
                System.out.println("Are there any more conversions you'd like to make?");
                Asking = input.next().toUpperCase();
                switch (Asking) {
                    case "YES":
                        break;
                    case "NO":
                        System.out.println("Okay! Goodbye ☺");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Sorry! I didn't understand that! please enter either 'yes' or 'no' please!");
                        break;
                }
            } while (!Asking.equals("YES"));

        }
    }

    public static double Conversion(double d, double c) {
        double fee;
        double finalTotal;
        if (d <= 100) {
            fee = d * 0.10;
            finalTotal = (d - fee) * c;
        } else {
            fee = d * 0.05;
            finalTotal = (d - fee) * c;
        }

        return finalTotal;
    }
}
