package zadaci_03_08_2016;

/* Napisati metodu koja prima 2 argumenta: početni broj i krajnji broj te printa sve proste brojeve u zadanom rangu.
 BONUS: metoda može primati i treći argument, broj brojeva za isprintati po liniji.*/

public class Zad1_prosti_brojevi {

	public static void printProst(int first, int secund, int row) {

		boolean prost;

		// brojac prostih brojeva
		int brojac = 0;

		// definisemo raspon u kojem cemo traziti proste brojeve
		for (int i = first; i <= secund; i++) {
			// pretpostavimo da je sveki broj prost
			prost = true;

			for (int j = 2; j < i; j++) { // testiramo brojeve u datom rasponu
											// da li su djeljivi sa nekim
											// brojem, ako jest nije onda prost
											// broj
				if (i % j == 0) {
					prost = false;
					break;
				}
			}

			// ispis prostih brojeva i brojac za ispis po redovima
			if (prost == true) {
				System.out.print(i + " ");
				brojac++;

				if (brojac % row == 0) {
					System.out.println();
				}
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printProst(2, 50, 5);

	}

}
