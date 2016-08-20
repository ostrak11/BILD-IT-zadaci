package zadaci_19_08_2016;

/* Write a program that randomly fills in 0s and 1s into a 4-by-4 matrix, prints the matrix, and finds the first row and column with the most 1s*/

public class Zad3_Largest_row_column {
	// metoda koja vraca index najveceg elementa u nizu
	public static int indexMax(int[] a) {
		int max = 0;
		int index = 0;

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
				index = i;
			}
		}

		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// tri niza jedan za generisane elemente druga dva za sumu kolona i
		// redova
		int[][] matrix = new int[4][4];
		int[] sumaRed = new int[matrix.length];
		int[] sumaKolona = new int[matrix[0].length];

		// generisanje brojeva i izracunavanje sume redova
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
				sumaRed[i] += matrix[i][j];
			}
		}

		// izračunavanje sume kolona
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				sumaKolona[i] += matrix[j][i];
			}
		}

		/*
		 * for(int i=0; i<matrix.length;i++){ 
		 * 		for(int j=0; j<matrix[0].length;j++){
		 * 			System.out.print(matrix[i][j]); 
		 * 		} System.out.println(); 
		 * }
		 *  
		 * for(int e:sumaRed){ 
		 * 		System.out.print(e + " "); 
		 * }
		 * 
		 * for(int e:sumaKolona){ 
		 * 		System.out.print(e +" "); 
		 * }
		 */

		// ispis rezultata pozivanjem metode, da ne bi bunilo korisnike dodao
		// sam na index najvece kolone +1, tako da pocetni red bude 1
		
		System.out.println("Red sa najviše jedinica je: "
				+ (1 + indexMax(sumaRed)));
		System.out.println("Kolona sa najviše jedinica je: "
				+ (1 + indexMax(sumaKolona)));
	}

}
