package zadaci_11_08_2016;

/*.  Napisati program koji ispisuje sve proste brojeve od 2 do 1000, ukljućujući i 2 i 1000. 
 * Program treba da ispiše 8 brojeva po liniji te razmak između brojeva treba da bude jedan space.*/


public class Zad2_prost_broj {
	
	//metoda za ispitivanje da li je broj prost
	public static boolean isProst(int num){
					
		for(int i=2; i<num; i++){
			if(num%i==0){
				return false;
			}
		}
			
		return true;
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int brojac=0;
		
		//pozivanje metode i ispis rezultata od 8 po redu
		for (int i=2;i<=1000;i++){
			if (isProst(i)){
				System.out.print((i)+ " ");
				brojac++;
				if(brojac%8==0){
					System.out.println();
				}
			}
		}
		
		
	}

}
