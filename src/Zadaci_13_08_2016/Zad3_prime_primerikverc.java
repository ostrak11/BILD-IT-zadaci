package Zadaci_13_08_2016;

/* Emirp brojevi (prime unazad) je nepalindromski prosti broj koji je prosti broj i kada ispišemo naopako. 
 * Na primjer, broj 17 i broj 71 su prosti brojevi tako da su brojevi i 17 i 71 emirp brojevi. 
 * Napisati program koji ispisuje prvih 100 emirp brojeva, 10 brojeva po liniji. */

public class Zad3_prime_primerikverc {
	
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
	
	//metoda za  ispis broja naopako
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
	
	public static boolean isPalindrome(int broj){
		if(broj==reverse(broj)){
			return true;
		}
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int brojac=0;
		int i=1;
		
		do{
			//provjeravamo da li je broj prost i da li je njegov obrnuti broj prost
			if(((isProst(i))&&(isProst(reverse(i))&&(!isPalindrome(i))))){
				//brojac za ispis u nobi red
				brojac++;
				System.out.print(i + " " + reverse(i)+" ");
				//ipis u novi red
				if(brojac%5==0){
					System.out.println();	
				}
			}
			//povecava i za jedan, sve dok brojac nebude 50
			i++;
		}while(brojac<50);
		
	}

}
