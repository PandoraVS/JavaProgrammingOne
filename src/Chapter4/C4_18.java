package Chapter4;

import java.util.Scanner;

/**
 * Program to determine what year and major the user is
 *
 * @author Sherri Oliven
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        System.out.print("Enter two Characters: ");
        Scanner input = new Scanner(System.in);
        String a = input.next();

        char b = a.charAt(0);
        char c = a.charAt(1);

        if (c != '1' && c != '2' && c != '3' && c != '4') {

            System.out.println("Invalid input");
            System.exit(0);
        }

        switch (b) {
            case 'M':
                System.out.print("Mathmatics ");
                break;
            case 'C':
                System.out.print("Computer Science ");
                break;
            case 'I':
                System.out.print("Information Technology ");
                break;
            default:
                System.out.println("Invalid input");
                System.exit(0);
        }

        switch (c) {
            case '1':
                System.out.println("Freshman");
                break;
            case '2':
                System.out.println("Sophomore");
                break;
            case '3':
                System.out.println("Junior");
                break;
            case '4':
                System.out.println("Senior");
                break;

        }
    }
}
