package zadaci_18_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/* (Sum elements column by column) Write a method that returns the sum of all the elements in a specified column in a matrix using the following header:
public static double sumColumn(double[][] m, int columnIndex)
Write a test program that reads a 3-by-4 matrix and displays the sum of each column. */

public class Zad4_matrix_sum {
	
	static Scanner unos = new Scanner(System.in);

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
	
	public static double sumColumn(double[][] m, int columnIndex){
		
		double sum=0;
			//prtimo petlju po redovima i sabiramo elemente određene kolone
			for(int i=0; i<m.length;i++){
				sum+= m[i][columnIndex];
			}
		//vracamo sumu
		return sum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] a= new double[3][4];
		
				//unos elemenata u matricu
				System.out.print("Unesite elemente u 3x4 matricu: ");
				for(int i=0;i<a.length;i++){
					for(int j=0;j<a[0].length;j++){
						
						a[i][j]=provjera();
					}
				}
											
			//ispis rezultata uz pozivanje metode za izracunavanje sume
			//petljom prolazimo po kolonama
			for (int i=0; i<a[0].length;i++){
				System.out.println("Suma kolone "+ i+ " iznosi: "+sumColumn(a,i));
			}
			
		
			unos.close();
	}

}
