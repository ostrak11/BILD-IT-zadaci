package zadaci_09_08_2016;

import java.util.Scanner;

/* Napišite program koji učitava neodređen broj cijelih brojeva (unos prekida nula), 
 * pronalazi najveći od unijetih brojeva te ispisuje koliko se najveći broj puta ponovio.  
 * Na primjer, ukoliko unesemo 3 5 2 5 5 5 0 program ispisuje da je najveći broj 5 te ispisuje da se isti ponavlja 4 puta. */

public class Zad4_ponavljanje_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos= new Scanner(System.in);		
		System.out.println("Unesite elemente niza, gdje cete nakon svakog unosa pritisnuti tipku 'ENTER', imajte u vidu da nula'0' prekida niz!!! ");
		
		boolean nesto=true;
		int broj =1;
		int najveci=0;
		int pon = 1;
		
		do {
			
			while(nesto==true){
				try {
					broj = unos.nextInt();
					nesto=false;
				} catch (Exception e) {
				// TODO Auto-generated catch block
					System.err.println("Greska pri unosu, pokusajte sa cijelim brojem!!!");
					unos.nextLine();
				}
			}
			 
			if (broj > najveci){
				najveci = broj;
				pon=1;	
			}else if (najveci==broj){
				pon++;
			 }
		}while (broj !=0);
		
				
		System.out.println("Najveci broj niza " + najveci+ " ponavnja se " + pon + " puta.");
		
		unos.close();
	}
	

}
