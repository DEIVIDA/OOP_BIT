package task_2;

import java.util.Scanner;

public class U1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Iveskite lazdeles a ilgi: ");
		int a=in.nextInt();
		System.out.println("Iveskite lazdeles b ilgi: ");
		int b=in.nextInt();
		System.out.println("Iveskite lazdeles c ilgi: ");
		int c=in.nextInt();
		System.out.println("Iveskite lazdeles d ilgi: ");
		int d=in.nextInt();
		in.close();	
		
		if ((a==b && c==d) || (a==c && b==d) || (a==d && c==b))
		{
			if (a==b && c==d) {
			System.out.println("Staciakampio plotas: "+a*d+", perimetras: "+(a+d)*2);
				}
			if (a==c && b==d) {
				System.out.println("Staciakampio plotas: "+a*b+", perimetras: "+(a+b)*2);
				}
			if (a==d && c==b) {
				System.out.println("Staciakampio plotas: "+a*c+", perimetras: "+(a+c)*2);
				}
		} else { System.out.println("Staciakampis negalimas");
				}
		
	}

}


