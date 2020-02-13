package task_2;
import java.util.Scanner;
public class U4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Iveskite trizenkli skaiciu: ");
		int sk=in.nextInt();
		
		in.close();	
		
		int sk3 = sk%10;
		int sk2 = (sk/10)%10;
		int sk1 = sk/100;
		
				
		if ((Math.pow(sk1, 3)+Math.pow(sk2, 3)+Math.pow(sk3, 3))==sk)
		{
			System.out.println("Skaicius yra Armstrongo");
				}
			else { System.out.println("Skaicius nera Armstrongo");
				}

	}

}