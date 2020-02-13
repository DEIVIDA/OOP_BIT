package task_2;

import java.util.Scanner;

public class U7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Iveskite metus: ");
		int m = in.nextInt();

		in.close();

		int mg = m % 10;

		switch (mg) {
		case 0:
		case 1:
			System.out.println("Balta");
			break;
		case 2:
		case 3:
			System.out.println("Juoda");
			break;
		case 4:
		case 5:
			System.out.println("Zalia");
			break;
		case 6:
		case 7:
			System.out.println("Raudona");
			break;
		case 8:
		case 9:
			System.out.println("Geltona");
			break;
		}

	}

}
