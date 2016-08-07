package zadaci_06_08_2016;

import java.util.Scanner;
import java.util.InputMismatchException;

/* Napisati metode sa sljedećim headerima: public static int reverse(int number) i public static boolean isPalindrome(int number). 
 * Prva metoda prima cijeli broj kao argument i vraća isti ispisan naopako. (npr. reverse(456) vraća 654.) 
 * Druga metoda vraća true ukoliko je broj palindrom a false ukoliko nije. Koristite reverse metodu da implementirate isPalindrome metodu. 
 * Napišite program koji pita korisnika da unese broj te mu vrati da li je broj palindrome ili ne. */

public class Zad3_palindrom {
	
	public static int reverse(int n){
		
		int reverse = 0;
		
		//obrnut broj  	 
	    while( n != 0 ){
	    	reverse = reverse * 10;
	        reverse = reverse + n%10;
	        n = n/10;
	    }
	 
	    return reverse;
		
	}
	
	public static boolean isPalindrome(int number){
		
		//provjera da li je broj palindrom tj uslov da je broj jednak svom obrnutom broju 
		if (number==reverse(number)){
			return true;
		}else {
			return false;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		System.out.println("Molimo Vas unesite neki broj: ");
		
		int s=0;
		//unos broja
		try {
			s = unos.nextInt();
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.err.println("Pogresan unos!!!");
			System.exit(0);
		}
		
				
		//provjer da li je broj palindrom i ispis rezultata
		if (isPalindrome(s) == true){
			System.out.println("Uneseni broj je palindrom!!!");
		}else{
			System.out.println("Uneseni broj nije palindom!!!");
		}
		
		unos.close();
		
		
	}

}
