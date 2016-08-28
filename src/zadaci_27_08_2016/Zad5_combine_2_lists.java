package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*Write a method that returns the union of two array lists of integers using the following header:
		public static ArrayList<Integer> union(  ArrayList<Integer> list1, ArrayList<Integer> list2)
 	For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is {2, 3, 1, 5, 3, 4, 6}. 
 	Write a test program that prompts the user to enter two lists, 
 	each with five integers, and displays their union. 
 	The numbers are separated by exactly one space in the output. */

public class Zad5_combine_2_lists {

	static Scanner unos= new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		//unos 
		System.out.println("Unesite  u listu 1, 5 brojeva: ");
		for (int i=0; i<5; i++){
			int j= provjera();
			list1.add(j);
		}
		System.out.println("Unesite  u listu 2, 5 brojeva: ");
		for (int i=0; i<5; i++){
			int j= provjera();
			list2.add(j);
		}
		
		//printanje listi
		System.out.println("Sastavljena lista:");
		print (union(list1,list2));
		
		
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

	public static ArrayList<Integer> union(  ArrayList<Integer> list1, ArrayList<Integer> list2){
		
		ArrayList<Integer> union = new ArrayList<>();
	
		//ubacivanje prve liste u listu union
	
		for (int i=0; i<list1.size();i++){
			union.add(list1.get(i));
		}
	
		//ubacivanje druge liste u listu union
		for (int i=0; i<list2.size();i++){
			union.add(list2.get(i));
		}
	
		return union;
	}

	//printanje liste
	public static void print (ArrayList<Integer>list){
					
		for (int i=0; i<list.size(); i++){
			System.out.print(list.get(i)+ " ");
		}
	}
	
}
