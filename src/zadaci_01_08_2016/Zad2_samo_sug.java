package zadaci_01_08_2016;
import java.util.Scanner;

/* Pretpostavimo da su slova A, E, I, O i U samoglasnici. (Smjela pretpostavka, znam) 
 * Napisati program koji pita korisnika da unese string te mu ispište broj samoglasnika i suglasnika u datom stringu.*/

public class Zad2_samo_sug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// definisanje skenera
		Scanner unos= new Scanner(System.in);
		
		//unos nekog stringa
		System.out.println("Unesite string:");
		String str= unos.nextLine();
		
		// zatvaranje resursa-skenera
		unos.close();
		
		//deklarisanje novog stringa koji je isti kao uneseni string, radi korištenja ponovo prilikom ispisa
		//String rijec = str;
		String rijec= new String(str);
		
		//deklarisanje i inicijaliziranje brojaca za samoglasnike i suglasnike
		int samo=0;
		int ukupno=0;
		
		//uklanjanje razmaka u unesenog stringu
		str=str.replace(" ", "");
		
		//uneseni string ispisati malim slovima
		str=str.toLowerCase();
		
		//proci kroz string i pogrojati samoglasnike i ukupan broj slova
		for (int i=0; i<str.length();i++){
			if ((str.charAt(i)=='a')||
			(str.charAt(i)=='e')||
			(str.charAt(i)=='i')||
			(str.charAt(i)=='o')||
			(str.charAt(i)=='u')){
				samo++;
			}
			//broja samo za slova
			if (Character.isAlphabetic(str.charAt(i))) ukupno++;
		}
		
		//ispis stringa, kao i broja samoglasnika i suglasnika
		System.out.print("Broj samoglasnika u stringu '" + rijec + "' iznosi " + samo+ ", a suglasnika " + (ukupno-samo)+ "." );
		
		
		
	}

}
//
