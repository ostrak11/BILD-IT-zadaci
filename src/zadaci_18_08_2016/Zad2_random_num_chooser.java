package zadaci_18_08_2016;

/* (Random number chooser) Write a method that returns a random number between 1 and 54, excluding the numbers passed in the argument. 
 * The method header is specified as follows:
 public static int getRandom(int... numbers) */

public class Zad2_random_num_chooser {

	public static int getRandom(int... numbers) {

		int broj = (int) (1 + Math.random() * 54);
		// metoda radi samo u slucaju da se proslijede brojevi koji nezelimo da
		// se rendomiziraju
		if (numbers.length > 0) {
			for (int i = 0; i < numbers.length; i++) {
				// ako generisani broj bude jednak jednom broju iz niza koje ne
				// mogu biti generisani da ponovo generise broj i dase ponovo
				// vrati na pocetak petlje
				if (numbers[i] == broj) {
					broj = (int) (1 + Math.random() * 54);
					i = 0;
				}
			}
		}

		return broj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
