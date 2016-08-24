package zadaci_23_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*(Displaying the prime factors) Write a program that prompts the user to enter a positive integer and displays 
 * all its smallest factors in decreasing order. For example, if the integer is 120, the smallest factors are 
 * displayed as 5, 3, 2, 2, 2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and 
 * retrieve and display them in reverse order. */

public class Zad4_prime_factors {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Unesite pozitivan cijeli broj: ");
        int broj = provjera();
        //uslov za pozitivan unos integera
        while (broj<0){
        	broj=provjera();
        }
		
        StackOfIntegers staek = new StackOfIntegers();
        
        int faktor = 2;
        //petlja za pronalazenje najmanjih faktora
        while (faktor <= broj) {
        	//uslov za djeljenje sa najmanjim faktorima
            if (broj % faktor == 0) {
            	//ukoliko nađe prost faktor stavlja ga na vrh steka i broj dijeli sa faktorom
                staek.push(faktor);
                broj /= faktor;
            } 
            else {
                faktor++;
            }
        }
        //petlja za praznjenje stack prostora LIFO princip
        while (!staek.empty()) {
            System.out.print(staek.pop() + " ");
        }
        
        unos.close();
	}

}
