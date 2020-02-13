package task_2;
import java.util.Scanner;
public class U3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Iveskite valandas: ");
		int h=in.nextInt();
		System.out.println("Iveskite minutes: ");
		int m=in.nextInt();
		System.out.println("Iveskite sekundes: ");
		int s=in.nextInt();
		
		in.close();	
		
		int p = h*3600+m*60+s+1;
						
		if (p<86400)
		{
			int hn = p/3600;
			int mn = (p-(hn*3600))/60;
			int sn = p-(hn*3600)-(mn*60);
			
			System.out.println(hn+"h:"+mn+"m:"+sn+"s");
				}
			else { System.out.println("0h:0m:1s");
				}

	}

}
