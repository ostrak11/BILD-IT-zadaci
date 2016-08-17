package zadaci_16_08_2016;

import java.util.Calendar;
import java.util.GregorianCalendar;


/*Napisati metodu koja vraća datum i trenutačno vrijeme.*/

public class Zad4_datum_vrijeme {
	
	
	public static void dateTime(){
	//	poziv za instancu kalendara
		
		Calendar cal= new GregorianCalendar();
		//podesiti kalendar na trenurno vrijeme
		cal.setTimeInMillis(System.currentTimeMillis());
		
		//poziv i ispis funkcija
		System.out.println("Današnji datum je: " + cal.get(Calendar.DAY_OF_MONTH)+"."+(1+cal.get(Calendar.MONTH))+"."+cal.get(Calendar.YEAR)+".");
	
		System.out.println("Trenutno vrijeme je: "+ cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+".");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//poziv metode
		dateTime();
	}

}
