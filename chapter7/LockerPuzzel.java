/*Maximus Mackert,
 * 3/1/2019,
 * I created a program that solves the locker puzzle if the locker number is divisible by the student number 
 * the locker is either closed or opened depending on its current state. The program finishes when all 100 
 * students have gone through the lockers. 
 */
public class LockerPuzzel {

	public static void main(String[] args) {
		boolean [] lockers = new boolean[100];
		int [] students = new int [100];
		for(int k = 0; k < students.length; k++) {
			students[k] = k;
		}
		
		for (int j = 0; j < students.length; j++) {
			
			for (int i = 0; i < lockers.length; i++) {
				if (j > 0) {
					if ((i + 1) % students[j] == 0) {
						lockers[i] = !lockers[i];
				}
			}
				else {
					i = lockers.length;
				}
				
		}
	}
		for (int n = 0; n < lockers.length; n++){
			if (lockers[n] == false) {
				System.out.println("Closed");
			}
			else 
				System.out.println("Open");
		}
	}
}
