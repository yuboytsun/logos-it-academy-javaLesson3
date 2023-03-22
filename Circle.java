package Java;

public class Circle {
	private double radius = 8.5;
	private double diameter = 9.6;
	
	public void circleLenght() {
		System.out.println("Довжина круга = " + Math.PI * (radius + radius));
	}
	public void circleArea() {
		System.out.println("Площа круга = " + Math.PI * diameter);
	}
	
}
