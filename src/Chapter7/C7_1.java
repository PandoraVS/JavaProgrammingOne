package Chapter7;

import java.util.Scanner;

/**
 * Program to calculate the best grade in the class
 *
 * @author Sherri Oliven
 */
public class C7_1 {

    public static int best = 0;

    public static void main(String args[]) {

        /**
         * Main Method
         *
         * @param args arguments from the command line prompt
         */
        char grade;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Students: ");
        int scores[] = new int[input.nextInt()];
        System.out.printf("Enter %d Scores: ", scores.length);
        fillArray(scores, input);
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= (best - 10)) {
                grade = 'A';
            } else if (scores[i] >= (best - 20)) {
                grade = 'B';
            } else if (scores[i] >= (best - 30)) {
                grade = 'C';
            } else if (scores[i] >= (best - 40)) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.printf("Student %d  Score is %d and Grade is %c \t", i, scores[i], grade);

        }
    }

    /**
     * Method to fill the array
     *
     * @param scores a blank array to hold the input given by the user
     *
     * @param input given from the user to fill the array
     */
    public static void fillArray(int scores[], Scanner input) {

        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
            if (scores[i] > best) {
                best = scores[i];
            }
        }
    }

}
