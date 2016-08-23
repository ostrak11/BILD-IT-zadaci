package zadaci_22_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Design a class named QuadraticEquation for a quadratic equation ax2 + bx + x = 0.  The class contains:
 ■ Private data fields a, b, and c that represent three coefficients. 
 ■ A constructor for the arguments for a, b, and c. 
 ■ Three getter methods for a, b, and c. 
 ■ A method named getDiscriminant() that returns the discriminant, which is b2 - 4ac. 
 ■ The methods named getRoot1() and getRoot2() for returning two roots of the equation 
		r1 =-b +2b2 - 4ac 2a
	and r2 =-b -2b2 - 4ac 2a 
These methods are useful only if the discriminant is nonnegative. Let these methods return 0 if the discriminant is negative. 

Draw the UML diagram for the class and then implement the class. Write a test program that prompts the user to enter values for a,b, and c and 
displays the result based on the discriminant. If the discriminant is positive, display the two roots. If the discriminant is 0, display the one root. 
Otherwise, display “The equation has no roots.” See Programming Exercise 3.1 for sample runs. */

public class Zad3_quadratic_equations {

	static Scanner unos= new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//unos
		System.out.println("Unesite koeficijent a: ");
		int a=provjera();
		
		System.out.println("Unesite koeficijent b: ");
		int b=provjera();
		
		System.out.println("Unesite koeficijent c: ");
		int c=provjera();
		
		QuadraticEquation test1= new QuadraticEquation(a,b,c);
		
		//ipsis rezultata zavisno o diskriminanti
		if(test1.getDiscriminant()>0){
			System.out.println("Prvi korijen jednacine je: " + test1.getRoot1());
			System.out.println("Drugi korijen jednacine je: " + test1.getRoot2());
		}else if (test1.getDiscriminant()==0){
			System.out.println("Prvi korijen jednacine je: " + test1.getRoot1());
		}else{
			System.out.println("Jednacina nema korijena.");
		}
		
		
	}

	
	//provjer unosa podataka
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
}


class QuadraticEquation{
	
	//varijable
	private int a;
	private int b;
	private int c;
	
	//kontruktor
	QuadraticEquation(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	//metoda koja vraca diskriminantu
	double getDiscriminant(){
		return b*b-(4*a*c);
	}
	
	//metode za izračunavanje korijena
	double getRoot1(){
		if(getDiscriminant()<0){
			return 0;
		}else{
			return (-b + Math.sqrt(getDiscriminant()))/ (2*a);
		}
	}
	
	double getRoot2(){
		if(getDiscriminant()<0){
			return 0;
		}else{
			return (-b - Math.sqrt(getDiscriminant()))/ (2*a);
		}
	}
	
}
