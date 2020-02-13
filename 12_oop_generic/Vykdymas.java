package OOP6_generic;

public class Vykdymas {

	public static void main(String[] args) {
		
		TwoItems<Integer, String> t1=new TwoItems<>(555, "numeris");
		
		TwoItems<Integer, String> t2=new TwoItems<>();		
		
		System.out.println(t1.getFirstItem());
		System.out.println(t1.getSecondItem());
		
		System.out.println(t1);
		
		
		
		
	}
	
	
	
}
