/*
 John Kluck
CSCI 1010/1011
 */
package numbergrid;

import java.util.*;

public class NumberGrid {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        int numberOne, numberTwo, count = 0;
        String inputString;

        System.out.println("Enter two numbers: \n");

        inputString = kbd.next();
        numberOne = Integer.parseInt(inputString);
        inputString = kbd.next();
        numberTwo = Integer.parseInt(inputString);

        System.out.println("The numbers from 1000-2000 which are divisible by " + numberOne + " and " + numberTwo + " are:\n");

        for (int i = 1000; i <= 2000; i++) {
            if (i % numberOne == 0 && i % numberTwo == 0) {
                System.out.print(i + " ");
                count++;

                if (count == 10) {
                    System.out.print("\n");
                    count = 0;
                }
            }
        }

        kbd.close();
    }
}
