package task_1;
import java.util.Scanner;
public class U5 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Iveskite trikampio krastine a: ");
		int s1=in.nextInt();
		System.out.println("Iveskite trikampio krastine b: ");
		int s2=in.nextInt();
		System.out.println("Iveskite trikampio krastine c: ");
		int s3=in.nextInt();
				
		int p = (s1 + s2 + s3)/2;
		double area =  Math.sqrt(p*((p-s1)*(p-s2)*(p-s3)));
		
		System.out.println("Trikampio plotas: "+area);
		
		in.close();	

	}

}
