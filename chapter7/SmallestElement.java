/*Maximus Mackert,
 * 2/27/2019,
 * I created a program that displays the smallest element of an array
 */
import java.util.Scanner;
public class SmallestElement {
//main method passes the contents of the array
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double [] test = new double [10];
		System.out.print("Enter 10 numbers separated by a space: ");
		for (int i = 0; i < test.length; i++) {
			test[i] = input.nextDouble();
		}
		System.out.print("The Smallest element is: " + min(test));
	}
	//this method finds the smallest element and returns it to the main method
	public static double min(double[] array) {
		double min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
			
		return min;
	}
	
}
