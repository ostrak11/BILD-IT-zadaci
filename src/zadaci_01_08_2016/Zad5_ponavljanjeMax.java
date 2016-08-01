package zadaci_01_08_2016;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * Napisati program koji učitava niz brojeva, pronalazi najveći broj te ispisuje koliko se puta taj broj ponavlja.
 *  Pretpostavimo da se unos brojeva završava sa nulom.*/

public class Zad5_ponavljanjeMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//definisanje skanera
		Scanner unos= new Scanner(System.in);
		System.out.println("Unesite elemente niza, gdje cete nakon svakog unosa pritisnuti tipku 'ENTER', imajte u vidu da nula'0' prekida niz ");
		
		//deklarisanje i inicijalizacija početnog najvećeg borja i brojaca
		int broj =1;
		int max=1;
		int brojac=0;
		
		
		do{
			 
			//unos elemenata niza
			
			try {
				broj= unos.nextInt();
			} catch (InputMismatchException  e) {
				System.err.println("Nemozete unijet slovo!");
				System.exit(0);
			}
			 
			//testiranje najvećeg broja i dodijeljivanje vriojednosti
			 if (broj>max){
				 max=broj;
				 brojac=1;
				 
			//brojanje ponavljanja najveceg elementa	 
			 }else if (max==broj){
				 brojac++;
			 }
		//uslov za unosenje elemenata niza	 
		}while (broj!=0);

		//ispis poruke
		System.out.println("Najveci element unesenog niza je " + max + " i ponavlja se " + brojac + " puta.");
		
		
		
	}

}
