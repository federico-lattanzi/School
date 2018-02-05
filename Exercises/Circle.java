import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Circle {
	
	public static void main(String[] args) {
		initCircle(100d, 100d);
	}
	
	private static void initCircle(double width, double height) {
		Shape circle = new Ellipse2D.Double(0d, 0d, width, height);
		
		double radius = circle.getBounds().getWidth()/2;
		
		System.out.println("Circle's circumference: " + 2 * radius * Math.PI);
		System.out.println("Circle's area: " + radius * radius * Math.PI);
	}
	
}
