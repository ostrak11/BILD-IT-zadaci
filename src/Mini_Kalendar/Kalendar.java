package Mini_Kalendar;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class Kalendar {

	int mjesec, godina;

	Kalendar() {
	};

	// metoda za printanje kalendara iz dva dijela zaglavlja i tijela
	public static void printKalendar(int godina, int mjesec) {
		printZag(godina, mjesec);
		printBody(godina, mjesec);
	}

	// metoda za print zaglavnja koje sadrzi ime mjeseca i godinu, kao i dane u
	// sedmici
	static void printZag(int godina, int mjesec) {

		String nazivMon = "";
		// U odnosu na broj mjeseca, dodjeljujemo odgovarajuci naziv
		switch (mjesec) {
		case 1:
			nazivMon = "Januar";
			break;
		case 2:
			nazivMon = "Februar";
			break;
		case 3:
			nazivMon = "Mart";
			break;
		case 4:
			nazivMon = "April";
			break;
		case 5:
			nazivMon = "Maj";
			break;
		case 6:
			nazivMon = "Juni";
			break;
		case 7:
			nazivMon = "Juli";
			break;
		case 8:
			nazivMon = "August";
			break;
		case 9:
			nazivMon = "Septembar";
			break;
		case 10:
			nazivMon = "Oktobar";
			break;
		case 11:
			nazivMon = "Novembar";
			break;
		case 12:
			nazivMon = "Decembar";
			break;
		}

		System.out.println("\t    " + nazivMon + " " + godina);
		System.out.println("---------------------------------");
		System.out.printf("%-4s %-4s %-4s %-4s %-4s %-4s %-4s ", "PON", "UTO",
				"SRI", "CET", "PET", "SUB", "NED");
	}

	// metoda za printanje dana u kalendar ili tijelo kalendara
	static void printBody(int godina, int mjesec) {
		System.out.println();

		// poziv metoda za određivanje pocetnog dana
		int prviDan = prviDan(godina, mjesec);
		// poziv metoda za određivanje broja dana u mjesecu
		int daniUmjesecu = daniUmjesecu(godina, mjesec);

		// ispis preznina do prvog dana u mjesecu(npr mjesec pocinje u Petak,
		// dani do petka su prazni za prvu sedmicu)
		for (int i = 0; i < prviDan; i++) {
			System.out.print("     ");
		}

		//ispis dana u mjesecu
		for (int i = 1; i <= daniUmjesecu; i++) {
			System.out.printf("%-4d ", i);
			if ((i + prviDan) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();

	}

	//metoda za broj dana u mjesecu
	static int daniUmjesecu(int godina, int mjesec) {
		//mjeseci sa 31 danaom
		if ((mjesec == 1) || (mjesec == 3) || (mjesec == 5) || (mjesec == 7)
				|| (mjesec == 8) || (mjesec == 10) || (mjesec == 12)) {
			return 31;
		}
		//mjeseci sa 30dana
		if ((mjesec == 4) || (mjesec == 6) || (mjesec == 9) || (mjesec == 11)) {
			return 30;
		}
		//februar sa 28 ili 29 dana
		if (mjesec == 2) {
			if (prestupnaGodina(godina) == true) {
				return 29;
			} else {
				return 28;
			}
		}
		//reda radi
		return 1;

	}

	//metoda za određivanje prestupne godine
	static boolean prestupnaGodina(int godina) {
		// Uslov da bi godina bila prijestpuna
		if ((godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0)) {
			return true;
		}
		return false;
	}

	
	static int prviDan(int godina, int mjesec) {
		// znamo da je 01.01.1800. srijeda
		final int prvidan = 2;

		//poziv metode za ukupan broj dana 
		int ukupnoDana = brojDana(godina, mjesec);
		
		//vraca pocetni dan
		return (ukupnoDana + prvidan) % 7;

	}

	// metoda koja vraca broj dana u godini
	static int brojDana(int godina, int mjesec) {
		int prvagod = 1800;
		int brojDana = 0;

		//brojimo dane od početne do posmatrane godine
		while (prvagod < godina) {
			if (prestupnaGodina(prvagod)) {
				brojDana += 366;
			} else {
				brojDana += 365;
			}
			prvagod++;
		}

		//ukupan broj dana saberemo sa brojem dana u posmatranoj godini do posmatranog mjeseca
		brojDana += brojTrazenogDatuma(godina, mjesec);
		return brojDana;
	}

	//metoda za broj dana do trazenog datuma
	static int brojTrazenogDatuma(int godina, int mjesec) {
		int brojacMjeseci = 1;
		int brojDana = 0;
		int brojFeb;

		//provjera da li je godina prestupna
		if (prestupnaGodina(godina)) {
			brojFeb = 29;
		} else {
			brojFeb = 28;
		}

		
		while (brojacMjeseci < mjesec) {
			switch (brojacMjeseci) {
			case 1:
				brojDana += 31;
				break;
			case 2:
				brojDana += brojFeb;
				break;
			case 3:
				brojDana += 31;
				break;
			case 4:
				brojDana += 30;
				break;
			case 5:
				brojDana += 31;
				break;
			case 6:
				brojDana += 30;
				break;
			case 7:
				brojDana += 31;
				break;
			case 8:
				brojDana += 31;
				break;
			case 9:
				brojDana += 30;
				break;
			case 10:
				brojDana += 31;
				break;
			case 11:
				brojDana += 30;
				break;
			case 12:
				brojDana += 31;
				break;
			}
			brojacMjeseci++;
		}
		//vraca broj dana do posmatranog mjeseca
		return brojDana;
	}

	//metoda za upis u podsjetnik
	public void upisPodsjetnik(int godina, int mjesec, int dan, String poruka)
			throws FileNotFoundException {
		//pravimo novi fajl
		File fajl = new File(dan + "." + mjesec + "." + godina + ".txt");

		//provjera da li fajl postoji
		if (fajl.exists()) {
			Scanner unos = new Scanner(fajl);
			
			System.out.println("Podsjetnik za ovaj datum postoji");

			//citamo podatke iz fajla
			while (unos.hasNextLine()) {
				System.out.println(unos.nextLine());
			}
			unos.close();
		} else {
			PrintWriter por = new PrintWriter(fajl);

			//upisujemo podatke u fajl
			por.println(poruka);

			por.close();
		}
	}

	//metoda za ispis podsjetnika
	public void ispisPodsjetnik(int godina, int mjesec, int dan)
			throws FileNotFoundException {
		File fajl = new File(dan + "." + mjesec + "." + godina + ".txt");

		Scanner unos = new Scanner(fajl);

		System.out.println("Podsjetnici za " + dan + "." + mjesec + "."
				+ godina + ".: ");
		// Citamo podatke iz fajla 
		while (unos.hasNextLine()) {
			System.out.println(unos.nextLine());
		}
	
		unos.close();

	}

}
