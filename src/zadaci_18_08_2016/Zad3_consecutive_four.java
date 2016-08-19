package zadaci_18_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/* (Pattern recognition: consecutive four equal numbers) Write the following method that 
 * tests whether the array has four consecutive numbers with the same value. 
 * 
public static boolean isConsecutiveFour(int[] values)

Write a test program that prompts the user to enter a series of integers and displays if 
the series contains four consecutive numbers with the same value. Your program should first 
prompt the user to enter the input size—i.e., the number of values in the series*/

public class Zad3_consecutive_four {
	
	static Scanner unos = new Scanner(System.in);
	
	public static boolean isConsecutiveFour(int[] values){
		//ako je velicina manja od 4 nema 4 uzastopna elementa ista
		if (values.length < 4) {
				return false;
		}else{
			for (int i = 0; i < values.length - 3; i++) {
				//provjera da li su 4 uzastopna elementa ista
				if (values[i] == values[i + 1]
					&& values[i] == values[i + 2]
					&& values[i] == values[i + 3]) {
					return true;
				}
			}
		}
		return false;
				
	}


	public static int provjera() {

		int broj = 0;
		boolean provjera = true;
		do {
			// ucitavanje unosa i provjera da li je unos uredu
			try {
				//unos i izlaz iz petlje ako je unos dobar
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
		//unos velicine niza
		System.out.println("Unesite velicinu niza: ");
		int velicina = provjera();
		
		int[] niz = new int[velicina];
		
		//ako je velicina manja od 4...onda je izjava false
		if(velicina<4){
			System.out.println("Niz nema cetri elementa!!!");
			
		}else{
			//unos elemenata u niz i pozivanje metode uz ispis rezultata
			System.out.println("Unesite lemente u niz: ");
			for(int i=0; i< niz.length;i++){
				niz[i]=provjera();
			}
			System.out.println("U nizu imaju cetri uzastopna ista broja?? " + isConsecutiveFour(niz) );
		}
		
		unos.close();
	}

}
