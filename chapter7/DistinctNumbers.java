/*Maximus Mackert,
 * 2/27/2019,
 * I created a program that prints distinct numbers in an array
 */
import java.util.Scanner;

public class DistinctNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double [] numbers = new double [10];
		double nxtbox = 0;
		double val;
		//This loop keeps track of the array entering values one at a time
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter a number: ");
			val = input.nextInt();
			
		// This loop is for checking if the value is already present
			for (int j = 0; j < numbers.length; j++){
				if (val != numbers[j]) {
					if(nxtbox == j) {
						numbers[j] = val;
						nxtbox++;
						j = numbers.length;
					}
				}
				else 
					j = numbers.length;
			}
		}
		//This loop is for printing the array
		for (int n = 0; n < numbers.length; n++) {
			if (numbers[n] == 0)
				System.out.print("");
			else
				System.out.println(numbers[n] + " ");
		}
	}
}
