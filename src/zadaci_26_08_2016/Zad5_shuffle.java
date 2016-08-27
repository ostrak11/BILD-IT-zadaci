package zadaci_26_08_2016;

import java.util.ArrayList;

/* (Shuffle ArrayList) Write the following method that shuffles the elements in an ArrayList of integers. */

public class Zad5_shuffle {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				ArrayList<Integer> list = new ArrayList<>();
				for (int i = 0; i < 10; i++) {
					//dodavanje u listu objekata(vrijednost indexa)
					list.add(i);
				}
				System.out.println("Orginalna lista:" + list);

				System.out.println("Randomizirana lista :");
				//metoda
				shuffle(list);

	}

	public static void shuffle(ArrayList<Integer> list) {
		
		for (int i = 0; i < list.size(); i++) {
			// privremena varijabla
			int num = list.get(i);
			//brisanje elementa
			list.remove(list.get(i));
			//kreiranje random indexa
			int random = (int) (Math.random() * list.size() - 1);
			//dodavanje privremene vrijednosti rendomiziranom indexu
			list.add(random, num);
		}
		//print
		System.out.println(list);

	}

	
}
