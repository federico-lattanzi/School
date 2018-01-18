/**
 * @author Federico Lattanzi
 */
 
class Time {
	
	public static void main(String[] args) {
		/*
		 * Creo tre variabili (hour, minute, second) e le inizializzo dandogli come valore
		 * l'esatta ora, minuti e secondi nel momento in cui avviamo il programma.
		 */
		
		int hour = 18;
		int minute = 32;
		int second = 11;
		int since_midnight = (hour * 3600) + (minute * 60) + second;
		
		//Output per indicare i valori attuali indicati nelle variabili hour, minute, second.
		System.out.println("Hour(s): " + hour + ", Minute(s): " + minute + ", Second(s): " + second);
		//Calcolo il numero di secondi dalla mezzanotte all'orario indicato dalle tre variabili hour, minute e second per essere più precisi.
		System.out.println("Number of seconds since midnight: " + since_midnight);
		//Calcolo il numero di secondi rimanenti fino alla fine del giorno, quindi le 24, usando le variabili hour, minute e second.
		System.out.println("Number of seconds remaining in the day: " + ((24 - hour) * 3600) + ((60-minute) * 60) + 60-second);
		//Calcolo la percentuale del giorno che è passato rispetto all'orario prestabilito nelle variabili hour, minute e second.
		System.out.println("Percentage of the day that has passed: " + (since_midnight * 100 / 86400 + "%"); //86400 sono 24 ore in secondi.
	}
	
}
