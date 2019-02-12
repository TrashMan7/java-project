/* Maximus Mackert,
 * 2/10/2019,
 * I have created a program that can calculate the area of a pentagon and round it to 
 * the nearest hundreth */

import java.util.Scanner;

public class AreaofPentagon {

	public static void main(String[] args) {
		//scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a radius");
		//input radius
		double r = input.nextDouble();
		//calculate side
		double s = 2 * r * Math.sin(Math.PI /5);
		//calculate area
		double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
		//round area
		double Area = Math.round(area * 100.00) / 100.00;
		System.out.println(Area);
	}

}
