package task_3;

import java.util.Scanner;

public class U3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Iveskite pradini atlyginima: ");
		int a = sc.nextInt();
		System.out.print("Iveskite atlyginimo menesini prieda: ");
		int x = sc.nextInt();
		System.out.print("Iveskite menesiu skaiciu: ");
		int n = sc.nextInt();
		System.out.print("koki atlyginima norima pasiekti: ");
		int b = sc.nextInt();

		sc.close();
		// 1 salyga
		int l = 1;
		int a1 = a;
		while (l <= 12) {
			a1 += x;
			l++;
		}
		System.out.println("Atlyginimas po metu bus: " + a1);
		// 2 salyga
		int j = 1;
		int a2 = a;
		while (j <= n) {
			a2 += x;
			j++;
		}
		System.out.println("Atlyginimas po " + n + " menesiu bus: " + a2);
		// 3 salyga
		int i = 1;
		while (i >= 1) {
			int na = a + x * i;
			if (na / a >= 2) {
				System.out.println("Atlyginimas po " + i + " men. bus dvigubai arba daugiau didesnis");
				break;
			}
			i++;
		}
		// 4 salyga
		int k = 1;
		while ((a + k * x) < b) {
			k++;
		}
		System.out.println("Po " + k + " men. atlyginimas bus nemazesnis uz " + b + " euru");

	}

}