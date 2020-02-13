package task_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("data_task_6_2.txt"));

		int n = sc.nextInt();
		int[][] array = new int[n][n];

		for (int i = 0; i < n; i++) {

			for (int y = 0; y < n; y++) {
				array[i][y] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {

			for (int y = 0; y < n; y++) {
				if (i % 2 == 0) {
					if (y % 2 == 0)
						array[i][y] = 0;
				} else {
					if (y % 2 != 0)
						array[i][y] = 0;
				}
				System.out.print(array[i][y] + " ");
			}
			System.out.println();

		}
		sc.close();
	}
}
