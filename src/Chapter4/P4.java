package Chapter4;

import java.util.Scanner;

/**
 * Program to determine the better bid
 *
 * @author Sherri Oliven
 */
public class P4 {
      /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the name of the first bidder?: ");
        String FirstBidder = input.next();
        System.out.print("How many hours of work does " + FirstBidder + " Require?: ");
        int Firstworkhours = input.nextInt();
        System.out.print("How much does " + FirstBidder + " charge per hour?: ");
        double Firsthourcharge = input.nextDouble();

        /*Second Bidder*/
        System.out.print("What is the name of the Second bidder?: ");
        String SecondBidder = input.next();
        System.out.print("How many hours of work does " + SecondBidder + " Require?: ");
        int Secondworkhours = input.nextInt();
        System.out.print("How much does " + SecondBidder + " charge per hour?: ");
        double Secondhourcharge = input.nextDouble();

        double Secondrate = Secondworkhours * Secondhourcharge;
        double Firstrate = Firstworkhours * Firsthourcharge;

        if (Secondrate < Firstrate) {
            System.out.printf("The Winner is %s with a total cost of $%.2f", SecondBidder, Secondrate);
        }

        if (Secondrate > Firstrate) {
            System.out.printf("The Winner is %s with a total cost of $%.2f", FirstBidder, Firstrate);
        }

        if (Secondrate == Firstrate && Firstworkhours < Secondworkhours) {
            System.out.printf("The Winner is %s with a total cost of $%.2f an"
                    + "d %d hours", SecondBidder, Secondrate, Secondworkhours);
        }

        if (Secondrate == Firstrate && Secondworkhours < Firstworkhours) {
            System.out.printf("The Winner is %s with a total cost of $%.2f an"
                    + "d %d hours", FirstBidder, Firstrate, Firstworkhours);
        }

        if (Secondrate == Firstrate && Secondworkhours == Firstworkhours) {
            System.out.printf("%s and %s have identical bids.", FirstBidder, SecondBidder);
            System.out.printf("\nTheir bids were $%.2f", Firstrate);
            System.out.printf("\n They're equal in hours, with %s and %s having %d hours.\n", FirstBidder, SecondBidder, Firstworkhours);
        }
    }
}
