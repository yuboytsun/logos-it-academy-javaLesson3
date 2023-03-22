package Java;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {
		this.length = 0.5;
		this.width = 0.3;
		
	}
	
	public Rectangle (double length, double width){
		this.length = length;
		this.width = width;
	}
	public double area() {
		return length * width;
	}
	public double preArea() {
		return 2 * (length + width);
	}
	
	
	
	
}
