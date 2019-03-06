/*Maximus Mackert,
 * 3/4/2019,
 * I created a game of heads and tails the user enters a number and then it displays 
 * the number of heads and tails in the form of a matrix
 */
import java.util.Scanner;
public class HeadsNTails {
//main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		String[] HorT = convertBinary(num);
		printMatrix(HorT);
	}
	//this method prints the matrix
	public static void printMatrix(String [] HorT) {
		for(int i = 0; i < HorT.length; i++) {
			if (i % 3 == 0) {
				System.out.println();
			}
			System.out.printf("%3s",HorT[i]);
		}
	}
	//this method converts the number to binary 
	public static String [] convertBinary(int num) {
		int [] number = new int [9];
		for (int i = 0; i < number.length; i++) {
			number[i] = 0;
		}
		if (num - 256 >= 0) {
			number [0] = 1;
			num -= 256;
		}
		if (num - 128 >= 0) {
			number [1] = 1;
			num -= 128;
		}
		if (num - 64 >= 0) {
			number [2] = 1;
			num -= 64;
		}
		if (num - 32 >= 0) {
			number [3] = 1;
			num -= 32;
		}
		if (num - 16 >= 0) {
			number [4] = 1;
			num -= 16;
		}
		if (num - 8 >= 0) {
			number [5] = 1;
			num -= 8;
		}
		if (num - 4 >= 0) {
			number [6] = 1;
			num -= 4;
		}
		if(num - 2 >= 0) {
			number [7] = 1;
			num -= 2;
		}
		if (num - 1 >= 0) {
			number [8] = 1;
			num -= 1;
		}
		String[] HT = new String[9];
		int count = 0;
		for (int j = 0; j < number.length; j++) {
			for (int k = 0; k < HT.length; k++)
				if(count == k) {
					if (number[j] == 0) {
						HT[k] = "H";
						k = HT.length;
						count++;
			}
					else {
						HT[k] = "T";
						k = HT.length;
						count++;
					}
		}	
	}
		return HT;
	}
}
