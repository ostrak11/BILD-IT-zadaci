package zadaci_12_08_2016;
import java.util.InputMismatchException;
import java.util.Scanner;

/* Napisati program koji pita korisnika da unese dva cijela, pozitivna broja te ispisuje najveći i najmanji zajednički djelilac za ta dva broja.*/

public class Zad2_djelilac_min_max {
	
	static Scanner unos = new Scanner(System.in);
	
	//metoda za provjeru tacnosti unosa(tip podataka)
	public static int provjera() {
		
		int broj = 0;	
		boolean provjera = true;	
		do {
			//ucitavanje unosa i provjera da li je int
			try {
				broj = unos.nextInt();	
				//ako je sve ok, vrati broj	
				provjera = false;									
			}
			//hvata greska i trazi ponovni unos
			catch (InputMismatchException ex) {	
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				unos.nextLine();
			}
		} while (provjera);
		
		return broj;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//unos brojeva
		System.out.println("Unesite prvi cijeli broj: ");
		int broj1 = provjera();
		
		System.out.println("Unesite drugi cijeli broj: ");
		int broj2 = provjera();
		
		int min = 1;
		int max = 1;
		int temp;
		
		//usteda resursa...u slucaju da je prvi broj veci od drugog da nam brojac ide do najmanjeg broja
		if (broj1>broj2){
			temp= broj1;
			broj1=broj2;
			broj2=temp;
		}
		
		
		for ( int i =2; i <= broj1; i++){
			//uslov da su oba broja djeljivi sa istim brojem
			if ((broj1 % i ==0) && (broj2 % i == 0)){
				//kad nađe prvi broj koji je ispunio uslov da ga sacuva
				if (min ==1){ 
					min=i;    
				}
				//najveci broj koji ispunjava uslov
				max=i;
			}
		}
	
		//ispis rezultata
		System.out.println("Najmanji zajednički djelilac brojeva " + broj1 + " i " + broj2 + " je: " + min);
		System.out.println("Najveci zajednički djelilac brojeva " + broj1 + " i " + broj2 + " je: " + max);
	
		unos.close();
		
	}

}
