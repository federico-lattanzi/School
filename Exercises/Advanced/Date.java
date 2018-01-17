import java.util.Calendar;
import java.util.Locale;

public class Date {
	
	//Metodo principale da cui inizia il programma
	public static void main(String[] args) {
		//Creo un calendario da cui ricavare il giorno, data, mese e anno
		Calendar calendar = Calendar.getInstance(Locale.ITALY);
		//Imposto la data del calendario alla data corrente
		calendar.setTime(new java.util.Date());
		
		//Inizializzo le variabili che mi servono, com scritto di seguito.
		String day = getDay(calendar.get(Calendar.DAY_OF_WEEK)).toString();
		int date = calendar.get(Calendar.DAY_OF_MONTH);
		String month = getMonth(calendar.getTime().getMonth()).toString();
		int year = calendar.getWeekYear();
		
		//Mando un output in console dove mostra i valori delle variabili che abbiamo scritto precedentemente
		System.out.println("American format");
		System.out.println(day + ", " + month + " " + date + ", " + year);
		System.out.println("European format");
		System.out.println(day + ", " + date + " " + month + ", " + year);
	}
	
	//Creo un enumeration dove elenco tutti i mesi dell'anno
	private enum Months {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
	}
	
	//Creo un metodo nella quale possiamo ricavare il nome dal mese dal numero del mese rispetto l'anno
	private static Months getMonth(int month) {
		switch(month) {
		case 1:
			return Months.JANUARY;
		case 2:
			return Months.FEBRUARY;
		case 3:
			return Months.MARCH;
		case 4:
			return Months.APRIL;
		case 5:
			return Months.MAY;
		case 6:
			return Months.JUNE;
		case 7:
			return Months.JULY;
		case 8:
			return Months.AUGUST;
		case 9:
			return Months.SEPTEMBER;
		case 10:
			return Months.OCTOBER;
		case 11:
			return Months.NOVEMBER;
		case 12:
			return Months.DECEMBER;
		}
		
		return null;
	}
	
	//Ho creato un enumeration dove elenco i nomi dei giorni della settimana
	private enum Days {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	}
	
	//Metodo per ricavare il nome del giorno dal numero del giorno in una settimana
	private static Days getDay(int day) {
        switch (day) {
            case 1:
                return Days.SUNDAY;
            case 2:
                return Days.MONDAY;
            case 3:
                return Days.TUESDAY;
            case 4:
                return Days.WEDNESDAY;
            case 5:
                return Days.THURSDAY;
            case 6:
                return Days.FRIDAY;
            case 7:
                return Days.SATURDAY;
        }
		return null;
	}
	
}
