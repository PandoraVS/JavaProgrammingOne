
package Chapter7;
 import java.util.*;
/**
 * Program to 
 *
 * @author Sherri Oliven
 */
/**
 *
 * @author 
 */
public class P7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will be read: ");
        int[] mylist = new int[input.nextInt()];

        System.out.printf("Enter %d elements: ", mylist.length);
        fillArray(mylist, input);
        System.out.println("The Average is " + Average(mylist));
        Contents(mylist);
    }

    public static void fillArray(int[] mylist, Scanner input) {
        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = input.nextInt();
        }
    }

    public static double Average(int[] mylist) {
        double sum = 0;

        for (int counter = 0; counter < mylist.length; counter++) {
            sum += mylist[counter];
        }
        return (sum / mylist.length);
    }
      public static void Contents(int[] mylist) {
          System.out.println("The Contents of the Array:");
          System.out.println(Arrays.toString(mylist));
          
      }
}
  
