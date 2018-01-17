package Chapter5;

import java.util.Scanner;

/**
 * Program to display a reversed string
 *
 * @author Sherri Oliven
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String s = input.next();
        System.out.println("The reversed string is " + (new StringBuffer(s).reverse().toString()));
    }

}
