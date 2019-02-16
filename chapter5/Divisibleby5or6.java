/*Maximus Mackert,
 * 2/15/2019,
 * I created a program that displays numbers divisible by either 5 or 6 not
 * both ranging from 100 to 200
 */

public class Divisibleby5or6 {

	public static void main(String[] args) {
		//chart format
		System.out.println("Numbers divisible by 5 or 6 between 100-200");
		System.out.println(" " + "---------------------------------------");
		int count = 100;
		int printnum = 0;
		//calculate possible numbers
		while (count <= 200) {
			if ((count % 5 == 0) ^ (count % 6 == 0)){
					System.out.printf("%4s", count);
					printnum++;
			}
			if (printnum == 10) {
				System.out.println();
				printnum = 0;
			}
		    count++;
		}
	}

}
