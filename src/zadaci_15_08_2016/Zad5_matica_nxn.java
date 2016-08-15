package zadaci_15_08_2016;

/*Napisati metodu koja ispisuje n x n matricu koristeći se sljedećim headerom: 
 * public static void printMatrix(int n). 
 * Svaki element u matrici je ili 0 ili 1, nasumično generisana. Napisati test program koji pita korisnika da unese broj n te mu ispiše n x n matricu u konzoli. */

import java.util.InputMismatchException;
import java.util.Scanner;


public class Zad5_matica_nxn {
	
	static Scanner unos= new Scanner(System.in);
	
	public static int provjera() {
		
		int broj = 0;	
		boolean provjera = true;	
		do {
			//ucitavanje unosa i provjera da li je int
			try {
				broj = unos.nextInt();	
				//uslov je da broj mora biti 0,1 ili 2
				
				provjera = false;									
				
			}
			//hvata greska i trazi ponovni unos
			catch (InputMismatchException ex) {	
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				unos.nextLine();
			}
		} while (provjera);
		
		return broj;
	}

	 public static void printMatrix(int n){
		 
		 //generisanje brojeva
		  for(int i=0; i<n; i++){
			 for(int j=0; j<n;j++){
				 System.out.print((int)(Math.random()*2)+" ");
			 }
			 System.out.println();
		 }
		 
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//unos dimenzija matrice i pozivanje metode za print
		System.out.println("Unesite dimanziju matice: ");
		int n=provjera();
		
		printMatrix(n);
		
		unos.close();
	}

}
