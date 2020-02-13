package task_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U3 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("data_task_6_3.txt"));

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] array = new int[n][m];

		for (int i = 0; i < n; i++) {

			for (int y = 0; y < m; y++) {
				array[i][y] = sc.nextInt();
			}
		}
		
		int[][] arrayRev = new int[m][n];

		for (int i = 0; i < m; i++) {
			int u = n;

			for (int y = 0; y < n; y++) {
				u--;
				arrayRev[i][y]=array[u][i];				
				System.out.print(arrayRev[i][y]);
			}
			System.out.println();

		}
		sc.close();
	}
}


