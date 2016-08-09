package zadaci_09_08_2016;

/* Napišite program koji ispisuje sve brojeve, od 100 do 1000, 10 brojeva po liniji, koji su djeljivi i sa 5 i sa 6. 
 * Razmak između brojeva treba biti tačno jedan space. */

public class Zad3_djeljiv_sa_5x6 {
	//metoda za djeljivost broja sa 6
	public static boolean is6 (int num){
		
		if(num%6==0){
			return true;
		}else{
			return false;
		}
		
	}
	//metoda za djeljivost broja sa 5
	public static boolean is5 (int num){
		
		if(num%5==0){
			return true;
		}else{
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Brojevi od 100 do 1000 djeljivi i sa 5 i sa 6 su:");
		
		int brojac=0;
		//provjera brojeva koju su djeljivi i sa 5 i sa 6 i njihov ispis 10 po redu
		for(int i=100; i<=1000; i++){
			if (is6(i) && (is5(i))){
				System.out.print(i+ " ");
				brojac++;
				
				if(brojac%10==0){
					System.out.println();
				}
			}
		}
		
		
	}

}
