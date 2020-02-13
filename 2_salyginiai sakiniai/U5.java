package task_2;
import java.util.Scanner;
public class U5 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Iveskite skaiciu a: ");
		double a=in.nextInt();
		System.out.println("Iveskite skaiciu b: ");
		double b=in.nextInt();
		System.out.println("Iveskite skaiciu c: ");
		double c=in.nextInt();
		
		in.close();	
		
		double d= b*b -4*a*c;
		
		if (d>0)
		{
			double x1=((-b-Math.sqrt(d))/2*a);
			double x2=((-b+Math.sqrt(d))/2*a);
			
			System.out.println("x1:"+x1+", x2:"+x2);
				}
			else { 
				if (d==0){
				double x=((-b-Math.sqrt(d))/2*a);
				System.out.println("x:"+x);
				}
			}

	}

}
