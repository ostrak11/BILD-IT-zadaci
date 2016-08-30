package zadaci_29_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;

/* Write a program that prompts the user to enter an integer m and find the smallest integer n such that m * n is a perfect square. 
 * (Hint: Store all smallest factors of m into an array list. n is the product of the factors that appear an odd number of times in the array list.
 *  For example, consider m = 90, store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of times in the array list. So, n is 10.*/

public class Zad2_perfect_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner in = new java.util.Scanner(System.in);
		
		boolean checkIn = true;
		
		/// do while petlja da se izvrsava sve dok ne bude korektan cijeli broj
		do{
			//try blok provjerava unos
			try{
				System.out.println("Unesite broj: ");
				int m=in.nextInt();
				int n = n(m);
				checkIn=false;
				System.out.println("Najmanji broj 'n' tako da 'm * n' ima korijen cijeli broj:"+  n+"\n "+ m +" * " + n+ " = "+ (m*n) );
			}
			//hvata exception
			catch (InputMismatchException e) {
				System.out.println("Pogresan unos, unesite ponovo!!!"); 
				    in.nextLine();
				
				}
			}while(checkIn);
		
		in.close();
		
	}

	//metoda za pronalazak najmanjeg broja n
		public static int n (int m){
			
			ArrayList <Integer> factors = new ArrayList<>();
			
			//dodavanje najmanjih faktora u listu
				for (int i = 2; i <= m; i++) {
						     while(m%i==0) {
						         factors.add(i);
						            m /= i;
						            }
						  }
			
				factors=newList(factors);	
				int n = product(factors);
				
				return n;
		}
		
		//metoda koja vraca uredjenu ArrayListu
		public static ArrayList <Integer> newList (ArrayList<Integer> list){
			
			//nova lista koja sadrzi elemente broja n
			ArrayList<Integer> newList = new ArrayList<>();
			
			for (int i=0; i< list.size(); i++){
				int counter=0;
				
				for (int j=0; j<list.size(); j++){
						//provjera brojeva koji su isti medju najmanjim faktorima
					if (list.get(i).equals(list.get(j))){
						counter++;	//inkrementiranje brojaca
					}
				}
				//uzimamo samo one brojeve koji se pojavljuju neparan broj puta u listi
				if (counter %2 !=0){
					newList.add(list.get(i));
				}
			}
			return removeDuplicate(newList);		//vraca novu listu bez duplih brojeva
		}
		
		//metoda koja brise duplikate
		public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list){
			
			//prva for petlja za provjeru svakog elementa
			for (int i=0; i<list.size()-1; i++){
				
				for (int j=i+1; j<list.size(); j++){
					
					//uslov ako je pronadjen duplikat na nekoj narednoj poziciji da se izbrise
					if (list.get(i).equals(list.get(j))){
						
						list.remove(list.get(j));
						j--;
					}
				}
			}
			return list;
		}
		
		//metoda koja vraca proizvod elemenata ArrayLite
		public static int product(ArrayList<Integer> list){
			
			int product=1;
			for (int i=0; i<list.size(); i++){
				product *=list.get(i);
			}
			return product;
	}
	
}
