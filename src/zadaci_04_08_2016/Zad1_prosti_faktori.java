package zadaci_04_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese neki cijeli broj te ispisuje njegove najmanje faktore
 *  u rastućem redosljedu. Na primjer, ukoliko korisnik unese 120 program treba da ispiše 2, 2, 2, 3, 5. (2 * 2 * 2 * 3 * 5 = 120)*/


public class Zad1_prosti_faktori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		boolean isGood = true;
	
		while (isGood) {
			isGood = false;
			try {
				System.out.println("Enter the number :");
				int num = unos.nextInt();
				
				int i = 2;
				//prolazak kroz petlju i dijeljenje sa najmanjim djeliocem uz printanje istog
				while (num != 1) {
					if (num % i == 0) {
						System.out.print(i + " ");
					
						num = num / i;
					} else {
						// povecanje brojava za 1
						i++;
					}
				}
			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter an integer ");
				isGood = true;
			}
			// zatvaranje resursa
			finally {
				unos.close();
				
			}
		}
	
	}

}
