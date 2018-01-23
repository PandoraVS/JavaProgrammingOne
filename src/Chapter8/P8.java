package Chapter8;

import java.util.*;

/**
 * This program will keep track of the sales for a team of salesmen over the
 * days Monday through Friday.
 *
 * @author Sherri Oliven
 */
public class P8 {

    public static void main(String[] args) {
        /**
         * Main Method
         *
         * @param args arguments from command line prompt
         */
        Scanner input = new Scanner(System.in);
        int r = 0;
        int c = 0;
        double[][] money = new double[4][5];
        String[] weekday = {"Mon", "T", "W", "H", "F"};
        String salesman, week, answer;
        do {
            do {
                System.out.print("Enter the salesman ID as A, B, C, or D: ");
                salesman = input.next().toUpperCase();
            } while (!salesman.equals("A") && !salesman.equals("B") && !salesman.equals("C") && !salesman.equals("D"));

            switch (salesman) {
                case "A":
                    r = 0;
                    break;
                case "B":
                    r = 1;
                    break;
                case "C":
                    r = 2;
                    break;
                case "D":
                    r = 3;
                    break;
            }
            do {
                System.out.print("Enter the day as M, T, W, H, or F: ");
                week = input.next().toUpperCase();
            } while (!week.equals("M") && !week.equals("T") && !week.equals("W") && !week.equals("H") && !week.equals("F"));

            switch (week) {
                case "M":
                    c = 0;
                    break;
                case "T":
                    c = 1;
                    break;
                case "W":
                    c = 2;
                    break;
                case "H":
                    c = 3;
                    break;
                case "F":
                    c = 4;
                    break;
            }
            System.out.print("Enter the amount of the sale: ");
            money[r][c] += input.nextDouble();
            do {
                System.out.println("More data? Enter Y to continue or N to stop: ");
                answer = input.next().toUpperCase();
            } while (!answer.equals("Y") && !answer.equals("N"));
        } while (!answer.equals("N"));
        for (String weekday1 : weekday) {
            System.out.println(weekday1);
        }
        for (int x = 0; x < money.length; x++) {
            System.out.print("Salesman " + x);
            for (int y = 0; y < money[x].length; y++) {
                System.out.print("\t" + money[x][y]);
            }
            System.out.println();
        }

    }
}
