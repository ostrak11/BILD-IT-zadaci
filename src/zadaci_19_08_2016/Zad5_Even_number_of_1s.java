package zadaci_19_08_2016;

/* Write a program that generates a 6-by-6 two-dimensional matrix filled with 0s and 1s, 
 * displays the matrix, and checks if every row and every column have an even number of 1s*/

public class Zad5_Even_number_of_1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]matrix= new int[6][6];
		
		for(int i=0; i<matrix.length;i++){
			for(int j=0; j<matrix[0].length; j++){
				matrix[i][j]= (int)(Math.random()*2);
				
			}
		}
		
		printMatrix(matrix);
		
		System.out.println("Svaki red ima paran broj 1s?? " +(isRedovi(matrix)));
		System.out.println("Svaka kolona iam paran broj 1s?? "+(isKolona(matrix)));
		
	}

	public static void printMatrix(int[][] m){
		//printanje matrice
		for(int i=0; i<m.length;i++){
			for(int j=0; j<m[0].length;j++){
				System.out.print(m[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
	
	public static boolean isRedovi(int[][] m) {
		int brojac = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1)
					brojac++;
			}
			if (brojac % 2 != 0)
				return false;
		}
		return true;
	}
	
	public static boolean isKolona(int[][] m) {
		int brojac = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[j][i] == 1)
					brojac++;
			}
			if (brojac % 2 != 0)
				return false;
		}
		return true;
}
}
