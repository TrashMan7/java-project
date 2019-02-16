/*Maximus Mackert,
 * 2/16/2019,
 * I created a program that allows the user to enter a word and displays how many
 * vowels and consonants that word has */

import java.util.Scanner;

public class VowelsandConsonants {

	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);
		//input
		System.out.println("Enter a word without numbers or symbols: ");
		String word = input.next();
		//make word all caps
		word = word.toUpperCase();
		int consonants = 0, vowels = 0;
		//count vowels and consonants
		for (int w = 0; w < word.length(); w++ ){
			char ch = word.charAt(w);
			if (ch == 'A' || ch == 'O' || ch == 'I' || ch == 'U' || ch == 'E'){
				vowels++; 
			}
			else if (ch != 'A' || ch != 'O' || ch != 'I' || ch != 'U' || ch != 'E'){
				consonants++;
			}
		}
			System.out.println("Vowels: " + vowels);
			System.out.println("Consonants: " + consonants);
	}
}