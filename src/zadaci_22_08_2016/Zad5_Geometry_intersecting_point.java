package zadaci_22_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Suppose two line segments intersect. The two endpoints for the first line segment are (x1, y1) and (x2, y2) and for the second line segment are (x3, y3) and (x4, y4). 
 * Write a program that prompts the user to enter these four endpoints and displays the intersecting point. As discussed in Programming Exercise 3.25, 
 * the intersecting point can be found by solving a linear equation. Use the LinearEquation class in Programming Exercise 9.11 to solve this equation. 
 * See Programming Exercise 3.25 for sample runs. */

public class Zad5_Geometry_intersecting_point {

	static Scanner unos= new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//unos koordinata tacaka
		System.out.println("Unesite koordinatu prve tacke x1: ");
		double x1=provjera();
		
		System.out.println("Unesite koordinatu prve tacke y1: ");
		double y1=provjera();
		
		System.out.println("Unesite koordinatu druge tacke x2: ");
		double x2=provjera();
		
		System.out.println("Unesite koordinatu druge tacke y2: ");
		double y2=provjera();
		
		System.out.println("Unesite koordinatu trece tacke x3: ");
		double x3=provjera();
		
		System.out.println("Unesite koordinatu trece tacke y3: ");
		double y3=provjera();
		
		System.out.println("Unesite koordinatu cetvrte tacke x4: ");
		double x4=provjera();
		
		System.out.println("Unesite koordinatu cetvrte tacke x4: ");
		double y4=provjera();
		
		//kreiranje objekata
		LinearEquation linear= LinearEquation.getIntersectingPoint(x1, y1, x2, y2, x3, y3, x4, y4);
		
		//ispis rezultata
		if(linear.isSolvable()){
			System.out.print("Presjek dvije prave je u tacki sa koordinatama x=" + linear.getX()+ " i y=" + linear.getY());
		}else{
			System.out.print("Prave su paralelne!!!");
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
