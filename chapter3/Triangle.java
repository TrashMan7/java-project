/* Maximus Mackert,
 * 2/10/2019,
 * I have created a program that finds the perimeter of a triangle, if two sides sum
 * is greater than the third side 
 */

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		//create variables
		System.out.println("Enter a value for sideA: ");
		double sideA = input.nextDouble();
		System.out.println("Enter a value for sideB: ");
		double sideB = input.nextDouble();
		System.out.println("Enter a value for sideC: ");
		double sideC = input.nextDouble();
		
		double perimeter = sideA + sideB + sideC;
		//if statement
		if (sideA + sideB <= sideC)
			System.out.println("Input not valid");
			else if (sideA + sideC <= sideB)
				System.out.println("Input not valid");
			else if ( sideC + sideB <= sideA)
				System.out.println("Input is not valid");
			else 
		System.out.print("The perimeter of the triangle is: " + perimeter);
		
	}

}
