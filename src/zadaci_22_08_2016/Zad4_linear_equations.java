package zadaci_22_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Design a class named LinearEquation for a  2 * 2 system of linear equations: 
 * ax + by = e 
 * cx + dy = f 
 * x = ed - bf ad - bc 
 * y = af - ec ad - bc 
 * The class contains:
 ■ Private data fields a, b, c, d, e, and f. 
 ■ A constructor with the arguments for a, b, c, d, e, and f.
  ■ Six getter methods for a, b, c, d, e, and f. 
  ■ A method named isSolvable() that returns true if ad - bc is not 0. 
  ■ Methods getX() and getY() that return the solution for the equation. 
  
  Draw the UML diagram for the class and then implement the class. Write a test program that prompts the user to enter a, b, c, d, e, and f and displays the result. 
  If ad - bc  is 0, report that “The equation has no solution.” */

public class Zad4_linear_equations {

	static Scanner unos= new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//unos koeficijenata
		System.out.println("Unesite koeficijent a: ");
		double a=provjera();
		
		System.out.println("Unesite koeficijent b: ");
		double b=provjera();
		
		System.out.println("Unesite koeficijent c: ");
		double c=provjera();
		
		System.out.println("Unesite koeficijent d: ");
		double d=provjera();
		
		System.out.println("Unesite koeficijent e: ");
		double e=provjera();
		
		System.out.println("Unesite koeficijent f: ");
		double f=provjera();
		
		//kreiranje objekta
		LinearEquation equ= new LinearEquation(a,b,c,d,e,f);
		
		//ispis rezultata 
		if (equ.isSolvable()){
			System.out.println("Rijesenje je... x=" + equ.getX()+ " i y=" + equ.getY());
		}else{
			System.err.println("Jednacine nemaju rjesenja!!!");
		}
		
		unos.close();
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

}

class LinearEquation{
	
	//varijable
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	//kontruktor
	LinearEquation(double a,double b,double c,double d,double e,double f){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
	}
	
	//getter metode
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	public double getD() {
		return d;
	}
	
	public double getE() {
		return e;
	}
	
	public double getF() {
		return f;
	}
	
	//metoda koja vraca da li je moguce rijesiti jednacine
	boolean isSolvable(){
		if ((a*d)-(b*c)==0){
			return false;
		}else{
			return true;
		}
	}
	
	//metode koje vracaju rjesenje jednacine x i y
	double getX(){
		return ((e*d)-(b*f))/((a*d)-(b*c));
		
	}
	
	double getY(){
		return ((a*f)-(e*c))/((a*d)-(b*c));
	}
	
	//metoda koja vraca novi objekat na osnovu unesenih koordinata
	public static LinearEquation getIntersectingPoint(double x1, double y1, double x2, double y2, double x3, double y3,	double x4, double y4) {
		double a = (y1 - y2);
		double b = (-x1 + x2);
		double c = (y3 - y4);
		double d = (-x3 + x4);
		double e = -y1 * (x1 - x2) + (y1 - y2) * x1;
		double f = -y3 * (x3 - x4) + (y3 - y4) * x3;

		return new LinearEquation(a, b, c, d, e, f);
}
}
