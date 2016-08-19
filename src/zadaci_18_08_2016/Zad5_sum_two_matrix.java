package zadaci_18_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/* (Algebra: add two matrices) Write a method to add two matrices. The header of the method is as follows:
public static double[][] addMatrix(double[][] a, double[][] b) 

  In order to be added, the two matrices must have the same dimensions and the same or compatible types of elements. 
  Let c be the resulting matrix. Each element cij is aij + bij. For example, for two 3 * 3 matrices a and b, c is
  Write a test program that prompts the user to enter two 3 * 3 matrices and displays their sum*/

public class Zad5_sum_two_matrix {
	
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

	public static double[][] addMatrix(double[][] a, double[][] b){
		//nova matrica gdje ce biti smješten zbir
		double[][] c=new double[a.length][a[0].length];
		
		//prolaz kroz matrice i zbir elemenata
		for(int i=0; i<a.length;i++){
			
			for(int j=0; j<a[0].length;j++){
				
				c[i][j]=a[i][j]+b[i][j];
				
			}
		}
		
		
		return c;
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] a= new double[3][3]; 
		double[][] b= new double[3][3]; 
		
		//unos elemenata u prvu matricu
		System.out.print("Unesite elemente u prvu 3x3 matricu: ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				
				a[i][j]=provjera();
			}
		}
		
		//unos elemenata u drugu matricu
		System.out.print("Unesite elemente u drugu 3x3 matricu: ");
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[0].length;j++){
				
				b[i][j]=provjera();
			}
		}
		
		//poziv metode i pohrana podataka u matricu
		double[][] c=addMatrix(a,b);
		
		//ispis matrice koja predstavlja zbir predhodne dvije matrice
		System.out.println("Zbir dvije matrice iznosi: ");
		
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c[0].length;j++){
				
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
		unos.close();
		
		
	}

}
