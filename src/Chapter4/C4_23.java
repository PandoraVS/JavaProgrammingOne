package Chapter4;

import java.util.Scanner;

/**
 * Program to determine someone's pay
 *
 * @author Sherri Oliven
 */

public class C4_23 {
      /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee's Name: ");
        String Name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter Hourly pay rate: ");
        double payrate = input.nextDouble();
        System.out.print("Enter federal tax witholding rate: ");
        double fedtax = input.nextDouble();
        System.out.print("Enter state tax witholding rate: ");
        double statetax = input.nextDouble();
        double grosspay = payrate * hours;
        double fedwithold = grosspay * .20;
        double statewithold = grosspay * .09;
        double totalloss = fedwithold + statewithold;
        double netpay = grosspay - totalloss;

        //Printing :)//
        System.out.printf("\nEmployee Name: %s", Name);
        System.out.printf("\nNumber of hours worked in a week: %.2f", hours);
        System.out.printf("\nPay Rate: $%.2f", payrate);
        System.out.printf("\nGross Pay: $%.2f", grosspay);
        System.out.printf("\nDeductions: ");
        System.out.printf("\nFederal witholding (%.2f%%):$%.2f ", (fedwithold * 100), fedtax);
        System.out.printf("\nState witholding (%.2f%%): $%.2f ", (statewithold * 100), statewithold);
        System.out.printf("\nTotal deduction: $%.2f ", totalloss);
        System.out.printf("\nNet Pay: $%.2f ", netpay);

    }

}
