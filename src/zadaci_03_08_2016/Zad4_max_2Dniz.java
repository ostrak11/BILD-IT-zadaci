package zadaci_03_08_2016;
import java.util.Scanner;

/* Napisati metodu koja vraća lokaciju najvećeg elementa u 2D nizu. Metoda treba da koristi sljedeći header:
public static int[ ] locateLargest(double[ ][ ] a)
Napisati test program koji pita korisnika da unese 2D niz te mu ispisuje lokaciju najvećeg elementa u nizu.*/


public class Zad4_max_2Dniz {
	
	public static int[] locateLargest(double[ ][ ] a){
		
		double max= a[0][0];
		int index[]={0,0};
		
		//trazenje max elementa u matrici i nalazak njegovog index
		for (int i=0; i<a.length; i++){
			for (int j=0; j<a[0].length; j++){
				if(max<a[i][j]){
					max=a[i][j];
					index[0]=i;
					index[1]=j;
				}
			}
		}
		
		return index;
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos= new Scanner(System.in);
		
		//unos broja redova i kolona u matrici
		System.out.print("Please enter number od rows an columns in 2D matrix:" );
		int row=0;
		int col=0;
		
		try {
			row = unos.nextInt();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Entry is not OK!!!");
			System.exit(0);
		}
		try {
			col = unos.nextInt();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Entry is not OK!!!");
			System.exit(0);
		} 
		
		double [][] max = new double[row][col];
		
		//unos elemenata u matricu
		System.out.print("Please enter elements in 2D matrix " + row+"x"+col+":" );
		for (int r=0; r<max.length;r++){
			for (int j=0; j<max[0].length; j++){
				try {
					max[r][j]= unos.nextDouble();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println("Entry is not OK!!!");
					System.exit(0);
				}
			}
		}

		// pozivanje metode
		System.out.print("Largest element in matrix has index: "); 
		for (int e :locateLargest(max)){
			System.out.print(e+ " ");
		}
		
		
	}

}
