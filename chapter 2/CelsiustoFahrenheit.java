/* Maximus Mackert,
	2/1/2019,	
	I will be creating a scanner to convert degrees in celsius to fahrenheit */

import java.util.Scanner;


class CelsiustoFahrenheit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//create the scanner
		
		System.out.print("Enter a degree in Celsius:");
		double celsius = input.nextDouble();
		
		//convert celsius to fehrenheit
		double fahrenheit = (9.0/5.0) * celsius + 32;
		System.out.println("Fehrenheit " + fahrenheit + " is " + celsius + " in Celsius");
	}
}