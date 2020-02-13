package OOP_task1;

public class Point {
	private int x;
	private int y;
	
	/**
	 * Calculate distance from origin
	 * @return distance
	 */
	public double distanceFromOrigin() {
		return Math.sqrt(this.x*this.x+this.y*this.y);		
	}
	/**
	 * Translate to new coordinates dx, dy
	 * @param dx
	 * @param dy
	 */
	public void translate(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	/**
	 * Distance between points
	 * @param p
	 * @return distance to point p
	 */
	double distance(Point p) {
		double xdif = this.x - p.getX();
		double ydif = this.y - p.getY();
		return Math.sqrt(xdif*xdif+ydif*ydif);	
	}	
	
	@Override
	public String toString() {
		return "["+ x + ";" + y+"]";
	}
	
	/**
	 * Get
	 * @return x
	 */
	public int getX() {
		return x;
	}
	/**
	 * Set
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * Get
	 * @return y
	 */
	public int getY() {
		return y;
	}
	/**
	 * Set
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * Point object constructor
	 * @param x
	 * @param y
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

