package zadaci_04_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/* ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva: d1 d2 d3 d4 d5 d6 d7 d8 d9 d10.
 *  Posljednji broj, d10, služi kao checksum i njega izračunavamo iz prvih devet brojeva koristeći se sljedećom formulom: 
 *  (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11. Ukoliko je checksum 10, 
 *  zadnji broj označavamo sa X u skladu sa ISBN-10 konvencijom. Napisati program koji pita korisnika da unese prvih 
 *  9 brojeva te ispiše desetocifreni ISBN-10 broj. (Primjer: ukoliko unesemo, kao prvih 9 brojeva, 
 *  013601267 program nam ispisuje 0136012671 kao ISBN-10 broj. Ukoliko unesemo 013031997 kao prvih 9 brojeva, 
 * program nam ispisuje 013031997X kao ISBN-10 broj)*/

public class Zad2_ISBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//skener za unos ISBN broja
		Scanner unos= new Scanner(System.in);		
		System.out.println("Molimo Vas unesite Vas ISBN broj: ");
		
		
		int suma=0;
		//unos brojeva kao string i onda pretvaranje u cijele brojeve
		try {
			String	num = unos.next();
			if (num.length()!=9){
				System.err.println("Pogresan unos!!!");
				System.exit(0);
			}else{
			
				for (int i=0; i< num.length();i++){
					suma+=(i+1)*(Integer.parseInt(num.substring(i, i+1)));
				}
			
									
				//racunanje 10og broja i ispis
				if(suma%11==10){
					System.out.print("Vas ISBN broj je " + num+"X");
				}else{
					System.out.print("Vas ISBN broj je " +num+""+(suma%11));
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Pogresan unos!!!");
			System.exit(0);
		}finally{
			
			unos.close();
	
		}
		
		
	}

}
