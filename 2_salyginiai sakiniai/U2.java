package task_2;
import java.util.Scanner;
public class U2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Iveskite metus: ");
		int m=in.nextInt();
		
		in.close();	
		
		if ((m-1896)%4==0)
		{
			int ol=(m-1896)/4+1;
			System.out.println("Metai yra olimpiniai, zaidiniu Nr.: "+ol);
				}
			else { System.out.println("Metai nera olimpiniai");
				}

	}

}
