package zadaci_15_08_2016;

/*Napisati program koji sabira sljedeću seriju 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99.*/

public class Zad3_sabiranje_razlomka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double suma=0;
		
		//idemo brojacem do 97 i to svaki drugi broj uzimamo u obzir
		for(double i=1; i<98; i+=2){
			//izracunavamo sumu
			suma+=(i/(i+2));
		}
		//ispis rezultata		
		System.out.println("Zbir serije je: "+ suma);
		
	}

}
