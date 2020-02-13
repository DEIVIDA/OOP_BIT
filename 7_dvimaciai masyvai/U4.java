package task_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class U4 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("data_task_6_4.txt"));

		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] array = new int[m][n];
		int[] tmp = new int[m];

		// write data to array
		for (int i = 0; i < m; i++) {
			for (int y = 0; y < n; y++) {
				array[i][y] = sc.nextInt();
			}
		}
		sc.close();

		// copying array column data to temporary array to sort it and writing back
		// sorted data
		for (int i = 0; i < n; i++) {
			for (int y = 0; y < m; y++) {
				tmp[y] = array[y][i];
			}
			Arrays.sort(tmp);
			for (int y = 0; y < m; y++) {
				array[y][i] = tmp[y];
			}
		}

		// printing out array with sorted columns
		for (int i = 0; i < m; i++) {
			for (int y = 0; y < n; y++) {
				System.out.print(array[i][y]+" ");
			}
			System.out.println();

		}

	}

}
