package zadaci_10_08_2016;

/*Napisati program koji ispisuje sve moguće kombinacije za biranje dva broja u rasponu od 1 do 7. 
 * Također, program ispisuje broj svih mogućih kombinacija.  Dakle, program treba da ispiše sve moguće parove brojeva u datom rasponu, 
 * krenuvši sa 1 2, 1 3, 1 4, itd. Broj mogućih kombinacija je 21. */

public class Zad3_kombinacija_1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// niz velicine 7 iz kojeg cemo koristiti indexe
		int[] niz = new int[7];
		int brojac = 0;

		// prolaz kroz dvije petnje da napravimo parove, uz uslov da je i<j tj
		// da se brojevi neponavljaju, s tim sto indexe poramo povecati za jedan
		// kako 0 ne bi bila uzeta u obzir;
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				if (i < j) {
					System.out.print((i + 1) + "," + (j + 1) + " ;  ");
					brojac++;
				}
			}
		}
		
		//ispis ukupnog broja kombinacija
		System.out.println();
		System.out.println("Ukupan broj kombinacija iznosi: " + brojac);
	}

}
