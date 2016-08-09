package zadaci_09_08_2016;

import java.util.concurrent.TimeUnit;

/*Napisati metodu koja pretavara milisekunde u sate, minute i sekunde. Metoda treba da koristi sljedeći header: 
 * public static String convertMillis(long millis). 
 * Metoda treba da vraća vrijeme kao string u formatu sati:minute:sekunde. 
 *  Na primjer convertMillis(100000) treba da vrati 0:1:40.*/

public class Zad5_pretvaranjeVremena {
	
	public static String convertMillis(long millis){
		
		//ispis vremena u formatu od dva mjesta sa dvotačkom između
		 String hms = String.format("%02d:%02d:%02d", 
				 //broj sati 
				 TimeUnit.MILLISECONDS.toHours(millis),
				
				 //ukupan broj minuta
		         TimeUnit.MILLISECONDS.toMinutes(millis) - 
		         
		         //broj minuta koje su raspoređene u sate
		         TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
		         
		         //ukupan broj sekundi
		         TimeUnit.MILLISECONDS.toSeconds(millis) - 
		         //ukupan broj sekundi rasporeden na minute
		         TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
		
		 return hms;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(convertMillis(100000));
		
		
		
	}

}
