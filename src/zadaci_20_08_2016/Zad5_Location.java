package zadaci_20_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Design a class named Location for locating a maximal value and its location in a two-dimensional array. The class contains public data fields row, column, 
 * and maxValue that store the maximal value and its indices in a two-dimensional array with row and column as int types and maxValue as a double type. 
 * Write the following method that returns the location of the largest element in a two-dimensional array:
 public static Location locateLargest(double[][] a) The return value is an instance of Location. Write a test program that prompts the user to enter 
 a two-dimensional array and displays the location of the largest element in the array.*/

public class Zad5_Location {
 
	static Scanner unos = new Scanner(System.in);
	
	public static Location locateLargest(double[][] a){
		 
	 Location l= new Location();
	 if(a.length<=0||a[0].length<=0){
		 System.out.println("Ne moze se naci maximalna vrijednost");
	 }else{
		 l.maxValue=a[0][0];
		 for (int i=0; i<a.length;i++){
			 for(int j=0; j<a[0].length; j++){
				 if(l.maxValue<a[i][j]){
					 l.maxValue=a[i][j];
					 l.row=i;
					 l.column=j;
				 }
			 }
		 }
	 }
	 
	 return l;
	 }
	//provjera int unosa
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
	
	//provjera double unosa
	public static double provjeraDouble() {

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//unos duzine i sirine matrice
		System.out.println("Unesite duzinu martice:");
		int red=provjera();
		
		System.out.println("Unesite sirinu martice:");
		int kolona=provjera();
		
		//kreiranje matrice i unos elemenata
		double[][]matix= new double[red][kolona];
		
		System.out.println("Unesite elemente u matricu: ");
		for (int i=0; i<red;i++){
			for (int j=0; j< kolona; j++){
				matix[i][j]= provjeraDouble();
			}
		}
		
		//kreiranje objekata i pozivanje metode za lociranje najveceg elementa
		Location l = locateLargest(matix);
		System.out.printf("Najveci elemenat je: "+l.maxValue+" sa koordinatama ("+ l.row+ " , " +l.column+ ")");
		
		unos.close();
		
	}

}



	class Location{
	
		public int row;
		public int column;
		public double maxValue;
		
	}