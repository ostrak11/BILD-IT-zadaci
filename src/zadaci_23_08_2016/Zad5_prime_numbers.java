package zadaci_23_08_2016;

/*(Displaying the prime numbers) Write a program that displays all the prime numbers less than 120 in decreasing order. 
 * Use the StackOfIntegers class to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in reverse order.
*/

public class Zad5_prime_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int broj = 120;
		//kreiranje steka 
		StackOfIntegers stek = new StackOfIntegers();
		
		//pronalazimo proste brojeve i stavljamo u stek
		for (int i = 2; i <= broj; i++) {
			if(isProst(i)){
				stek.push(i);
			}
		}
		
		//printamo brojeve iz steka 
		System.out.print("Prosti brojevi manji od " + broj + " su: ");
		while(!stek.empty()) {
			System.out.print(stek.pop() + " ");	// Printamo prvi i brisemo ga
}
		
	}

	//metoda za prost broj
	public static boolean isProst(int broj) {
		
		for(int i = 2; i < broj; i++){
			if(broj % i == 0){
				return false;	
			}
		}
		return true;	
	}
}
