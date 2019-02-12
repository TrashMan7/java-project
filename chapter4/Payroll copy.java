/*Maximus Mackert,
 * 2/11/2019,
 * I have created a program that displays your payroll
 */

import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {
		//enter employee information
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Employee's name: ");
		String name = input.next();
		System.out.println("Enter number of HoursWorked: ");
		double HoursWorked = input.nextDouble();
		System.out.println("Enter hourly PayRate: ");
		double PayRate = input.nextDouble();
		System.out.println("Enter FederalTaxRate in decimals: ");
		double FederalTaxRate = input.nextDouble();
		System.out.println("Enter StateTaxRate in decimals: ");
		double StateTaxRate = input.nextDouble();
		//calculate payments and deductions
		double GrossPay = (HoursWorked * PayRate);
		double FederalWithholding = (GrossPay * FederalTaxRate);
		double StateWithholding = (GrossPay * StateTaxRate);
		double TotalDeduction = (FederalWithholding + StateWithholding);
		double NetPay = (GrossPay - TotalDeduction);
		//print payroll
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + HoursWorked);
		System.out.println("Pay Rate: " + PayRate);
		System.out.println("Gross Pay: " + GrossPay);
		System.out.println("Deductions: ");
		System.out.println("Federal Withholding: " + FederalWithholding);
		System.out.println("State Withholding: " + StateWithholding);
		System.out.println("Total Deductions: " + TotalDeduction);
		System.out.print("Net Pay" + NetPay);
		
		
	}

}
