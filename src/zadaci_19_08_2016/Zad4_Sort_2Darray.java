package zadaci_19_08_2016;

/* (Sort two-dimensional array) Write a method to sort a two-dimensional array using the following header:
public static void sort(int m[][])
  The method performs a primary sort on rows and a secondary sort on columns. */

public class Zad4_Sort_2Darray {
	
	public static void sort(int m[][]){
	
			// sortiranje redova
			for (int i = 0; i < m.length-1; i++) {
				for (int j = 0; j < m.length-i-1; j++) {
					// ako je suma reda veca od onog slijedeceg zamjene mjesta
					if (sum(m[j]) > sum(m[j + 1])) {
						int[] tmp = m[j];
						m[j] = m[j + 1];
						m[j + 1] = tmp;
						
					}
				}
			}
			for (int i = 0; i < m.length-1; i++) {
				for (int j = 0; j < m.length-i-1; j++) {
					// ako je kolona veca od slijedece zamjene mjesta
					if (m[j][0] > m[j + 1][0]) {
						int[] tmp = m[j];
						m[j] = m[j + 1];
						m[j + 1] = tmp;
						
					}
				}
			}
		
	}
	
	//izracunavanje sume niza
	public static int sum(int[] m) {
		int sum = 0;
		for (int i : m) {
			sum += i;
		}
		return sum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] list = new int[][]{
				{4, 2},
				{1, 7},
				{4, 5},
				{1, 2},
				{1, 1},
				{4, 1}
			};
		
		// sortiranje i printanje matrice
		sort(list);
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[0].length; j++) {
				System.out.print(list[i][j] + " ");
			}
			System.out.println();
		}
	}

}
