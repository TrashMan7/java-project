/*Maximus Mackert,
 * 2/16/2019,
 * I created a program that tells the user to enter a number of rows and then 
 * displays a pyramid */

import java.util.Scanner;

public class DisplayPyramid {
	
	public static void main(String[] args) {
		//scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of lines");
		//variables
		int lines = input.nextInt();
		int num = 1;
		int print;
		//nested loops displaying pyramid
		for(print = 1; print <= lines; print++) {
			int i;
			for (i = lines - print; i >= 1; i--){
				System.out.print("   ");
			}
			
			for (num = print; num > 0; num--) {
				System.out.printf("%3d", num);
			}
			
			for (num = 2; num <= print; num++) {
				System.out.printf("%3d", num);
			}
					
			System.out.println();
			
		}
	}
}
