package task_2;
import java.util.Scanner;
public class U6 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Iveskite metus: ");
		int m=in.nextInt();
		
		in.close();	
		
		
		
		if (m%4==0 && m%100!=0)
		{
			System.out.println(m+" metai yra keliamieji");
				}
			else { 
				if (m%400==0){
					System.out.println(m+" metai yra keliamieji");
				} else {
					System.out.println(m+" metai yra paprastieji");
				}
			}

	}

}
