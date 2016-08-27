package zadaci_26_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


/* (Maximum element in ArrayList) Write the following method that returns the maximum value in an ArrayList of integers. 
 * The method returns null if the list is null or the list size is 0.
 *  public static Integer max(ArrayList<Integer> list)
 *  446 Chapter 11  Inheritance and Polymorphism

Write a test program that prompts the user to enter a sequence of numbers ending with 0, and invokes this method to return the largest number in the input. */

public class Zad3_max_array {

	static Scanner unos= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// kreiranje Array Liste
		ArrayList<Integer> list = new ArrayList<>();
		int number;
		
		//unos
		System.out.println("Unijeti neogranicen broj cijelih brojeva. (0 prekida unos)");
		while (true) {
			
				// unijeti broj
				System.out.print("Unesite broj: ");
				number = provjera();
				// if broj je 0 izlazi iz petlje
				if (number == 0) {
					break;
				}
				//dodaj u listu broj ako nije nula
				list.add(number);
			
		}
		
		// print max vrijednosti
		System.out.println("Max number is: " + max(list));
		unos.close();
		
		
	}

	public static Integer max(ArrayList<Integer> list) {
		// akoje lista prazna ili je njena duzina nula vraca da se ne moze naci max vrijednost
		if (list == null || list.size() == 0) {
			System.out.println("Ne mozemo vratiti max vrijednost jer je lista prazna");
			return null;
		}
		// pretpostavimo da se max vrijednost nalazi na krvom elementu liste i poredimo sa ostalim vrijednostima
		Integer number = new Integer(list.get(0));
		for (Integer integer : list) {
			if (integer > number) {
				//ukoliko nađe vecu vrijednost dodijeli je vrijednosti number
				number = integer;
			}
		}
		return number;
	}
	
	
	public static int provjera() {
		
		int broj = 0;	
		boolean provjera = true;	
		do {
			//ucitavanje unosa i provjera 
			try {
				broj = unos.nextInt();	
								
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
	
}
