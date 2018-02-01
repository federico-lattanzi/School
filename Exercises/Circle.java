package it.urial.ricobytes.circle;

/**
 * 
 * @author Federico Lattanzi
 *
 */

public class Circle {
	
	public static void main(String[] args) {
		//Gradi dell'angolo
		double degrees = 90.0;
		//Convertire i gradi in radianti
		double angle = degrees * 2 * Math.PI / 360.0;
		
		//Calcolare il seno dell'angolo
		System.out.println("Seno di \"angle\"" + Math.sin(angle));
		//Calcolare il coseno dell'angolo arrotondando il risultato ad un intero, ovvero 0 al posto di 6.123...E-17
		System.out.println("Coseno di \"angle\": " + Math.round(Math.cos(angle)));
	}
	
}
