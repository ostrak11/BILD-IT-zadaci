package Zadaci_13_08_2016;

/* Palindrome prime je prosti broj koji je također i palindrom. Na primjer, 131 je palindrome prime, kao i brojevi 313 i 757. 
 * Napisati program koji ispisuje prvih 100 palindrome prime brojeva, 10 brojeva po liniji.*/

public class Zad4_prime_plaindrom {
	
	//metoda za prost broj
	public static boolean isProst(int broj){
		if(broj>0){
			for(int i=2; i<broj; i++){
				if(broj%i==0){
				return false;
				}
			}
			return true;
		}
		return false;
		
	}
	
	//metoda za naopak ispis
	public static int reverse(int n){
		
		int reverse = 0;
		
		//obrnut broj  	 
	    while( n != 0 ){
	    	reverse = reverse * 10;
	        reverse = reverse + n%10;
	        n = n/10;
	    }
	 
	    return reverse;
		
	}
	
	//metoda za palindrim
	public static boolean isPalindrome(int number){
		
		//provjera da li je broj palindrom tj uslov da je broj jednak svom obrnutom broju 
		if (number==reverse(number)){
			return true;
		}else {
			return false;
		}
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int brojac=0;
		int i=2;
		
		//prolaz kroz brojac i provjera uslova tj da li je broj prosti palindrom
		do{
			if((isProst(i))&&(isPalindrome(i))){
				//povecava brojac za svaki broj koji ispunjava uslov
				brojac++;
				
				System.out.print(i+" ");
				//prelazak u novi red 
				if(brojac%10==0){
					System.out.println();
				}
							
			}
			i++;
			//prekid petlje kad je brojac 100
		}while(brojac<100);
		
		
	}

}
