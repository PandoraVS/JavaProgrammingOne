package Chapter6;

import java.util.Scanner;

/**
 * Program to determine if a password is valid or invalid
 *
 * @author Sherri Oliven
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command ling prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Password: ");
        String password = input.next();
        if (validPass(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

    }

    /**
     * Method to check the validity of password
     *
     * @param password the password entered from user
     * @return true if valid or false if not valid
     */
    public static boolean validPass(String password) {
        int numcount = 0;
        if (password.length() < 8) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numcount++;
            }
        }

        if (numcount < 2) {
            return false;
        } else {
            return true;
        }
    }
}
