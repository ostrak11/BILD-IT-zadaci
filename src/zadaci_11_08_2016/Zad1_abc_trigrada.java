package zadaci_11_08_2016;
import java.util.Arrays;
import java.util.Scanner;

/*Napisati program koji pita korisnika da unese imena tri grada te ih ispiše u abecednom redu. 
 * Na primjer, ukoliko korisnik unese Chicago, Los Angeles i Atlanta kao gradove, program vraća Atlanta, Chicago, Los Angeles.
*/

public class Zad1_abc_trigrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos= new Scanner(System.in);
		String[] grad= new String[3];
		
		//unos gradova kroz petlju i smijestanje u niz
		for(int i=0; i<grad.length;i++){
			System.out.println("Unesite ime grada(nakon unosa pritisnite tipku 'ENTER'): ");
			grad[i]=unos.nextLine();
		}
		
		//poziv metode za sortiranje elemenata niza
		Arrays.sort(grad);
		
		//ispis rezultata
		for(String e:grad){
			System.out.print(e+" ");
		}
		
		unos.close();
	}

}
