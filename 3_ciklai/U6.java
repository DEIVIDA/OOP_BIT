package task_3;

import java.util.Scanner;

public class U6 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Iveskite skaicius (pabaiga 0): ");
		int i=in.nextInt();
		 
		 int suma=0;
		 int vid=0;
		 
		 while (i!=0) {
			 suma+=i;
			 i=in.nextInt();
			 vid++;
					 
		 }
		 System.out.println("Skaiciu suma: "+suma);
		 System.out.println("Skaiciu vidurkis: "+ (double) suma/vid);
		 	

	}

}
