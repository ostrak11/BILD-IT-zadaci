package zadaci_03_08_2016;
import java.util.InputMismatchException;
import java.util.Scanner;


/*Nizovi niz1 i niz2 su striktno identični ukoliko su svi njihovi elementi na istim pozicijama jednaki. 
 * Napisati metodu koja vraća true ukoliko su nizovi niz1 i niz2 striktno identični. Koristiti sljedeći header:
public static boolean equals(int[ ] niz1, int[ ] niz2)
Napisati testni program koji pita korisnika da unese dva niza cijelih brojeva te provjerava da li su striktno identični.*/

public class Zad3_identicni_nizovi {
	
	public static boolean equals(int[ ] array1, int[ ] array2){
	//provjera uslova da li su nizovi iste duzine i imaju li iste elemente da istim mjestima
		if (array1.length != array2.length){
			return false;
		}else{		
			for (int i =0; i<array1.length;i++){
				if (array1[i]!=array2[i]){
					return false;
				}
			}
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//definisao skener
		Scanner input = new Scanner(System.in);
		
		int m=0,n=0;
		
		// unos duzina nizova uz provjeru tacnosti unosa
		System.out.print("Please enter array1 lenght: ");
		try {
			m=input.nextInt();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Entry is not OK!!!");
			System.exit(0);
		}
		
		System.out.print("Please enter array2 lenght: ");
		try {
			n=input.nextInt();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Entry is not OK!!!");
			System.exit(0);
		}
		
		//provjera uslova duzine niza
		if (m!=n){
			System.out.println("Array are not identical!!!");
			System.exit(0);
		}
		//napravio niz 
		int[] array1 = new int[m];
		int[] array2 = new int[n];
		
		System.out.print("Please enter the "+m+ " numbers in the array1: ");
		
		//unos elemenata u niz
		try {
			for (int i =0; i< m; i++){
				array1[i] = input.nextInt();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Entry is not OK!!!");
			System.exit(0);
		}
		
		System.out.print("Please enter the "+n+" numbers in the array2: ");
		try {
			for (int i =0; i< n; i++){
				array2[i] = input.nextInt();
			}
		} catch (Exception e) {
			System.out.println("Entry is not OK!!!");
			System.exit(0);
		}
		
		//pozivanje metode
		System.out.println("Two arrays are equal? " + equals(array1,array2)+ ".");
		
		input.close();
	}

}
