package Projekat_4;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Hangman {
	/**
	 * mora bit 1 string, sacinjen samo od slova i od praznog prostora 2
	 */

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in); // Kreiramo
																	// Scanner
																	// objekt

		// Grupe drzava
		String[] graduBIH = { "TUZLA", "MOSTAR", "JAJCE", "BANJA LUKA",
				"DOBOJ", "GRACANICA", "GRADACAC", "LIVNO", "DUVNO", "KAKANJ",
				"ZENICA", "TREBINJE", "BRCKO", "BIJELJINA", "GRADISKA",
				"BIHAC", "GABELA", "BREZA", "ZIVINICE", "KALESIJA", "TEOCAK",
				"UGLJEVIK" };
		String[] graduHRV = { "ZAGREB", "SPLIT", "SIBENIK", "ZADAR",
				"VIROVITICA", "PULA", "DUBROVNIK", "OSIJEK", "RIJEKA",
				"MEDJIMURJE", "VUKOVAR" };
		String[] graduEU = { "PARIZ", "MADIRD", "MINHEN", "BARSELONA",
				"LONDON", "OSLO", "ROSTOV", "REJKJAVIK", "HAMBURG", "BREMEN",
				"KOPENHAGEN", "BRISEL", "AMSTERDAM", "ISTANBUL", "MONAKO",
				"NICA", "VARSAVA", "PRAG", "BEC", "BRATISLAVA", "BUKUREST",
				"MOSKVA", "SOFIJA", "BEOGRAD", "SEVILJA", "BRDO", "LIVERPUL",
				"LJUBLJANA", "BERN", "KIJEV", "POZNJAN", "MINSK", "TBILISI",
				"BAKU", "JEREVAN", "BILBAO", "RIM", "MILAN", "TORINO",
				"NAPULJ", "FRANKFURT", "BRIZ", "GLAZGOV", "MOSKVA", "BON",
				"KARDIF", "DABLIN", "BAZEL", "STOKHOLM" };
		String[] graduWorld = { "BUENOS AIERES", "NEW YORK", "TRIPOLI",
				"PEKING", "UAGADUGU", "JOHANESBURG", "BRAZILIJA", "SAO PAOLO",
				"RIO DE ZENEIRO", "PLATA", "SANGAJ", "TOKIO", "ADIS ABEBA",
				"MOGADISU", "RIJAD", "DIBAI", "DOHA", "TASKENT", "BAGDAD",
				"KUALA LUMPUR", "NAJROBI", "ASTANA", "VASINGTON",
				"MEXICO CITY", "LA PAZ", "KITO","ANTANANARIVU","DAKAR","TORONTO", "MONTREAL", "BANKOK" };

		// // Grad koju pogadjamo (puni naziv i sa zvjezdicama)
		String[] zaPogodit;

		// Petlja pomocu koje dobijamo jednu od postojecih gradova
		while (true) {
			System.out.println("[1] GRAD U BiH");
			System.out.println("[2] GRAD U HRVATSKOJ");
			System.out.println("[3] GRAD U EVROPI");
			System.out.println("[4] GRAD U SVIJETU");
			System.out.print("ODABERITE KATEGORIJU: ");
			try {
				int odabir = input.nextInt(); // Odabir 
				switch (odabir) {
				// Pozivamo metodu koja bira grad iz odredjene liste
				case 1:
					zaPogodit = odabirGrada(graduBIH);
					break;
				case 2:
					zaPogodit = odabirGrada(graduHRV);
					break;
				case 3:
					zaPogodit = odabirGrada(graduEU);
					break;
				case 4:
					zaPogodit = odabirGrada(graduWorld);
					break;

				// Ako unos nije bio tacan bacamo izuzetak
				default:
					throw new InputMismatchException();
				}
				break; // Napustamo petlju nakon uspjesnog odabira kategorije (a
						// samim tim i drzave)
			} catch (InputMismatchException ex) { // Hvatanje izuzetaka
				System.out.println("DOSLO JE DO GRESKE! POGRESAN UNOS.");
				input.nextLine();
			}
		}

		int brojPromasaja = 0; // Ukupan broj promasaja
		int pronadjeno; // Broj ponavljanja posmatranog slova

		String drzava = new String(zaPogodit[0]); // Ciljani grad
		String pogadjanje = new String(zaPogodit[1]); // Pomocni string za
														// pogadjanje ciljane
														// drzave
		String slovo; // String za unos slova
		ArrayList<Character> promasaji = new ArrayList<>(); // Lista promasaja
		System.out
				.println("POGODITE KOJI JE GRAD. AKO POGRIJESITE 6 PUTA, IZGUBILI STE");

		while (brojPromasaja < 6) { // Maksimalan broj promasaja je 5, na 6om
									// gubimo

			if (drzava.equals(pogadjanje)) {
				// Kada pogodimo koji je grad zavrsavamo sa igrom
				System.out.println("\nGRAD: " + drzava + "\nPOBJEDILI STE");
				System.exit(0);
			}

			System.out.println("\nGRAD: " + pogadjanje); // Ispis trenutnog
															// stanja

			System.out.print("SLOVO: ");
			slovo = input.next().toUpperCase(); // Unos slova (pretvaramo odma u
												// veliko)

			while (slovo.length() != 1 || !Character.isLetter(slovo.charAt(0))
					|| vecBilo(promasaji, slovo.charAt(0))) {
				// Ukoliko unos nije bio samo jedno slovo ili se slovo vec
				// ponovilo, ponavljamo unos
				System.out.print("SLOVO: ");
				slovo = input.next().toUpperCase();
			}

			pronadjeno = 0; // Za svako slovo brojac je na nuli prije testiranja

			for (int i = 0; i < drzava.length(); i++) { // Provjeravamo da li
														// smo pogodili slovo
				if (drzava.charAt(i) == slovo.charAt(0)) {
					// Mijenjamo string za ispis (dodajemo mu pogodjeno slovo)
					pogadjanje = pogadjanje.substring(0, i) + slovo.charAt(0)
							+ pogadjanje.substring(i + 1);
					pronadjeno++;
				}
			}
			if (pronadjeno == 0) {
				// Ako nismo pogodili slovo, dodajemo ga u listu promasaja i
				// povecavamo broj promasaja za +1
				promasaji.add(slovo.charAt(0));
				brojPromasaja++;
			}
			System.out.println("GRESKE: " + promasaji.toString()); // Ispis
																	// promasenih
																	// slova
		}

		// Nakon sto napravimo 6 ispisujemo status
		System.out.println("IZGUBILI STE! ODGOVOR JE: " + drzava);
		System.out.println("   ______");
		System.out.println("   |    |");
		System.out.println("   O    |");
		System.out.println("  \\|/   |");
		System.out.println("   |    |");
		System.out.println("  / \\   |");
		System.out.println("________|");

		input.close(); // Zatvaranje Scannera
	}

	/*
	 * Metoda koja iz proslijedjene liste vraca nasumicno odabrani grad,
	 * zajedno sa stringom koji umjesto slova sadrzi zvjezdice
	 */
	public static String[] odabirGrada(String[] lista) {
		int pozicijaDrzave = (int) (Math.random() * lista.length); // Nasumicno
																	// generisan
																	// index
																	// drzave
		String drzava = lista[pozicijaDrzave]; // Posmatrani grad
		String pogadjanje = ""; // String za pogadjanje

		// Mijenjamo slova za zvjezdice (ako je razmak, to ne mijenjamo)
		for (int i = 0; i < drzava.length(); i++) {
			if (Character.isLetter(drzava.charAt(i)))
				pogadjanje += '*';
			else
				pogadjanje += drzava.charAt(i);
		}

		String[] odabrana = { drzava, pogadjanje }; // Lista koja sadrzi grad
													// zajedno sa stringom za
													// pokusaj
		return odabrana; // Vracamo odabranu listu
	}

	/* Metoda koja provjerava da li se slovo nalazi u listi promasaja */
	public static boolean vecBilo(ArrayList<Character> promasaji, char slovo) {
		for (int i = 0; i < promasaji.size(); i++)
			if (slovo == promasaji.get(i))
				return true; // Ako se slovo nalazi u listi promasaja vracamo
								// true

		return false; 
	}

}