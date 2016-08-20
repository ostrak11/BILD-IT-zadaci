package zadaci_19_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*(Algebra: multiply two matrices) Write a method to multiply two matrices. The header of the method is:
	* public static double[][]    multiplyMatrix(double[][] a, double[][] b)
  To multiply matrix a by matrix b, the number of columns in a must be the same as the number of rows in b, 
  and the two matrices must have elements of the same or compatible types. Let c be the result of the multiplication.
   Assume the column size of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + c + ain * bnj. For example, 
   for two 3 * 3 matrices a and b, c is 
   where cij = ai1 * b1j + ai2 * b2j + ai3 * b3j.  
   Write a test program that prompts the user to enter two 3 * 3 matrices and displays their product. */

public class Zad2_multiply_two_matrices {
	
	static Scanner unos = new Scanner(System.in);
	
	public static double[][]multiplyMatrix(double[][] a, double[][] b){
		
		       //treva matrica u koju smiještamo izracunate vrijednosti
		       double[][] c = new double[a[0].length][b[0].length];
		       
		       //izracunavanje vrijednosti u c matrici
		       for (int i = 0; i < a.length; i++) {
		           for (int j = 0; j < b[0].length; j++) {
		               for (int k = 0; k < a[0].length; k++) {
		                   c[i][j] = c[i][j] + a[i][k] * b[k][j];
		               }
		           }
		       }
		       return c;
		   
		
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
		double[][] m1= new double[3][3];
		System.out.println("Unesite elemente u prvu matricu 3x3:");
		for(int i=0; i<m1.length;i++){
			for(int j=0; j<m1[0].length;j++){
				m1[i][j]=provjera();
			}
		}
		
		//unos elemenata u matricu
		double[][] m2= new double[3][3];
		System.out.println("Unesite elemente u drugu matricu 3x3:");
		for(int i=0; i<m2.length;i++){
			for(int j=0; j<m2[0].length;j++){
				m2[i][j]=provjera();
			}
		}
		//pozivanje metoda za množenje i printanje matrica
		printMatrix(multiplyMatrix(m1,m2));
		
		unos.close();
	}

}
