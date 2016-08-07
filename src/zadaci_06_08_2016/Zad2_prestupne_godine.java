package zadaci_06_08_2016;

import java.util.Scanner;

/*Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, u rasponu godina koje korisnik unese. 
 * Program pita korisnika da unese početnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu. Razmak između godina treba biti jedan space. */




public class Zad2_prestupne_godine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		int brojac=0;
		int temp;
		
		//unos pocetne i krajnje godine
		System.out.println("Molimo Vas unesite početnu godinu: ");
		int m=0;
		try {
			m = unos.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Pogresan unos!!!");
			System.exit(0);
		}
		
		System.out.println("Molimo Vas unesite krajnju godinu: ");
		int n=0;
		try {
			n = unos.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Pogresan unos!!!");
			System.exit(0);
		}
		
		//uslov da prvi broj bude manji od drugog
		if(m>n){
			temp=m;
			m=n;
			n=temp;
		}
		
		unos.close();
		
		//ispis godina
		System.out.println("Prestupne godine u periodu od "+ m+ ".godine do "+n+".godine su: " );
		for (int i=m; i<=n;i++){
			
			//uslov za prestupnu godinu
			if (((i%4==0) && (i/100 !=0)) || (i%400==0 )){
				System.out.print(i + " "); 
				brojac++;
			
				//uslov za ispis 10 godina po redu
			if (brojac%10==0){
				System.out.println(" ");
			}
			}
		}
		
		
		
	}

}
