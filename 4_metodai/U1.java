package task_4;

import java.util.Scanner;

public class U1 {

	public static int rectangleArea(int a, int b) {
		int s = a * b;
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Iveskite staciakampio krastine a: ");
		int a = sc.nextInt();
		System.out.print("Iveskite staciakampio krastine b: ");
		int b = sc.nextInt();
		sc.close();

		System.out.print("Staciakampio plotas: " + rectangleArea(a, b));

	}

}
