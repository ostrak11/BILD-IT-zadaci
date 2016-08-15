package zadaci_15_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Napisati program koji igra sa protivnikom rock-paper-scissors. (papir-bunar-makaze ili tako nekako po naški) 
 * Program nasumično generiše brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze. Program pita korisnika 
 * da unese 0, 1 ili 2 te mu ispisuje poruku da li je korisnik pobijedio, da li je računar pobijedio ili je bilo neriješeno.*/

public class Zad2_papir_makaze_bunar {

	static Scanner unos= new Scanner(System.in);
	
	public static int provjera() {
		
		int broj = 0;	
		boolean provjera = true;	
		do {
			//ucitavanje unosa i provjera da li je int
			try {
				broj = unos.nextInt();	
				//uslov je da broj mora biti 0,1 ili 2
				if((broj==0)||(broj==1)||(broj==2)){
					provjera = false;									
				}else{
					System.out.println("Pogresan unos. Pokusajte ponovo sa 0,1 ili 2: ");
				}
			}
			//hvata greska i trazi ponovni unos
			catch (InputMismatchException ex) {	
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				unos.nextLine();
			}
		} while (provjera);
		
		return broj;
	}
	
		
	public static void rezultat(int gen, int broj){
		if (gen == broj){
			System.out.println( "Neriješeno !!!");
		}
		
		//slucajevi
		switch(broj){
		case 0:
			if (gen==1){System.err.println("Izgubili ste!!!");
			}else if(gen==2){System.err.println("Pobijedili ste!!!");};
			break;
		case 1:
			if (gen==2){System.err.println("Izgubili ste!!!");
			}else if(gen==0){System.err.println("Pobijedili ste!!!");};
		break;
		case 2:
			if (gen==0){System.err.println("Izgubili ste!!!");
			}else if(gen==1){System.err.println("Pobijedili ste!!!");};
			break;
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generisanje i unos brojeva
		String[] izbor={"Kamen", "Papir", "Makaze"};
		int gen=(int)(Math.random()*3);
		
		System.out.println("Unesite broj, [0]-Kamen, [1]-Papir, [2]- Makaze:");
		int broj=provjera();
		
		//pozivanje metode i ispis rezultata
		System.out.println("Izabrali ste "+ izbor[broj] + ", racunar je birao "+izbor[gen]+".");
		rezultat(gen,broj);
		
		unos.close();
	}

}
