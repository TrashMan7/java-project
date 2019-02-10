/* Maximus Mackert,
 * 2/8/2019,
 * I have created a program to solve 2 * 2 equations with an option
 * to print no solution if the denominator is 0
 */
import java.util.Scanner;

class Algebra2 {
	public static void main(String[] args) {
	
		//assign variables and promt user to enter their values
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for the variables A:");
		double A = input.nextDouble(); 
		System.out.print("Enter a value for the variables B:");
		double B = input.nextDouble();
		System.out.print("Enter a value for the variables C:");
		double C = input.nextDouble();
		System.out.print("Enter a value for the variables D:");
		double D = input.nextDouble();
		System.out.print("Enter a value for the variables E:");
		double E = input.nextDouble();
		System.out.print("Enter a value for the variables F:");
		double F = input.nextDouble();
		
		
		//calculate x
		System.out.println("Equation x (E * D - B * F) / (A * D - B * C) = x = ");
		System.out.println("Answer: " + (E * D - B * F ) / (A * D - B * C));
		
		//calculate y
		System.out.println("Equation y (A * F - E * C) / (A * D - B * C) = y = ");
		System.out.println("Answer: " + (A * F - E * C) / (A * D - B * C));
		
		if (A * D - B * C == 0)
			System.out.println("The equation has no solution.");
		
	}
}