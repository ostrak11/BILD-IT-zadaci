package zadaci_01_08_2016;

import java.util.ArrayList;

/* Napisati sljedeću metodu koja vraća najveću vrijednosti u ArrayListu Integera. 
  Metoda vraća null ukoliko je lista null iil ukoliko lista sadrži 0 elemenata.
  public static Integer max(ArrayList<Integer> list)*/

public class ArrayListMax {
	
	 public static Integer max(ArrayList<Integer> list){
		 //deklarisanje i inicijalizacija početnog najvećeg elementa
		 int max=0;
		 
		 // definisati kad je niz prazan
		 if(list.size()==0){
			 //throw type name = new type(arguments);
			 return null;
		 }
		 
		 // pronalazak i dodijeljivanje vrijednosti najvećem elementu niza
		 for (int i =0; i<list.size();i++){
			 if (list.get(i)>max){
				 max = list.get(i);
				 			 }
		 }
		 return max;
		 
	 }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> lista= new ArrayList<>();
		
		System.out.println("Najveci element u Array listi je "+ max(lista));
		
		
		
		
	}

}
