package task_1;
import java.util.Scanner;

public class U3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Iveskite virsutiniojo kairiojo kampo koordinate x1: ");
		int x1=in.nextInt();
		System.out.println("Iveskite virsutiniojo kairiojo kampo koordinate y1: ");
		int y1=in.nextInt();
		System.out.println("Iveskite apatiniojo desiniojo kampo koordinate x2: ");
		int x2=in.nextInt();
		System.out.println("Iveskite apatiniojo desiniojo kampo koordinate y2: ");
		int y2=in.nextInt();
		
		in.close();
		
		int s=(x2-x1)*(y1-y2);
		int p=((x2-x1)+(y1-y2))*2;
		
		System.out.println("Staciakampio plotas "+s+", perimetras "+p);
		
	}

}
