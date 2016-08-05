package zadaci_04_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Napisati program koji učitava neodređeni broj cijelih brojeva (nula prekida unos) 
 * te ispisuje koliko je brojeva bilo iznad ili jednako prosjeku svih unešenih brojeva a 
 * koliko je bilo brojeva ispod prosjeka. Pretpostavimo da je maksimalan niz brojeva koje korisnik može unijeti 100.*/


public class Zad5_iznad_prosjeka_ispod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//definisanje skanera
			Scanner unos= new Scanner(System.in);		
			System.out.println("Unesite elemente niza, gdje cete nakon svakog unosa pritisnuti tipku 'ENTER', imajte u vidu da nula'0' prekida niz!!! ");
		
			//definisanje niza u koji cemo unositi vrijednosti od korisnika, sume na osnovu koje racunamo prosjek
			double[] niz= new double[100];
			double suma =0;
			int brojac=0;

			try {
					
					//unos od korisnika stavljamo u niz uz uslov da je unos različit od nule,racunamo sumu unijetih elemenata	
					for (int i  =0; i< niz.length;i++){
						niz[i] = unos.nextDouble();
					
						if(niz[i]==0){
							break;
						}
						suma= suma+ niz[i];
						brojac++;
					}
				
					for (double e: niz){
						if (e !=0){
							System.out.print(e + " ");
						}
					}
					//izracunavamo prosjek i deklarisemo brojace
					double prosjek = suma/brojac;
					int manje=0;
					int vece =0;
					
					System.out.println();
					System.out.println("Prosjek brojeva niza iznosi: " + prosjek);
					
					//prolazimo kroz niz i određujemo koji su elementi veci ili jednaki , koji manji
					for (int i =0; i <niz.length; i++){
						if (niz[i]>=prosjek){
							vece++;				
						}else if ((niz[i]<prosjek)&&(niz[i]!=0)){
							manje++;
						}
					}
					//ispis razultata
					System.out.println("Ukupan broj brojeva niza manjih od prosjeka iznosi: " + manje);
					System.out.println("Ukupan broj brojeva niza vecih ili jednakih  prosjeku je: " + vece);
					
					
				} catch (InputMismatchException e1) {
					// TODO Auto-generated catch block
					System.err.println("Pogresan unos!!!");
					System.exit(0);
			}finally{
				//zatvaranje resursa
				unos.close();
			}
				
			
			
				
			
	}

}
