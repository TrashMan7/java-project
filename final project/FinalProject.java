/**
 * <h1>Riddle Challenge</h1>
 * <p>This program is a game that displays riddles and lets the user enter answers if they answer correctly five times in a row they win
 * if they answer incorrectly they be sent back they are given three tries to complete the game.</p>
 * 
 *<p>Created: 3/14/2019</p>
 *@author Maximus Mackert
 */

import java.util.Scanner;
public class FinalProject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[][][] riddles =   {
				{
					{"What gets wetter as it dries? ", "Towel"},
					{"What can travel around the world while stayig in a corner? ", "Stamp"},
					{"I'm tall when I am young and short when I'm old what am I? ", "Candle"},
					{"What has hands but cannot clap? ", "Clock"},
					{"What has a head and a Tail but no body? ", "Coin"}
				},
				{
					{"What has an eye but cannot see? ", "Needle"},
					{"What kind of room has no doors or windows? ", "Mushroom"},
					{"Which word in the dictionary is spelled incorrectly? ","Incorrectly"},
					{"Feed me and I live yet give me a drink and I die what am I? ", "Fire"},
					{"Forward I am heavy, Backward I am not what am I? ", "Ton"}
				},
				{
					{"Take off my skin I won't cry but you will what am I? ", "Onion"},
					{"What invention lets you look right through a wall? ", "Window"},
					{"It's always coming but never arrives what is it? ", "Tomorrow"},
					{"What runs around the whole yard without moving? ", "Fence"},
					{"The more you take the more you leave behind? ", "Footsteps"}
				}
		};


		System.out.println("Riddle Challenge");
		System.out.println("Enter one word answers only.");
		System.out.println("If your answer is incorrect you will have to start over and you only get three chances.");
		System.out.println();
		int correct = 0;
		int incorrect = 0;

		for (int i = 0; i < riddles.length; i++) {
			for(int j = 0; j < riddles[i].length; j++) {
				System.out.println("You have completed " + correct + " questions in a row");
				System.out.println(riddles[i][j][0]);
				String answer = input.nextLine();
				if(answer.contains("a ")) {
					answer = answer.replaceAll("a ", "");
				}
				answer = answer.trim();
				if(answer.equalsIgnoreCase(riddles[i][j][1])) {
					System.out.println("Correct");
					correct++;
					System.out.println();

				}
				else {
					System.out.println("Incorrect");
					System.out.println("Whoops looks like you'll have to start over");
					System.out.println();
					incorrect++;
					correct = 0;
					j = riddles[i].length;
				}
				if (correct == 5) {
					System.out.println("Congrats you have completed the game.");
					return;
				}
				if (incorrect > 2) {
					System.out.println("Sorry looks like you used all of your tries GAME OVER");
					return;
				}


			}
		}

	}

}
