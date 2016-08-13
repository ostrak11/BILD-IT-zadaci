package zadaci_11_08_2016;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*Ako pozovemo metodu System.currentTimeMillis() dobijemo broj milisekundi od 1. januara 1970 do trenutka pozivanja metode. 
 * Napisati program koji ispisuje trenutačni datum i vrijeme u formatu "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"*/

public class Zad3_datum_vrijeme {
	
	public static String getDatum(long millis) {
		//niz koji sadrzi imena mjeseci
		String[] months = {"januar","februar","mart","april","maj","juni","juli","avgust","septembar","oktobar","novembar","decembar"};
		String datum = "";	
		
		//instanca kalendara
		Calendar date = Calendar.getInstance();
		//setanje datuma
		date.setTimeInMillis(millis);	
		
		//dobijanje mjeseca, godine i dana, stim da uzima trenutni broj mjeseca i citamo ga iz niza
				 	
		datum = date.get(Calendar.DAY_OF_MONTH)+". "+months[date.get(Calendar.MONTH)]+", "+date.get(Calendar.YEAR);		
		
		return datum;		
} 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Date time = new Date();
		//format vremena
		String newTime = new SimpleDateFormat("HH:mm:ss").format(time);
		
		//ispis uz pozivanje metoda za datum i vrijeme
		System.out.println("Trenutni datum i vrijeme: " + getDatum(System.currentTimeMillis())+" "+ newTime.toString());

		
	}

}
