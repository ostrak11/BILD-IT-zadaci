package zadaci_20_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/* (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly identical if their corresponding elements are equal. 
 * Write a method that returns true if m1 and m2 are strictly identical, using the following header:
public static boolean equals(int[][] m1, int[][] m2)  Write a test program that prompts the user to enter two 3 * 3 arrays of integers 
and displays whether the two are strictly identical.*/

public class Zad2_identical_arrays {
	static Scanner unos = new Scanner(System.in);
	
	public static boolean equals(int[][] m1, int[][] m2){
		//ako matrice nisu iste velicine onda nisu identicne
		if(m1.length!=m2.length){
			return false;
		}else if(m1[0].length!=m2[0].length){
			return false;
		}else{
			//ako su iste velicine provjeravamo svaki elemanat matrice
			for(int i=0; i<m1.length;i++){
				for(int j=0; j<m1[0].length; j++){
					if(m1[i][j]!=m2[i][j]){
						return false;
					}
				}
			}
		}
		return true;
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

				//unos elemenata u matricu
				int[][] m1= new int[3][3];
				System.out.println("Unesite elemente u prvu matricu 3x3:");
				for(int i=0; i<m1.length;i++){
					for(int j=0; j<m1[0].length;j++){
						m1[i][j]=provjera();
					}
				}
				
				//unos elemenata u matricu
				int[][] m2= new int[3][3];
				System.out.println("Unesite elemente u drugu matricu 3x3:");
				for(int i=0; i<m2.length;i++){
					for(int j=0; j<m2[0].length;j++){
						m2[i][j]=provjera();
					}
				}
				
				//pozivanje metode i ispis rezultata
				if(equals(m1,m2)){
					System.out.println("Matrice su identicne!");
				}else{
					System.out.println("Matrice nisu identicne");
				}
				
				unos.close();
	}

}
