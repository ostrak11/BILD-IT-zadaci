package zadaci_01_08_2016;

/* Napišite program koji generiše 100 nasumičnih cijelih brojeva između 0 i 9 te ispisuje koliko se puta koji broj ponovio. */

public class Zad4_ponavljanje_genBrojeva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//definisao niz brojeva koji se mogu ponoviti prilikom generisanja, s tim da indexi predstavljaju brojeve
		int[] niz = new int [10]; 
		
		
		//generisao brojeve koji se nalaze u predhodnom nizu i datom indexu povećao vrijednost za 1...npr generisan broj 2...index na broju dva povećan za 1	
 		for (int i=0; i<100; i++){
			niz[(int)(Math.random()*10)]++;
		}
 		
 		//ispis generisanih brojeva i ponavljanja
 		for (int i=0; i<niz.length;i++){
 			System.out.println("Broj " + i+ " se ponavlja " + niz[i] + " puta.");
 		}
 		
 	
		
	}

}

