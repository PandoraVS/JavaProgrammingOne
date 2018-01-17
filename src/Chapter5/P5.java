package Chapter5;

import java.util.Scanner;

/**
 * Program to enter, count, and display votes
 *
 * @author Sherri Oliven
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int YesCount = 0;
        int NoCount = 0;

        String Voter;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Y for Yes, N for No, or Q to quit voting and tally the results: ");
        Voter = input.next().toLowerCase();

        while (!Voter.equals("q")) {
            switch (Voter) {
                case "y":
                    ++YesCount;
                    break;
                case "n":
                    ++NoCount;
                    break;
                default:
                    System.out.println("Invalid Answer! ");
                    break;

            }

            System.out.println("Enter Y for Yes, N for No, or Q to quit voting and tally the results: ");
            Voter = input.next().toLowerCase();
        }
        System.out.println("Votes for Yes: " + YesCount);
        System.out.println("Votes for No: " + NoCount);
    }
}
