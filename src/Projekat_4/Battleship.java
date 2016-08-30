package Projekat_4;

import java.util.InputMismatchException;

public class Battleship {
	/** IGRA POTAPANJA BRODICA */

	public static void main(String[] args) {
		// Pozivamo metodu koja nasumicno rasporedjuje brodice
		char[][] pozicije1 = pozicijeBrodica();		// Pozicije prvog igraca
		char[][] pozicije2 = pozicijeBrodica();		// Pozicije drugog igraca
		
		char[][] pogadjanje1 = new char[10][10];	// Ploca za pogadjanje prvog igraca
		char[][] pogadjanje2 = new char[10][10];	// Ploca za pogadjanje drugog igraca
		
		// "Ciscenje" listi prije pocetka
		for (int i = 0; i < pogadjanje1.length; i++) {
			for (int j = 0; j < pogadjanje1[i].length; j++) {
				pogadjanje1[i][j] = ' ';
				pogadjanje2[i][j] = ' ';
			}
		}
		
		int player = 0;		// Neka parni brojevi oznacavaju igraca 1, a neparni igraca 2 (prvi igra 1)
		
		while (true) {
			// KAKO BI IGRA BILA STO PREGLEDNIJA IGRAC VIDI SVOJE POTEZE SAMO PRIJE ODIGRAVANJA NOVOG POTEZA
			if (player % 2 == 0) {
				System.out.println("\nNA POTEZU JE PRVI IGRAC (DO SADA ODIGRANI POTEZI)");
				iscrtavanje(pogadjanje1);		// Pozivamo metodu za iscrtavanje dosadasnjih poteza
				odigravanjePoteza(pogadjanje1, pozicije2);	// Pozivamo metodu za odigravanje poteza
				if (pobjeda(pogadjanje1)) {		// Pozivamo metodu koja provjerava da li je igrac pobjedio
					// Nakon sto igrac pobjedi iscrtava mu se ploca i gasi se program
					System.out.println("\nIGRAC 1 JE POBJEDIO");
					iscrtavanje(pogadjanje1);
					System.exit(0);
				}
			} else {
				System.out.println("\nNA POTEZU JE DRUGI IGRAC (DO SADA ODIGRANI POTEZI)");
				iscrtavanje(pogadjanje2);		// Pozivamo metodu za iscrtavanje dosadasnjih poteza
				odigravanjePoteza(pogadjanje2, pozicije1);	// Pozivamo metodu za odigravanje poteza
				if (pobjeda(pogadjanje2)) {	// Pozivamo metodu koja provjerava da li je igrac pobjedio
					// Nakon sto igrac pobjedi iscrtava mu se ploca i gasi se program
					System.out.println("\nIGRAC 2 JE POBJEDIO");
					iscrtavanje(pogadjanje2);
					System.exit(1);
				}
			}
			
			player++;					// Nakon odigranog poteza prelazimo na sljedeceg igraca
		}

	}

	/* Metoda pomocu koje ispisujemo/iscrtavamo trenutno stanje */
	public static void iscrtavanje(char[][] lista) {	
		
		for (int red = 0; red < lista.length; red++) {
			System.out.println("-----------------------------------------");
			for (int kolona = 0; kolona < lista[red].length; kolona++) {
				System.out.print("| " + lista[red][kolona] + " ");	// Ispis elemenata (ili praznina)
			}
			System.out.print("|\n");
		}
		System.out.println("-----------------------------------------");
		
	}
	
