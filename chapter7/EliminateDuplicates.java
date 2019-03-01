/* Maximus Mackert,
 * 2/28/2019,
 * I created a program that has two methods one enters an array the other eliminates the duplacated numbers in the array then
 * the array is printed
 */
import java.util.Scanner;
public class EliminateDuplicates {
// Main method 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] numbers = new int [10];
		System.out.println("Enter 10 numbers separated by a space: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
			
		}
		//prints new array
		int [] result = eliminateDuplicates(numbers);
		System.out.println("The numbers without duplicates are: ");
		for (int n = 0; n < result.length; n++) {
			if (result[n] != 0) {
			System.out.print(result[n] + " ");
			}
		}
	}
//eliminate duplacates method returns new array
	public static int[] eliminateDuplicates(int [] list) {
		int [] result = new int[10];
		int count = 0;
		for (int i = 0; i < list.length; i++) {
			
			for (int j = 0; j < result.length; j++) {
				if (list[i] != result[j]) {
					if(j == count) {
						if(j < list[i]) {
							result[j] = list[i];
							count++;
							j = list.length;
						}
						
					}	
				}
				else
					j = list.length;
			}
		}
		
		return result;
	}
}