package zadaci_24_08_2016;

import java.math.BigInteger;

/* A prime number is called a Mersenne prime if it can be written in the form 2p - 1 for some positive integer p. 
 * Write a program that finds all Mersenne primes with p … 100 and displays the output as shown below. 
 * (Hint: You have to use BigInteger to store the number, because it is too big to be stored in long. Your program may take several hours to run.)
 */

public class Zad4_Mersenne_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigInteger one = BigInteger.ONE;	
		BigInteger two = one.add(one);		
		BigInteger posiblePrime;			
		
		System.out.printf("%3s	%-1s \n", "p", "2^p – 1");
		
		// Provjeravamo za pozitivne brojeve p manje ili jednake 100
		for (int p = 1; p <= 100; p++) {
			// Primjena formule
			posiblePrime = two.pow(p).subtract(one);	
			
			// Koristimo vec postojocu metodu za provjeru da li je broj prost
			if (posiblePrime.isProbablePrime(1)) {
				
				// Ispisujemo proste brojeve
				System.out.printf("\n%3d	%-1d", p, posiblePrime);
			}
		}

	}

}
