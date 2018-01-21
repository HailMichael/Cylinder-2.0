import java.util.Scanner;

/**
 * Michael Hailemariam
 * CSC 201 
 * Computes the area and volume of a cylinder
 */

public class Cylinder {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();

		Scanner input2 = new Scanner(System.in);
		System.out.print("Enter a number for length: ");
		double length = input2.nextDouble();

		double area = radius * radius * 3.14159;
		System.out.println ("The area for the cylinder of radius " + radius + " is " + area);

		double volume = area * length;
		System.out.println ("The volume for the cylinder of length " + length + " is " + volume);


	}
}

