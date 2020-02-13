package OOP_task1;

public class Vykdymas {

	public static void main(String[] args) {
		
		Point p1 = new Point (3, 1);
		Point p2 = new Point (5, 1);
		
		//System.out.println(x.distanceFromOrigin());
		
		System.out.println(p1);
		System.out.println(p2);
		
		//p1.translate(1, 1);
		
		
		System.out.println(p1.distance(p2));
		
		Line l1 = new Line (p1, p2);
		
		System.out.println(l1);
		System.out.println("Line lenght: "+l1.lineLenght());
		
		
		
	}

}
