package zadaci_19_08_2016;

import java.util.Arrays;

/* (Compute the weekly hours for each employee) Suppose the weekly hours for all employees are stored in a two-dimensional array. 
 * Each row records an employee’s seven-day work hours with seven columns. For example, the following array stores the work hours 
 * for eight employees. Write a program that displays employees and their total hours in decreasing order of the total hours*/

public class Zad1_weekly_hours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// matica sa radnim ucincima
		int[][] hours = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 },
				{ 3, 3, 4, 3, 3, 2, 2 }, { 9, 3, 4, 7, 3, 4, 1 },
				{ 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 },
				{ 3, 7, 4, 8, 3, 8, 4 }, { 6, 3, 5, 9, 2, 7, 9 }, };

		// tri niza ...jedan je za smjestaj sume redova, ciji indexi
		// predstavljaju radnike
		// drugi niz sa sumama redova koristimo za sortiranje
		// treci je kontrolni niz koji nam koristi za ispis on je prazan
		int[] suma = new int[hours.length];
		int[] sumaKontrolna = new int[hours.length];
		int[] sumaPomocna = new int[hours.length];

		// izračunavanje suma redova i kopiranje u Kontrolni niz
		for (int i = 0; i < hours.length; i++) {
			for (int j = 0; j < hours[0].length; j++) {
				suma[i] += hours[i][j];
				sumaKontrolna[i] = suma[i];
			}
		}

		/*
		 * for(int e:suma){ 
		 * 		System.out.print(e + " "); 
		 * }
		 */
		
		// sortiranje kontrolnog niza
		Arrays.sort(sumaKontrolna);

	

		// prolazak kroz nizove stim da prolazimo kroz sortirani niz od najveceg
		// elementa ka najmanjem
		for (int i = sumaKontrolna.length - 1; i >= 0; i--) {
			for (int j = 0; j < suma.length; j++) {
				// kada uzme prvi elemenat iz sortiranog niza, trazi ga u niz
				// suma i ispisuje njegov index(koji predstavlja radnika) i daje
				// vrijednos 1 u pomocnom nizu
				if (sumaKontrolna[i] == suma[j] && sumaPomocna[j] == 0) {
					System.out.println("Radnik " + j + " ima ukupno sati "
							+ sumaKontrolna[i]);
					sumaPomocna[j] = 1;
				}
			}

		}
	}

}
