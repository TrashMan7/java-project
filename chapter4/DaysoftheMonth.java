/*Maximus Mackert,
 * 2/11/2019,
 * I created a program to calculate how many days a month has based on the 
 * year and the month
 */

import java.util.Scanner;

public class DaysoftheMonth {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		System.out.print("Enter the first three letters of a month with the "
				+ "first letter capitalized: ");
		String Month = input.next();
		int Feb = 28;
		//calculate leap year
				if (year % 4 == 0 && year % 100 != 0) {
					Feb = 29;}
				if (year % 400 == 0) {
					Feb = 29;}
		//calculate months
		if (Month.equals("Jan"))
			System.out.println(Month + " " +  year + " " +  "has 31 days");
		else if (Month.equals("Mar"))
			System.out.println(Month + " "+  year + " " + "has 31 days");
		else if (Month.equals("May"))
			System.out.println(Month + " "+ year + " " + "has 31 days");
		else if (Month.equals("Jul"))
			System.out.println(Month + " "+ year + " " + "has 31 days");
		else if (Month.equals("Sep"))
			System.out.println(Month + " "+ year + " " + "has 30 days");
		else if (Month.equals("Feb"))
			System.out.println(Month + " " + year + " " + "has" + " " + Feb + " " + "days");
		else if (Month.equals("Nov"))
			System.out.println(Month + " " + year + " " + "has 30 days");
		else if (Month.equals("Apr"))
			System.out.println(Month + " " + year + " " + "has 30 days");
		else if (Month.equals("Jun"))
			System.out.println(Month + " " + year + " " + "has 30 days");
		else if (Month.equals("Aug"))
			System.out.println(Month + " " + year + " " + "has 31 days");
		else if (Month.equals("Oct"))
			System.out.println(Month + " " + year + " " + "has 31 days");
		else if (Month.equals("Dec"))
			System.out.println(Month + " " + year + " " + "has 31 days");
		
		
	}

}
