package task_3;

import java.util.Scanner;

public class U1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Iveskite pirmaji skaiciu: ");
		int m = sc.nextInt();
		System.out.print("Iveskite antraji skaiciu: ");
		int n = sc.nextInt();

		sc.close();

		int s = m * n;

		for (int i = 1; i <= s; i++) {

			if (i % m == 0 && i % n == 0) {
				System.out.println("BMK: "+i);
				break;
			}
		}

	}

}
