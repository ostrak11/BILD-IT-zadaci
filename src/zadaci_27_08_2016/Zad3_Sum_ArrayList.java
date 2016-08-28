package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/* Write the following method that returns the sum of all numbers in an ArrayList:
public static double sum(ArrayList<Double> list)
Write a test program that prompts the user to enter 5 numbers, stores them in an array list, and displays their sum. */

public class Zad3_Sum_ArrayList {

	static Scanner unos= new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Double> list = new ArrayList<>();
		
		//unos 
		System.out.println("Unesite 5 brojeva:");
		for (int i=0;i<5; i++){
			list.add(provjera());
		}
		
		//ispis rezultata
		System.out.println("List:");
		print(list);
		System.out.println("\nSuma unesenih brojeva je  "+ sum(list));
		
	}

	
	public static double provjera() {
		
		double broj = 0;	
		boolean provjera = true;	
		do {
			//ucitavanje unosa i provjera 
			try {
				broj = unos.nextDouble();	
								
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
	public static double sum(ArrayList<Double> list){
		
		double sum=0;
		
		for (int i=0; i<list.size(); i++){
			// svaki elemenat u listi dodajemo u varijablu sum
			sum+=list.get(i);
		}
		
		return sum;
		
	}
	
	
	//printanje liste
	public static void print (ArrayList<Double>list){
				
		for (int i=0; i<list.size(); i++){
					System.out.print(list.get(i)+ " ");
				}
	}
}
