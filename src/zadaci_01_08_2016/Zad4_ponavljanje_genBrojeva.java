package zadaci_01_08_2016;

/* Napišite program koji generiše 100 nasumičnih cijelih brojeva između 0 i 9 te ispisuje koliko se puta koji broj ponovio. */

public class Zad4_ponavljanje_genBrojeva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		int[] niz = new int [10]; 
		
		
		
		
		
		
 		for (int i=0; i<100; i++){
			niz[(int)(Math.random()*10)]++;
		}
 		
 		
 		for (int i=0; i<niz.length;i++){
 			System.out.println("Broj " + i+ " se ponavlja " + niz[i] + " puta.");
 		}
 		
 	
		
	}

}

