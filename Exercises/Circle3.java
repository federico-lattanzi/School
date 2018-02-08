import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/**
 * 
 * @author Federico Lattanzi
 *
 */

public class Circle {
	
	public static void main(String[] args) {
		
		//Invoco il metodo creato successivamente per la creazione del 
		initCircle(100d, 100d);
	}
	
	/**
	 * 
	 * @param width Larghezza del cerchio.
	 * @param height Altezza del cerchio.
	 */
	private static void initCircle(double width, double height) {
		//Creo un cerchio 2D seguendo i due parametri inseriti nel metodo che stiamo utilizzando.
		Shape circle = new Ellipse2D.Double(0d, 0d, width, height);
		
		//Ricava il raggio del cerchio.
		double radius = circle.getBounds().getWidth()/2;
		
		//Output, grazie al quale ricaviamo circonferenza ed area del cerchio
		System.out.println("Circle's circumference: " + circonference(radius));
		System.out.println("Circle's area: " + area(radius));
	}
	
	/**
	 * 
	 * @param radius inserire il raggio del cerchio
	 * @return circonferenza del cerchio
	 */
	private static double circonference(double radius) {
		return 2 * radius * Math.PI;
	}
	
	/**
	 * 
	 * @param radius inserire il raggio del cerchio
	 * @return area del cerchio
	 */
	private static double area(double radius) {
		return radius * radius * Math.PI;
	}
	
}
