package task_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("data_task_6_1.txt"));

		int week = sc.nextInt();
		int[][] weekTemp = new int[week][7];

		for (int i = 0; i < week; i++) {
			int sumTemp = 0;
			for (int y = 0; y < 7; y++) {
				weekTemp[i][y] = sc.nextInt();
				sumTemp += weekTemp[i][y];

			}
			System.out.print((i + 1) + " savaites vidutine temperatura: " + (double) sumTemp / 7);
			System.out.println();
		}

		sc.close();

	}

}
