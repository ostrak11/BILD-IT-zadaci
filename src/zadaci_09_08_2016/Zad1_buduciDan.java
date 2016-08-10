package zadaci_09_08_2016;

import java.util.Scanner;
/*1. Napisati program koji pita korisnika da unese cijeli broj za današnji dan u sedmici (0 za ponedjeljak, 1 za utorak...) 
 * i da unese broj dana nakon današnjeg dana te mu ispiše koji je to dan u budućnosti. 
 * (Primjer: ako korisnik unese 1 kao današnji dan a 3 kao dan u budućnosti program mu ispisuje da je danas utorak a dan u budućnosti je petak.) */


public class Zad1_buduciDan {
	
	//metoda vraca dan u sedmici
	public static String danU7(int num){
		
		String [] dani={"Ponedjeljak","Utorak","Srijeda","Cetvrtak","Petak", "Subota", "Nedjelja"}; 
		
		return dani[num];
	}
	
	//metoda ispituje da li unos zadovoljavajuci
	public static boolean isGood(int num){
		if ((num<0)||(num>6)){
			return false;
		}else{
			return true;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite cijeli broj od 0 do 6 za danasnji broj u sedmici (ponedjeljak=0 ): ");
		
		boolean nesto=true;
		boolean nes=true;
		
		int dan=0;
		
		//unos dana uz provjeru o tacnosti unosa (tip podataka)
		while(nesto==true){
			try {
				dan=unos.nextInt();
				nesto=false;
			} catch (Exception e) {
			// TODO Auto-generated catch block
				System.err.println("Greska pri unosu, pokusajte ponovo sa cijelim brojem!!!");
				unos.nextLine();
			}
		}
		
		//provjera unosa u vidu granica unesenih brojeva
		while(isGood(dan)==false){
			System.out.println("Unesite broj od 0 do 6");
			dan=unos.nextInt();
		}
		
		
		
		System.out.println("Unesite broj dana nakon današnjeg dana: ");
		
		int dan2=0;
		//unos dana uz provjeru o tacnosti unosa (tip podataka)
		while(nes==true){
			try {
				dan2=unos.nextInt();
				nes=false;
			} catch (Exception e) {
			// TODO Auto-generated catch block
				System.err.println("Greska pri unosu, pokusajte sa cijelim brojem!!!");
				unos.nextLine();
			}
		}
		
		//ispis rezultata
		System.out.println("Današnji dan je "+ danU7(dan)+".");
		System.out.println("Dan u budućnosti koji zelite znati je "+ danU7((dan +dan2)%7)+"." );
	
		unos.close();
	}

}