	/* Metoda koja nasumicno rasporedjuje brodice.
	 * Vrste brodica i njihova velicina:
	 * Nosac aviona		5
	 * Vojni brod		4
	 * Podmornica		3
	 * Razarac			3
	 * Patrolni brod	2*/	
	public static char[][] pozicijeBrodica() {
		char[][] pozicije = new char[10][10];
		
		// "Ciscenje" liste
		for (int i = 0; i < pozicije.length; i++) {
			for (int j = 0; j < pozicije[i].length; j++) {
				pozicije[i][j] = ' ';
			}
		}
		int polozaj; 	// Polozaj broda (0 predstavlja horizontalan, a 1 vertikalan polozaj)
		int red;	
		int kolona;	
		int velicina;					// Velicina broda
		
		// NOSAC AVIONA
		velicina = 5;						 	// Velicina nosaca aviona
		polozaj = (int)(Math.random() * 2);		// Polozaj nosaca aviona
		if (polozaj == 0) {						// Horizontalni polozaj
			red = (int)(Math.random() * 10);	// Red nosaca aviona
			kolona = (int)(Math.random() * 6);	// Pocetak nosaca aviona (sa lijeva na desno)
			while (velicina > 0) {				// Postavljanje broda (O oznacava dio broda)
				pozicije[red][kolona] = 'O';
				kolona++;
				velicina--;
			}
		} else {								// Vertiklani polozaj
			kolona = (int)(Math.random() * 10);	// Kolona nosaca aviona
			red = (int)(Math.random() * 6);		// Pocetak nosaca aviona (od vrha ka dnu)
			while (velicina > 0) {				// Postavljanje broda (O oznacava dio broda)
				pozicije[red][kolona] = 'O';
				red++;
				velicina--;
			}
		}
		
		// VOJNI BROD
		velicina = 4;								// Velicina vojnog broda
		
		polozaj = (int)(Math.random() * 2);			// Odredjivanje polozaja vojnog broda
		if (polozaj == 0) {							// Horizontalni polozaj
			red = (int)(Math.random() * 10);		// Red vojnog broda
			kolona = (int)(Math.random() * 7);		// Povetak vojnog broda (sa lijeva na desno)
			
			// Vrtimo petlju dok god brod ne pronadje slobodno mjesto
			// Pozivamo metodu za provjeru mjesta po redu jer je horizantalan polozaj
			while(!provjeraMjestaZaRed(pozicije, red, kolona, velicina)) {
				red = (int)(Math.random() * 10);
				kolona = (int)(Math.random() * 7);
			}
			while (velicina > 0) {					// Postavljanje broda (O oznacava dio broda)
				pozicije[red][kolona] = 'O';
				kolona++;
				velicina--;
			}		
		} else {									// Vertikalan polozaj
			kolona = (int)(Math.random() * 10);		// Kolona vojnog broda
			red = (int)(Math.random() * 7);			// Pocetak vojnog broda (od vrha ka dnu)
			
			// Vrtimo petlju dok god brod ne pronadje slobodno mjesto
			// Pozivamo metodu za provjeru mjesta po koloni jer je vertikalan polozaj
			while(!provjeraMjestaZaKolonu(pozicije, red, kolona, velicina)) {
				kolona = (int)(Math.random() * 10);
				red = (int)(Math.random() * 7);
			}
			while (velicina > 0) {				// Postavljanje broda (O oznacava dio broda)
				pozicije[red][kolona] = 'O';
				red++;
				velicina--;
			}
		}
		
		/* POZICIJU SVIH PREOSTALIH BRODOVA DOBIJAMO NA ISTI NACIN KAO I ZA VOJNI BROD
		 * JEDINA RAZLIKA JE U VELICINI BRODA, A POSTUPAK JE ISTI PA SAM IZOSTAVIO KOMENTARE */
		
		// PODMORNICA
		velicina = 3;
		polozaj = (int)(Math.random() * 2);
		if (polozaj == 0) {
			red = (int)(Math.random() * 10);
			kolona = (int)(Math.random() * 8);
			while(!provjeraMjestaZaRed(pozicije, red, kolona, velicina)) {
				red = (int)(Math.random() * 10);
				kolona = (int)(Math.random() * 8);
			}
			while (velicina > 0) {				// Postavljanje broda (O oznacava dio broda)
				pozicije[red][kolona] = 'O';
				kolona++;
				velicina--;
			}
		} else {
			kolona = (int)(Math.random() * 10);	
			red = (int)(Math.random() * 8);	
			while(!provjeraMjestaZaKolonu(pozicije, red, kolona, velicina)) {
				kolona = (int)(Math.random() * 10);
				red = (int)(Math.random() * 8);
			}
			while (velicina > 0) {				// Postavljanje broda (O oznacava dio broda)
				pozicije[red][kolona] = 'O';
				red++;
				velicina--;
			}
		}
		
		// RAZARAC
		velicina = 3;		
		polozaj = (int)(Math.random() * 2);
		if (polozaj == 0) {
			red = (int)(Math.random() * 10);
			kolona = (int)(Math.random() * 8);
			while(!provjeraMjestaZaRed(pozicije, red, kolona, velicina)) {
				red = (int)(Math.random() * 10);
				kolona = (int)(Math.random() * 8);
			}
			while (velicina > 0) {				// Postavljanje broda (O oznacava dio broda)
				pozicije[red][kolona] = 'O';
				kolona++;
				velicina--;
			}
		} else {
			kolona = (int)(Math.random() * 10);	
			red = (int)(Math.random() * 8);	
			while(!provjeraMjestaZaKolonu(pozicije, red, kolona, velicina)) {
			kolona = (int)(Math.random() * 10);
				red = (int)(Math.random() * 8);
			}
			while (velicina > 0) {				// Postavljanje broda (O oznacava dio broda)
				pozicije[red][kolona] = 'O';
				red++;
				velicina--;
			}
		}
		
		// PATROLNI BROD
		velicina = 2;
		polozaj = (int)(Math.random() * 2);
		if (polozaj == 0) {
			red = (int)(Math.random() * 10);
			kolona = (int)(Math.random() * 9);
			while(!provjeraMjestaZaRed(pozicije, red, kolona, velicina)) {
				red = (int)(Math.random() * 10);
				kolona = (int)(Math.random() * 9);
			}
			while (velicina > 0) {				// Postavljanje broda (O oznacava dio broda)
				pozicije[red][kolona] = 'O';
				kolona++;
				velicina--;
			}
		} else {
			kolona = (int)(Math.random() * 10);	
			red = (int)(Math.random() * 9);	
			while(!provjeraMjestaZaKolonu(pozicije, red, kolona, velicina)) {
				kolona = (int)(Math.random() * 10);
				red = (int)(Math.random() * 9);
			}
			while (velicina > 0) {				// Postavljanje broda (O oznacava dio broda)
				pozicije[red][kolona] = 'O';
				red++;
				velicina--;
			}
		}
		
		
		return pozicije; 						// Vracamo listu sa pozicijama brodova
	}
	
