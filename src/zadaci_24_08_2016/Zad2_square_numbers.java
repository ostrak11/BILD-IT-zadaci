package zadaci_24_08_2016;

import java.math.BigInteger;

/* (Square numbers) Find the first ten square numbers that are greater than Long.MAX_VALUE. 
 * A square number is a number in the form of n2. For example, 4, 9, and 16 are square numbers.
 *  Find an efficient approach to run your program fast. */

public class Zad2_square_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// posmatramo cjelobrojnu vrijednost kvadratnog korjena tog broja, a zatim je povecamo za 1 i taj broj onda
		// predstavlja kvadratni korjen prvog sljedeceg trazenog kvadratnog broja 
		long number = (long)Math.sqrt(Long.MAX_VALUE) + 1;
		
		// Dodjeljujemo pocetni kvadratni korjen
		BigInteger n = new BigInteger(number + "");	
		
		System.out.println("First ten square numbers that are greater than " + Long.MAX_VALUE + ": ");
		
		// Petlja za ispis 10 kvadratnih brojeva
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + ": " + n.pow(2));	
			// Povecavamo broj koji predstavlja kvadratni korjen za + 1
			n = n.add(BigInteger.ONE);		
		}
		

}

}
