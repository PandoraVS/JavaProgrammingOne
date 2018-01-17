package Chapter3;

import java.util.Scanner;

/**
 * Program to have two numbers and gives a description of the numbers
 *
 * @author Sherri Oliven
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        if (num1 < num2) {
            System.out.println("The first number is less than the second");
        } else if (num1 > num2) {
            System.out.println("The first number is greater than the second.");
        } else if (num1 == num2) {
            System.out.println("The first number is equal to the second.");
        } else if (num1 <= num2) {
            System.out.println("The second number is less than or equal"
                    + " the second number");
        } else if (num1 != num2) {
            System.out.println("The first number is not equal to the second.");
        }
        //#10 
        if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
        } else if (num1 / num2 < 1) {
            System.out.println(" proper fraction");
        } else {
            System.out.println("improper fraction");
        }
        //#11
        if (num1 >= 90) {
            System.out.println("A");
        } else if (num1 >= 80) {
            System.out.println("B");
        } else if (num1 >= 70) {
            System.out.println("C");
        } else if (num1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        //12
        if (num2 >= 1 && num2 <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }

    }
}
