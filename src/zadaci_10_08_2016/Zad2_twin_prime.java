package zadaci_10_08_2016;

/* Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. Na primjer, brojevi 3 i 5 su twin primes, 
 * brojevi 5 i 7 i 11 i 13 su također twin primes. Napisati program koji ispisuje sve twin prime brojeve manje od 10000, 10 parova po liniji.
 * */

public class Zad2_twin_prime {
	
	//metoda za određivanje da li je broj prost
	public static boolean isProst(int broj){
		
		for(int i=2; i<broj; i++){
			if(broj%i==0){
				return false;
			}
		}
		
		return true;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int brojac=0;
		
		//testiranje uslova i ispis parova koji us twin prime po 10 u linije tj 5 parova
		for(int i=2; i<10000; i++){
			if ((isProst(i))&&(isProst(i+2))){
				System.out.print(i +","+ (i+2)+" ;  ");
				brojac++;
				if (brojac%5==0){
					System.out.println();
				}
			}
		}
	
	
	
	}
	

}
