package task_1;
import java.util.Scanner;

public class U4 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Iveskite pradzios laiko val.: ");
		int h1=in.nextInt();
		System.out.println("Iveskite pradzios laiko min.: ");
		int min1=in.nextInt();
		System.out.println("Iveskite pabaigos laiko val.: ");
		int h2=in.nextInt();
		System.out.println("Iveskite pabaigos laiko min.: ");
		int min2=in.nextInt();
		
		in.close();	

		int s = (h2*60+min2)-(h1*60+min1);
		
		if (s<0) {
			s=1440+s;
		}
		
		int sval = s/60;
		int smin = s-sval*60;
				
		System.out.println("Studentas kure programa: "+sval+" val. ir "+smin+" min.");
		
	}

}
