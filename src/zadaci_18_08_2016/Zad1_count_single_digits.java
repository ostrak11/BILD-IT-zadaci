package zadaci_18_08_2016;


/* (Count single digits) Write a program that generates 100 random integers between 0 and 9 and displays the count for each number. 
 * (Hint: Use an array of ten integers, say counts, to store the counts for the number of 0s, 1s, ..., 9s.) */

public class Zad1_count_single_digits {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]niz=new int[100];
		int count=0;
		
		//generisao brojeve i datom indexu povećao vrijednost za 1...npr generisan broj 2...index na broju dva povećan za 1	
 		for (int i=0; i<100; i++){
			niz[(int)(Math.random()*10)]++;
		}
 		
 		//ispis generisanih brojeva i ponavljanja
 		for (int i=0; i<10;i++){
 			System.out.println("Broj " + i+ " se ponavlja " + niz[i] + " puta.");
 		}
		
		
	}

}