	/* METODA ZA PROVJERU PO REDOVIMA
	 * Metoda koja provjerava moze li se brod nalaziti na posmatranom mjestu */
	public static boolean provjeraMjestaZaRed(char[][] pozicije, int red, int pocetnaKolona, int velicina) {
		while (velicina > 0) {
			if (pozicije[red][pocetnaKolona] == 'O')
				return false;	// Ako se na posmatranoj poziciji nalazi dio drugog broda onda je pozicija zauzeta
			
			pocetnaKolona++;	// Prelazak na sljedecu kolonu
			velicina--;			// Prelazimo na sljedeci dio broda (zamisljeno postavljanje u dijelovima :D )
		}
		return true;			// Ako citav brod moze stati vracamo true (ima mjesta)
	}
	
	/* METODA ZA PROVJERU PO KOLONAMA
	 * Metoda koja provjerava moze li se brod nalaziti na posmatranom mjestu */
	public static boolean provjeraMjestaZaKolonu(char[][] pozicije, int pocetniRed, int kolona, int velicina) {
		while (velicina > 0) {
			if (pozicije[pocetniRed][kolona] == 'O')
				return false;	// Ako se na posmatranoj poziciji nalazi dio drugog broda onda je pozicija zauzeta
			
			pocetniRed++;		// Prelazak na sljedeci red
			velicina--;			// Prelazimo na sljedeci dio broda
		}
		return true;			// Ako citav brod moze stati vracamo true (ima mjesta)
	}
	
	/* METODA KOJA PROVJERAVA DA LI JE IGRAC POBJEDIO */
	public static boolean pobjeda(char[][] pogadjanje) {
		int brojacPogodjenih = 0;					// Brojac
		for (int i = 0; i < pogadjanje.length; i++) {
			for (int j = 0; j < pogadjanje.length; j++) {
				if (pogadjanje[i][j] == 'O')
					brojacPogodjenih++;				// Za svaki pogodak povecavamo brojac
			}
		}
		if (brojacPogodjenih == 17)
			return true;	// Ako su pogodjeni svi brodovi (i svi njihovi dijelovi)
		else
			return false;	// Ako nisu pogodjeni svi brodovi (i svi njihovi dijelovi)
	}

	/* Metoda koju koristimo za odigravanje poteza */
	public static void odigravanjePoteza(char[][] pogadjanje, char[][] pozicicije) {
		System.out.print("Unesite red (0 - 9): ");
		int red = unos();	// Unos reda
		System.out.print("Unesite kolonu (0 - 9): ");
		int kolona = unos();	// Unos kolone
		
		// U slucaju da je polje odigrano, ponavljamo postupak dok ne pronadjemo slobodno polje
		while (pogadjanje[red][kolona] != ' ') {
			System.out.println("Polje vec odigrano. Pokusajte ponovo.");
			System.out.print("Unesite red (0 - 9): ");
			red = unos();
			System.out.print("Unesite kolonu (0 - 9): ");
			kolona = unos();
		}
		
		if (pozicicije[red][kolona] == 'O')
			pogadjanje[red][kolona] = 'O';	// Ukoliko je pogodjen brod oznacavamo sa O
		else
			pogadjanje[red][kolona] = 'X';	// Ukoliko je brod promasan oznacavamo sa X
		
	}

	/* Metoda pomocu koje unosimo red ili kolonu */
	public static int unos() {		
		java.util.Scanner input = new java.util.Scanner(System.in);	// Scanner
	
		while(true) {								// "Vrtimo" petlju dok ne unesemo trazeni broj
			try{
				int number = input.nextInt();		// Unos broja
				
				if (number < 0 || number > 9)		// Dodatni uslov
					throw new InputMismatchException();
				
				return number;						// Vracamo broj
				
			} catch(InputMismatchException ex) {	// Hvatanje izuzetaka
				System.out.print("Greska! Pogresan unos. Pokusaj ponovo: ");
				input.nextLine();
			}
		}
		
	
	}

}
