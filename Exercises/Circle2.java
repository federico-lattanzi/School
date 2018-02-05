/**
 * 
 * @author Federico Lattanzi
 *
 */

public class Circle2 {
	
	public static void main(String[] args) {
		
		//Invoco il metodo creato successivamente per il calcolo del seno e coseno di un angolo
		initCircle(100d, 100d);
	}
	
	/**
	 * 
	 * @param width Larghezza del cerchio.
	 * @param height Altezza del cerchio.
	 */
	private static void initCircle(double width, double height) {
		//Gradi dell'angolo
		double degrees = 90d;
		/*
		 * Per utilizzare il metodo sin e cos della classe Math non sono richiesti i degrees,
		 * bensì i radiants, quindi lo trasformiamo come vediamo di seguito.
		 */
		double angle = degrees * 2 * Math.PI/360d;
		
		//Output, grazie al quale riusciamo a vedere il risultato concreto di sin e cos
		System.out.println("The sin of the angle is: " + Math.sin(angle));
		System.out.println("The sin of the angle is: " + Math.round(Math.cos(angle))); //Il metodo round serve per arrotondare il numero all'intero più vicino.
	}
	
}
