/*Maximus Mackert,
 * 3/1/2019,
 * I created a program with two methods one enters 2 different two dimensional
 *  arrays and the other adds the two together then they are printed out.
 */
public class AddMatrix {
//main method enters arrays and prints results
	public static void main(String[] args) {
		int [][] matrixA = {
				{1, 2, 3 },
				{4, 5, 6 },
				{7, 8, 9 },
		};
		int [][] matrixB = {
				{9, 8, 7 },
				{6, 5, 4 },
				{3, 2, 1 },
		};
		int [][] matrixC = addMatrix(matrixA, matrixB);
		System.out.println("The new matrix is: " );
		for(int i = 0; i < matrixC.length; i++) {
			for(int j = 0; j < matrixC[i].length; j++) {
				System.out.print(matrixC[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	//method addMatrix adds the two arrays and returns the results
	public static int[][] addMatrix(int [][]a, int [][]b){
		int [][]matrixC = new int [3][3];
		for(int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < b.length; k++) {
					for (int l = 0; l < b[k].length; l++) {
						for (int n = 0; n < matrixC.length; n++) {
							for (int m = 0; m < matrixC[n].length; m++) {
								matrixC[n][m] = a[i][j] + b[k][l];
							}
						}
					}
				}
			}
		}
		return matrixC;
	}
}
