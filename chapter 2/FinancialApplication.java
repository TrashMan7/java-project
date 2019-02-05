/* Maximus Mackert,
   2/4/2019,
I Created a scanner that can calculate 6 months savings with an interest rate. */

import java.util.Scanner;

class FinancialApplication {
	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//Enter monthly interest rate
		System.out.print("Enter Interestrate(as decimal):");
		double interestrate = input.nextDouble();
		
		//Enter monthly savings
		System.out.print("Enter monthlysavings:");
		double monthlysavings = input.nextDouble();
		
		//Calculate 6 months worth of savings
		double onemonth = monthlysavings * (1 + interestrate);
		
		double twomonth = (monthlysavings + onemonth) * (1 + interestrate);
		
		double threemonth = (monthlysavings + twomonth) * (1 + interestrate);
		
		double fourmonth = (monthlysavings + threemonth) * (1 + interestrate);
		
		double fivemonth = (monthlysavings + fourmonth) * (1 + interestrate);
		
		double sixmonth = (monthlysavings + fivemonth) * (1 + interestrate);
		
		System.out.print("The total savings for six months is: ");
		
		System.out.println(sixmonth);
	}
}