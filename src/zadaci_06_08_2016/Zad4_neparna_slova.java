package zadaci_06_08_2016;

import java.util.Scanner;

/*Napisati program koji pita korisnika da unese neki string te mu ispisuje sve karaktere koji se nalaze na neparnim pozicijama. 
 * Na primjer, ako korisnik unese string Beijing Chicago, program vraća BiigCiao.*/

public class Zad4_neparna_slova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner unos = new Scanner(System.in);
		
		//unos stringa
		System.out.println("Molimo Vas unesite neki string: ");
		String s= unos.nextLine();
		
		//ispis neparnih karaktera
		for (int i=0; i<s.length();i++){
			if (i%2==0){
				System.out.print(s.charAt(i));
			}
		}
		
		unos.close();
	}

}
