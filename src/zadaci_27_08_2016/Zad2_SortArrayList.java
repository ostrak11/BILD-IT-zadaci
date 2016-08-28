package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*Write the following method that sorts an ArrayList of numbers:
public static void sort(ArrayList<Integer> list)
Write a test program that prompts the user to enter 5 numbers, stores them in an array list, and displays them in increasing order. */

public class Zad2_SortArrayList {

	static Scanner unos= new Scanner(System.in);
	
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
	
	//printanje liste
	public static void print (ArrayList<Integer>list){
						
			for (int i=0; i<list.size(); i++){
				System.out.print(list.get(i)+ " ");
			}
	}
	
	//metoda za sortiranje liste
	public static void sort(ArrayList<Integer> list){
		
		for (int i=0; i<list.size()-1; i++){
			
			for (int j=i+1; j<list.size(); j++){
				
				//if uslov ukoliko je indeks i veci od susjednog desnog indeksa j
				if ( list.get(i)> list.get(j)){
					
					// varijable a i b dobivaju mjesta indeksa i i j
					int a = list.get(i);
					int b = list.get(j);
					
					// postavljamo novu vrijednost za i-ti elemenat od elementa na indeksu j
					// a indeksu j vracamo vrijednost koja je bila na i-tom indeksu
					list.set(i, b);
					list.set(j, a);
				
					
				}
			}
		}
		
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();
		
		//unos 5 brojeva
		System.out.println("Unesite 5 brojeva: ");
		for (int i=0; i<5; i++){
			int j= provjera();
			list.add(j);
		}
		
		//printanje liste
		System.out.println("Unesena lista je:");
		print(list);
		
		//sortiranje liste
		sort(list);
		System.out.println("\nSortirana lista je:");
		
		//ponovno printanje liste
		print(list);
		
		unos.close();
	}

}
