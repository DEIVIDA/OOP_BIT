package task_3;

import java.util.Scanner;

public class U5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Iveskite skritulio spinduli: ");
		int r = sc.nextInt();
		System.out.print("Iveskite skrituliu skaiciu: ");
		int n = sc.nextInt();

		sc.close();
		
		double s = 0;
		
		for (int i = 1; i<=n; i++) {
			 
			s = s + Math.PI*Math.pow(r, 2);
			r *= 2;
		}
		System.out.print("Skrituliu plotas: "+s);
	}

}
