package Zadaci_05_08_2016;

/*Napisati program koji simulira nasumično izvlačenje karte iz špila od 52 karte. 
 * Program treba ispisati koja karta je izvučena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K) te znak u kojem je data karta 
 * (Srce, Pik, Djetelina, Kocka). Primjer: Karta koju ste izvukli je 10 u znaku kocke.*/

public class Zad2_Karte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//nizovi sastavljeni od vrste karte i od znaka
		String[] num={"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K"};
		String[] type={"Srce", "Pik", "Djetelina", "Kocka"}; 
		
		//generisanje nasumicnih brojeva...jedan za velicinu karte drugi za znak
		int num1 = (int)(Math.random()*13);
		int num2 = (int)(Math.random()*4);
		
		//ispis rezultata
		System.out.println("Karta koju ste izvukli je '" + num[num1] +"' u znaku '" + type[num2]+"'.");
		
	}

}
