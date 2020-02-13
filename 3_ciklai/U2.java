package task_3;

import java.util.Scanner;

public class U2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Iveskite pirmaji skaiciu: ");
		int m = sc.nextInt();
		System.out.print("Iveskite antraji skaiciu: ");
		int n = sc.nextInt();

		sc.close();

		int i = 0;
		
		if (m > n) {
			i = n;
		} else {
			i = m;
		}

		while (i > 0) {

			if (m % i == 0 && n % i == 0) {
				System.out.println("BDD: " + i);
				break;
			}

			i--;

		}

	}

}