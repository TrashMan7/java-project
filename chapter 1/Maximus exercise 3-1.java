/* Maximus Mackert,
1/30/2019,
	This program uses Cramer's rule for solving this 2*2 system of linear equations 3.4x + 50.2y = 44.5
	2.1x + 0.55y = 5.9 */
class Equations {
	public static void main(String[] args) {
		double A, B, C, D, E, F; //asigned these letters as vairiables
		A = 3.4;	//gave them values
		B = 50.2;
		C = 2.1;
		D = 0.55;
		E = 44.5;
		F = 5.9;
		System.out.println("((E * D) - (B * F)) / ((A * D) - (B * C))");
		System.out.println(((D * E) - (B * F)) / ((A * D) - (B * C)));
		System.out.print("((A * F) - (E * C)) / ((A * D) - (B * C))");
		System.out.print(((A * F) - (E * C)) / ((A * D) - (B * C)));
				}
}