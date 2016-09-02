package zadaci_01_09_2016;

import java.util.ArrayList;

/* Write the following method that sorts an ArrayList of numbers. 
public static void sort(ArrayList<Number> list) */

public class Zad5_Sort_ArrayList {

	public static void sort(ArrayList<Number> list){
		
		for (int i=0; i<list.size()-1; i++){
			
			for (int j=i+1; j<list.size(); j++){
				
				//if uslov ukoliko je indeks i veci od susjednog desnog indeksa j
				//koristimo metodu intValue() za pretvaranje u integer vrijednosti
				if ( list.get(i).intValue()> list.get(j).intValue()){
					// vrijedonst a i b dobivaju mjesta indeksa i i j
					Number a = list.get(i);
					Number b = list.get(j);
					
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

			//kreranje Arrayliste za apstraktnu klasu Number
				ArrayList<Number> list = new ArrayList<>();
				
				//unos 10 random brojeva
				for (int i=0; i<10; i++){
					int j= (int)(Math.random()*20);
					list.add(j);
				}
				
				System.out.println("Arraylista je:");
				//printanje liste
				System.out.println(list);
				//sortiranje liste
				sort(list);
				System.out.println("\nSortirana lista je:");
				System.out.println(list);
		
	}

}
