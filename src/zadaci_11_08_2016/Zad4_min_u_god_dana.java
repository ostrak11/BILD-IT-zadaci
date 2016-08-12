package zadaci_11_08_2016;

import java.util.Scanner;

/* Napisati program koji pita korisnika da unese broj minuta (npr. 1 milijardu) te ispiše korisniku koliko je to u godinama i danima. 
 * Zbog jednostavnosti, pretpostavimo da godina ima 365 dana.  */

public class Zad4_min_u_god_dana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos= new Scanner(System.in);
		boolean prekid=true;
		int min=0;
		
		//uslov za petlju da unos bude uredu
		while(prekid){
			System.out.println("Unesite broj minuta: ");
			try {
				min= unos.nextInt();
				//testiramo uslov da li je manj od nule ako jeste onda da postavi pitanje i pokusa ponovo
				if (min <= 0) {
					System.out.print("Pogresan unos!!! Pokusajte sa pozitivnim cijelim brojem");
					unos.nextLine();
				} else{
					//ako je unos dobar onda da izađe iz petlje
					prekid=false;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Pogresan unos!!! Pokusajte sa pozitivnim cijelim brojem");
				unos.nextLine();
			}
		}
		//ispis rezultata
		System.out.println("Broj minuta od "+ min+ ": " 
							//određuje broj godina
							+(min/(60*24*365))+" godina "+ 
							//ispisuje broj preostalih dana u godini
							(((min%(60*24*365))))/1440+" dana. ") ;
	
	}

}
