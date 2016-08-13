package zadaci_12_08_2016;

/* Napisati metodu sa sljedećim headerom: public static int isPrime(int n) koja provjerava da li je broj prost/prime. 
 * Napsati test program koji poziva ovu metodu i ispisuje sve proste brojeve u rasponu od 0 do 100000.*/

public class Zad3_prost {
	
		
	public static int isPrime(int n){
		//svi brojevi manji od jedan nisu brojevi i vraca nam nula
		if (n < 1)
			return 0;
		
		//prolazi kroz petlju i ukoliko je broj djeljiv tako da je ostatak nula...vratice nam da je nula
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				n = 0;
			}
		}
		//za broj koji nije djeljiv ni sa jednim brojem izuzev samog sebe vratice nam taj broj
		return n;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//brojac stavljen radi preglednosti prilikom ispisa rezultata
		int brojac=0;
		
		for(int i=0; i<=10000;i++){
			//pozvana metoda i ukoliko je broj razlicit od nula tj djeljiv sa samim sobom da ga ispise
			if(isPrime(i)!=0){
				brojac++;
				System.out.print(i+" ");
				if(brojac%10==0){
					System.out.println();
				}
			}
		}
		
	}

}
