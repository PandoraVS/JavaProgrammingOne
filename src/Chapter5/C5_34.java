package Chapter5;

import java.util.Scanner;

/**
 * Program to play rock, paper, scissors
 *
 * @author Sherri Oliven
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int CompGuess, PlayerGuess;
        int CompCount = 0, PlayerCount = 0;
        do {
            System.out.print("Enter 0 for Rock, Enter 1 for Paper, Enter 2 for Scissors: ");
            PlayerGuess = input.nextInt();
            CompGuess = (int) (Math.random() * 3); // Either chooses 0, 1, or 2, Excludes 3//
            switch (PlayerGuess) {
                case 0:
                    if (CompGuess == 0) {
                        System.out.println("It's a tie :/ \n");
                        break;
                    }
                    if (CompGuess == 1) {
                        System.out.println("You lose! :( \n");
                        CompCount++;
                        break;
                    }
                    if (CompGuess == 2) {
                        System.out.println("You Win! :D! \n");
                        PlayerCount++;
                        break;
                    }
                case 1:
                    if (CompGuess == 1) {
                        System.out.println("It's a tie :/ \n");
                        break;
                    }
                    if (CompGuess == 2) {
                        System.out.println("You lose! :( \n");
                        CompCount++;
                        break;
                    }
                    if (CompGuess == 0) {
                        System.out.println("You Win! :D! \n");
                        PlayerCount++;
                        break;
                    }
                case 2:
                    if (CompGuess == 2) {
                        System.out.println("It's a tie :/ \n");
                        break;
                    }
                    if (CompGuess == 0) {
                        System.out.println("You lose! :( \n");
                        CompCount++;
                        break;
                    }
                    if (CompGuess == 1) {
                        System.out.println("You Win! :D! \n");
                        PlayerCount++;
                        break;
                    }

            }

        } while ((PlayerCount <= 2) && (CompCount <= 2));

        if (PlayerCount == 3) {
            System.out.printf("Player Wins with a score of: %d\n", PlayerCount);
        } else if (CompCount == 3) {
            System.out.printf("Computer Wins with a score of: %d\n", CompCount);
        }
    }
}
