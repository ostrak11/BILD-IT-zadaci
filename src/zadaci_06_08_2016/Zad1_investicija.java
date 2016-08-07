package zadaci_06_08_2016;

import java.util.Scanner;

/*Napisati program koji učitava iznos investicije, godišnju interesnu stopu i broj godina te vraća buduću vrijednost investicije 
 * koristeći se sljedećom formulom: buducaVrijednostInvesticije = iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12.
 *  Na primjer, ukoliko uneste kao iznos investicije 1000, 3.25 kao godišnju interesnu stopu i 1 kao broj godina program vam vraća 1032.98 
 *  kao buducu vrijednost investicije.*/

public class Zad1_investicija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);

		// unos investicije, kamatne stope i godine ukamaćivanja
		System.out.println("Molimo Vas unesite iznos investicije: ");
		double inv = 0;
		try {
			inv = unos.nextDouble();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Pogresan unos!!!");
			System.exit(0);
		}

		System.out
				.println("Molimo Vas unesite godišnju interesnu stopu(uzmite u obzir da unesete tacku između brojeva umjesto zareza, ukoliko broj ima decimalu): ");
		double stopa = 0;
		try {
			stopa = unos.nextDouble();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Pogresan unos!!!");
			System.exit(0);
		}

		System.out.println("Molimo Vas unesite broj godina: ");
		int god = 0;
		try {
			god = unos.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Pogresan unos!!!");
			System.exit(0);
		}

		// izracunavanje buduce vrijednosti investicije
		double futureValue = inv
				* Math.pow(((1 + ((stopa / 100) / 12))), (god * 12));

		// ispis rezultata
		System.out.println("Buduca vrijednost vase investicije od " + inv
				+ "KM sa stopom povrata " + stopa + "% godisnje na period od "
				+ god + ".godine iznosi " + futureValue + "KM.");

		unos.close();
	}

}
