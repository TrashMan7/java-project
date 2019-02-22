/*Maximus Mackert,
 * 2/21/2019,
 * I created a program that left pads a number with 0s base on the width of the number. If the width
 * is smaller than the length of the number it will print the number
 */

import java.util.Scanner;

public class FormatInteger {
//main method prints string
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		System.out.println("Enter a width for the number: ");
		int width = input.nextInt();
		System.out.print(format(number, width));
	}
	//format method creates string
	public static String format(int number, int width){
		
		String num = Integer.toString(number);
		int g = width - num.length();
		String s = (" ");
		while (g > 0) {
			s = s + "0";
			g--;
		}
		s = s + number;
		return s;
		
	}
}
