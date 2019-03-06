/*Maximus Mackert,
 * 3/5/2019,
 * I created a program that is a quiz of the following states capitals not case sensitive
 */
import java.util.Scanner;
public class Capitals {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] stateCapitals = {
			{"Utah", "Saltlake"},
			{"Arizona", "Phoenix"},
			{"Nevada", "LasVegas"},
			{"California", "Sacramento"},
			{"Oregon", "Salem"},
			{"Texas", "Austin"},
			{"Colorado", "Denver"},
			{"Florida", "Tallahassee"},
			{"Alabama", "Montgomery"},
			{"Idaho", "Boise"},
			};
		System.out.println("What is the capital of these states: ");
		for (int i = 0; i < stateCapitals.length; i++) {
			System.out.print(stateCapitals[i][0] + " ");
			}
		String[] answers = new String[10];
		for (int i = 0; i < answers.length; i++) {
			answers[i] = input.next();
		}
		
		for (int g = 0; g < answers.length; g++) {
			
			for (int i = g; i < stateCapitals.length; i++) {
				
					if (answers[g].equalsIgnoreCase(stateCapitals[i][1])) {
						System.out.println("Correct");
						i = stateCapitals.length;
						}
					else {
						System.out.println("False");
						i = stateCapitals.length;
					}
					
				}
			}
		}
	}
