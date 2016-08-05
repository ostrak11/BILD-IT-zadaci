package zadaci_04_08_2016;

import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

/*Napisati metodu sa sljedećim headerom koja ispisuje tri broja u rastućem redosljedu: 
 * public static void displaySortedNumbers(double num1, double num2, double num3). 
 * Napisati program koji pita korisnika da unese tri broja te ispiše ta tri broja u rastućem redosljedu. */


public class Zad3_rastuci_niz {
	
	 public static void displaySortedNumbers(double num1, double num2, double num3){
		//niz u koji spremamo brojeve
		 double [] niz= new double[3];
		 
		 niz[0]=num1;
		 niz[1]=num2;
		 niz[2]=num3;
		 
		 //sortiranje niza
		 Arrays.sort(niz);
		 
		 //ispis
		 for (double e:niz){
			 System.out.print(e + " ");
		 }
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//unos brojeva
		Scanner unos= new Scanner(System.in);		
		System.out.println("Molimo Vas unesite tri broja: ");
		
		try {
			double num1=unos.nextDouble();
			double num2=unos.nextDouble();
			double num3=unos.nextDouble();
			
			//pozivanje metode
			System.out.print("Ispis brojeva u rastucem nizu:");
			displaySortedNumbers(num1,num2,num3);
			
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.err.println("Pogresan unos!!!");
			System.exit(0);
		}finally{
			//zatvaranje resursa
			unos.close();
		}
		
	}

}
