/* Maximus Mackert,
 * 2/10/2019,
 * I created a program that promts the user to enter points and displays whether 
 * or not those points are within the triangle
 */

import java.util.Scanner;

public class geometry {

	public static void main(String[] args) {
		//enter scanner and variables
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for point x");
		double x = input.nextDouble();
		System.out.println("Enter a value for point y");
		double y = input.nextDouble();
		//calculate points
		if (x >= 5)
			System.out.println("outside triangle");
		else if (x <= -5)
			System.out.println("outside triangle");
		else if (y >= 2.5)
			System.out.println("outside triangle");
		else if (y <= -2.5)
			System.out.println("outside triangle");
		else System.out.print("inside triangle");
	}

}
