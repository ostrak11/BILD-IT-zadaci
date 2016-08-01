package zadaci_01_08_2016;

/*Napisati metodu koja prima dva cijela broja kao argumente te vraća najveći zajednički djelilac za ta dva broja.

PRIMJER:

Unesite prvi broj: 125
Unesite drugi broj: 2525
Najveći zajednički djelilac za brojeve 125 i 2525 je 25.*/

public class Zad3_zajednicki_djelilac {
	
	public static int djelilac (int a, int b){
		
		
		//deklarisanje i inicijaliziranje najmanjeg djelioca
		int djelilac = 1;
		
		//pronalazak zajednickog djelioca
		for (int i =1; i<=b;i++){
			if ((a%i==0)&&(b%i==0)){
				i= djelilac;
			}
		}
		
		return djelilac;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
