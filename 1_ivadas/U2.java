package task_1;
import java.util.Scanner;

public class U2 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Vidutiniskai per menesi perskaitytu knygu skaicius: ");
		double n=in.nextInt();
		System.out.println("Vidutiniskai per metus apsilankiusiu bibliotekoje skaicius: ");
		double v=in.nextInt();
		
		in.close();
		
		double k=n*12/v;
		
		System.out.println("Vidutiniskai per metus perskaito vienas lankytojas perskaito "+Math.round(k)+" knygas");
		
		

	}

}
