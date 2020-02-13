package OOP_task1;

public class Line {
	private Point p1;
	private Point p2;
	
	/**
	 * Object Constructor
	 * @param p1 Object point(x;y)
	 * @param p2 Object point(x;y)
	 */
	public Line(Point p1, Point p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}
	/**
	 * Method for distance between p1 and p2 calculation
	 * @return double distance
	 */
	public double lineLenght() {
		double xdif = p1.getX() - p2.getX();
		double ydif = p1.getY() - p2.getY();
		return Math.sqrt(xdif*xdif+ydif*ydif);	
			
	}

	/**
	 * Method to String
	 */
	@Override
	public String toString() {
		return "Line [p1=" + p1 + ", p2=" + p2 + "]";
	}
	
	
	
	






}
