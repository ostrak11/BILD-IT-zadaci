package zadaci_17_08_2016;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

/*Napisati program koji učitava 10 brojeva te ispisuje koilko je jedinstvenih brojeva unijeto te sve jedinstvene brojeve koji su unijeti, 
 * razmaknute jednim spaceom. Ukoliko se neki broj pojavljuje više puta, broj treba ispisati samo jednom. */

public class Zad5_jedinstveni_brojevi {
	
	static Scanner unos = new Scanner(System.in);

	public static int provjera() {

		int broj = 0;
		boolean provjera = true;
		do {
			// ucitavanje unosa i provjera da li je unos uredu
			try {
				
				broj = unos.nextInt();
				
				provjera=false;

			}
			// hvata greska i trazi ponovni unos
			catch (InputMismatchException ex) {
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				unos.nextLine();
			}
		} while (provjera);
		
		return broj;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> niz=new ArrayList<>();
		
		//unos brojeva u ArrrayList
		System.out.println("Unesite deset cijelih brojeva(nakon svakog unosa pritisnite pitku ENTER): ");
		
		for(int i=0; i<10;i++){
			int broj=provjera();
			//ako broj nije sadrzan u ArrayList dodati ga
			if(!niz.contains(broj)){
				niz.add(broj);
			}
			
		}
		//ispis rezultata
		System.out.println("Broj unesenih jedinstvenih brojeve je: "+ niz.size());
		System.out.println("Ti brojevi su: ");
		
		for(int e:niz){
			System.out.print(e+" ");
		}
		
		unos.close();
	}

}
