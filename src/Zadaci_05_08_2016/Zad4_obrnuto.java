package Zadaci_05_08_2016;
import java.util.Scanner;

/*Napisati program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom redosljedu. */

public class Zad4_obrnuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		
		int[] niz = new int[10];
		
		System.out.println("Unesite 10 cijelih brojeva, nakon svakog unosa pritisnite tipku 'ENTER' ");
			try {
				//unos elemenata u niz
				for(int i=0;i<niz.length;i++){
				niz[i]=unos.nextInt();
				}
			} catch (Exception e) {
				System.err.print("Pogresan unos");
				System.exit(0);
				
			}finally{
				unos.close();
			}
		
			//ispis obrnutog redoslijeda
		System.out.println("Ispis obrnutog redoslijeda unesenih brojeva");
		for (int i=niz.length-1;i>=0;i--){
			System.out.print(niz[i] + " ");
		}
		
	}

}
