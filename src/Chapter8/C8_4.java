/**
 * Program to list the employees hours during the week
 *
 * @author Sherri Oliven
 */
package Chapter8;

public class C8_4 {

    public static int best = 0;

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        String[] week = {" ", "Su", "M", "T", "W", "Th", "F", "Sa", "Total"};
        int[][] employees = {{2, 4, 3, 4, 5, 8, 8, 34}, {7, 3, 4, 3, 3, 4, 4, 28}, {3, 3, 4, 3, 3, 2, 2, 20},
        {9, 3, 4, 7, 3, 4, 1, 31}, {3, 5, 4, 3, 6, 3, 8, 32}, {3, 4, 4, 6, 3, 4, 4, 28}, {3, 7, 4, 8, 3, 8, 4, 37},
        {6, 3, 5, 9, 2, 7, 9, 41}};
        for (String week1 : week) {
            System.out.print("\t" + week1);
        }
        System.out.println();
        for (int r = 0; r < employees.length; r++) {

            System.out.print("Employee " + r);
            for (int c = 0; c < employees[r].length; c++) {
                System.out.print("\t" + employees[r][c]);
            }
            System.out.println();
        }

    }

}
