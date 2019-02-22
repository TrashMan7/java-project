/*Maximus Mackert,
 2/20/2019,
 I created program that displays whether or not a number is a palidrome.*/

import java.util.Scanner;

public class PalidromeProject {
//main method
	public static void main(String[] args ){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		if (isPalidrome(num)) {	
			System.out.println("The number " + num + " is a Palidrome.");
		}
		else {
			System.out.println("The number " + num + " is not a Palidrome.");
			}
	}
	//reverse number method
	public static int reverse(int num) {
		int n = 0;
		
		//calculate reverse number
		while (num != 0) {
			n = n * 10 + num % 10;
			num = num / 10;
		}
		return n;
	}
	//isPalidrome method
	public static boolean isPalidrome(int num){
		int n = reverse(num);
		
		//determine if number is palidrome
		boolean result;
		if (n == num){
			result = true;
		}
		else {
			result = false;
		}
			return result;
	}
		 
}
