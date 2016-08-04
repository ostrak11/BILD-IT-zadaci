package zadaci_03_08_2016;
import java.util.*;

/*Implementirati sljedeću metodu da sortira redove u 2D nizu.
public static double[ ][ ] sortRows(double[ ][ ] array)
Napisati testni program koji pita korisnika da unese 3x3 matricu 
(ili da pita korisnika koliku matricu želi unijeti) 
te mu ispisuje na konzoli matricu sa sortiranim redovima - od najmanjeg broja do najvećeg.*/


public class Zad5_sort_2Dniz {
	public static double[ ][ ] sortRows(double[ ][ ] array){
	//	double [ ][ ] matrix= new double[array.length ][array[ 0].length ];
		
		for (int i=0; i<array.length;i++){
			Arrays.sort(array[i]);
		}
		
		for(int i =0;i<array.length;i++){
			for (int j=0; j<array[0].length;j++){
			//	matrix[ i][j ]=array[ i][j ];
				System.out.print(array[i][ j]+ " ");
			}
			System.out.println();
		}
		
		return array;
		
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

						
		//pozivanje metode
		sortRows(max);
	}

}
