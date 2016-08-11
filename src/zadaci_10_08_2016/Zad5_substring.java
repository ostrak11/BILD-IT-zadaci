package zadaci_10_08_2016;

import java.util.Scanner;

/* Napisati program koji pita korisnika da unese dva stringa te provjerava i ispisuje da li je drugi string substring prvog stringa. 
 * Na primjer, ukoliko korisnik unese ABCD kao prvi string a BC kao drugi string program mu ispisuje da je BC substring ABCD stringa.*/

public class Zad5_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//unos stringova i pretvaranja u mala slova
		Scanner unos= new Scanner(System.in);
		
		System.out.println("Unesite string:");
		String s=unos.nextLine();
		
		s=s.toLowerCase();
		
		System.out.println("Unesite string:");
		String d=unos.nextLine();
		
		d=d.toLowerCase();
		
		
		//ispitujemo uslov da li prvi string sadrzi drugi string
		if (s.contains(d)){
			System.out.println("String '"+ d+ "' je sadrzan u stringu '"+s+"'." );
		}else{
			System.out.println("String '"+ d+ "' nije sadrzan u stringu '"+s+"'." );
		}
		
			
	}

}
