import java.util.Scanner;

/**
 * Michael Hailemariam
 * CSC 201
 * Chapter 5 Exercise 1
 * Count positive and negative numbers and compute the average of numbers
 * input zero as final number to get result
 */
 


public class PosNegNum {

    public static void main(String[] args) {

        int positive = 0;
        int negative = 0;
        int total = 0;
        double average = 0;
        System.out.print("Enter an integer, the input ends if it is 0: ");
        Scanner input = new Scanner(System.in);

        for (int buffer = -1; buffer != 0; ) {

            buffer = input.nextInt();
            if (buffer > 0) positive++;
            else if (buffer < 0) negative++;
            total += buffer;
        }
        if (positive + negative == 0) {
            System.out.println("No numbers are entered except 0");
            System.exit(0);
        }
        average = total /(double)(positive + negative);
        System.out.println("The number of positives is " + positive);
        System.out.println("The number of negatives is " + negative);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);
    }
}
