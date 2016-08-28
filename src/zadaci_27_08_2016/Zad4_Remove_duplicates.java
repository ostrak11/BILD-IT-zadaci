package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/* Write a method that removes the duplicate elements from an array list of integers using the following header:
public static void removeDuplicate(ArrayList<Integer> list)
Write a test program that prompts the user to enter 10 integers to a list and displays the distinct integers separated by exactly one space. */

public class Zad4_Remove_duplicates {
	
	static Scanner unos= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> list = new ArrayList<>();
		
		//unos
		System.out.println("Unesite 10 cijelih brojeva:");
		for (int i=0; i<10; i++){
			int j =provjera();
			list.add(j);
		}
		
		//print
		System.out.println("Niz od 10 brojeva:");
		print(list);
		
		//ispis rezultata
		removeDuplicate(list);
		System.out.println("\nPoslije brisanja duplih brojeva:");
		print(list);
		
		
		unos.close();
		
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
	
	public static void removeDuplicate(ArrayList<Integer> list){
		
		//prva for petlja za provjeru svakog elementa
		for (int i=0; i<list.size()-1; i++){
			
			// druga for petlja koja ide od sljedeceg indeksa j
			for (int j=i+1; j<list.size(); j++){
				
				//uslov ako je pronadjen duplikat na nekoj narednoj poziciji da se izbrise
				if (list.get(i).equals(list.get(j))){
					//brisemo taj broj sa indeksom j
					list.remove(list.get(j));
					//umanjujemo j; jer se velicina liste smanjila
					j--;
				}
			}
		}
	}
	
	//printanje liste
	public static void print (ArrayList<Integer>list){
		
		for (int i=0; i<list.size(); i++){
			System.out.print(list.get(i)+ " ");
		}
}
	
}
