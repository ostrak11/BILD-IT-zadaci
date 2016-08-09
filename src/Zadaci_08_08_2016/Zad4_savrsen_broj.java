package Zadaci_08_08_2016;

/* Pozitivni cijeli broj je savršen broj ukoliko je jednak zbiru svih svojih pozitivnih djelilaca, isključujući sebe. 
 * Na primjer, 6 je prvi savršeni broj jer 6 = 3 + 2 + 1. Sljedeći savršeni broj je 28 jer 28 = 14 + 7 + 4 + 2 + 1. 
 * Samo 4 savršena broja postoje u rasponu od 0 do 10.000. Napišite program koji ispisuje sva 4.*/

public class Zad4_savrsen_broj {
	
	public static boolean isPerfect (int num){
		int suma=0;
		
		//pronalazak sume djelilaca nekog broja
		for (int i=1; i<= num/2; i++){
			if (num%i==0){
				suma= suma+i;
			}
		}
		
		//uslova da je broj jednak sumi svojih djelilaca
		if (suma== num){
			return true;
		}else{
			return false;
		}
		
		
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ispis brojeva
		System.out.print("Savrseni brojevi od 1 do 10000 su: ");
		System.out.println();
		for (int i=1; i<=10000;i++){
			if (isPerfect(i)== true){
				System.out.print(i+" ");
			}
		}
		
		
	}

}
