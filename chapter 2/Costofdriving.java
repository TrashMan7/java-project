/* Maximus Mackert,
   2/4/2019,
I created a scanner that can calculate the price of a road trip */

import java.util.Scanner;

class Costofdriving {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//enter driving distance
		System.out.print("Enter DrivingDistance in miles:");
		double DrivingDistance = input.nextDouble();
		
		//enter miles per gallon
		System.out.print("Enter MilesPerGallon:");
		double MilesPerGallon = input.nextDouble();
		
		//enter price per gallon
		System.out.print("Enter PricePerGallon:");
		double PricePerGallon = input.nextDouble();		
		
		//calculate cost
		double Cost = DrivingDistance / MilesPerGallon * PricePerGallon;
		System.out.print("The total cost of the trip is: ");
		System.out.println(Cost);
		}
}