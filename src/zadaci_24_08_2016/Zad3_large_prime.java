package zadaci_24_08_2016;

import java.math.BigInteger;

/*(Large prime numbers) Write a program that finds five prime numbers larger than Long.MAX_VALUE. */

public class Zad3_large_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//kreiranje objekta big integer sa najvecim long brojem
		BigInteger num = new BigInteger(Long.MAX_VALUE+ "");
		
		int counter=0; 
		
		BigInteger prime;
		System.out.println("Prosti brojevi:");
		

		
		while(counter<5){
		
			//metoda nextProbablePrime(); 
			//pronalazi sljedeci prime broj veci od num
			//metoda provjerena na manjim brojevima
			
			prime =num.nextProbablePrime();
			System.out.println(prime);
			
			counter++;
			//num postaje prime, tako da sljedeca provjera krece od nove num vrijednosti
			num = new BigInteger(prime+"");
}
	}

}
