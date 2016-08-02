package zadaci_02_08_2016;

/* Napisati program koji ispisuje sve prestupne godine, 10 po liniji, od godine 101 do 2100, odvojene jednim spaceom. 
 * Također ispisati i ukupan broj prijestupnih godina u ovom vremenskom periodu.*/

public class Zad1_prestupne_godine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//deklarisanje i inicijaliziranje brojaca prestupnih godina
		int brojac=0;
		
		//
		for (int i=101; i<=2100;i++){
			
			//uslov za prestupnu godinu
			if (((i%4==0) && (i/100 !=0)) || (i%400==0 )){
				System.out.print(i + " "); 
				brojac++;
			
				//uslov za ispis 10 godina po redu
			if (brojac%10==0){
				System.out.println(" ");
			}
			}
		}
		
		//ispis ukupnog broja prestupnih godina
		System.out.println("Ukupan broj prestupnih godina u vremenskom razdoblju je " + brojac);	
	}

}
