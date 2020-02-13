package task_3;

public class U4 {

	public static void main(String[] args) {

		for (int x = 1; x<=9; x++) {

			for (int y = 1; y<=9; y++) {

				int xy = x * 10 + y;
				int yx = y * 10 + x;
				
				if (((double) y / x == 2) && ((yx - xy) == 36)) {
					System.out.println("Skaicius: " + xy);
					break;
				}

			}
		}

	}

}
