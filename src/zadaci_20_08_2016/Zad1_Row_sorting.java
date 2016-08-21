package zadaci_20_08_2016;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/* (Row sorting) Implement the following method to sort the rows in a twodimensional array. A new array is returned and the original array is intact.
public static double[][] sortRows(double[][] m)  Write a test program that prompts the user to enter a 3 * 3 matrix of double values and displays a new row-sorted matrix.*/

public class Zad1_Row_sorting {
	
	static Scanner unos = new Scanner(System.in);
	
	public static double[][] sortRows(double[][] m){
		//prolazimo kroz vsaki redi sortiramo ga
		for(int i=0; i<m.length;i++){
			Arrays.sort(m[i]);
		}
		return m;
		
	}
	

	public static double provjera() {

		double broj = 0;
		boolean provjera = true;
		do {
			// ucitavanje unosa i provjera da li je unos uredu
			try {
				//unos i izlaz iz petlje ako je unos dobar
				broj = unos.nextDouble();
				
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
	
	public static void printMatrix(double[][] m){
		//printanje matrice
		for(int i=0; i<m.length;i++){
			for(int j=0; j<m[0].length;j++){
				System.out.print(m[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//unos elemenata u matricu
		double[][] m= new double[3][3];
		System.out.println("Unesite elemente u matricu 3x3:");
		for(int i=0; i<m.length;i++){
			for(int j=0; j<m[0].length;j++){
				m[i][j]=provjera();
			}
		}
		//poziv metoda za sortiranje redova i printanje matrice
		sortRows(m);
		printMatrix(m);
		
		unos.close();
		
	}

}
