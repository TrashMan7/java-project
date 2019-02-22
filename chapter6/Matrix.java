/*Maximus Mackert,
 * 2/21/2019,
 * I created a program that displays a matrix of 1s and 0s based on the input of the user
 */

import java.util.Scanner;

public class Matrix {
	//main method calls printMatrix
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		printMatrix(n);
	}

	//printMatrix method builds matrix
	public static void printMatrix(int n) {
		int r;
		
		for(int i = 0; i < n; i++) {
			for (r = 0; r < n; r++) {
				System.out.printf("%3d", (int) (Math.random() * 2));
			}
			System.out.println();
		}
	}
}