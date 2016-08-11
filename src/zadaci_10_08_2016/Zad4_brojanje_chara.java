package zadaci_10_08_2016;

import java.util.Scanner;

/*Napisati metodu koja pronalazi broj ponavljanja određenog karaktera u stringu. 
 * Metoda treba da koristi sljedeći header: public static int count(String str, char a). 
 * Na primjer, ukoliko pozovemo metodu na sljedeći način: count("Welcome", e) metoda treba da vrati 2. 
 * Napisati program koji pita korisnika da unese string i koji karakter želi da prebroji u datom stringu
 *  te mu ispiše koliko se puta određeni karakter ponovio u zadatom stringu.
*/

public class Zad4_brojanje_chara {
	
	//metoda za brojanje slova
	public static int count(String str, char a){
		
		//prbacimo sva slova u mala
		str=str.toLowerCase();
		int brojac=0;
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)== a){
				brojac++;
			}
		}
		return brojac;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos= new Scanner(System.in);
		//unos stringa i karaktera
		System.out.println("Unesite string:");
		String s=unos.nextLine();
		System.out.println("Unesite slovo koje zelite prebrojati");
		String a= unos.next();
		
		//ako je kao slovo unesen string...uzeti ce samo prvo slovo stringa i prebrojati ga uz ispis
		if (Character.isLetter(a.charAt(0))){
			System.out.print("Vas string '"+ s+"' sadrzi karakter '"+ a.charAt(0) +"' "+ count(s,a.charAt(0))+ " puta.");
		}else{
			System.out.println("Pogresan unos. Mora biti slovo!!!");
			System.exit(0);
		}
		
		unos.close();
	}

}
