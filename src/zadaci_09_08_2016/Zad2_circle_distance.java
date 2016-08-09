package zadaci_09_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Great circle distance predstavlja udaljenost između dvije tačke na površine sfere. 
 * Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku širinu i dužinu dvije tačke. 
 * Great circle distance između ove dvije tačke može biti izračunata koristeći se sljedećom formulom: 
 * d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). 
 * Napisati program koij pita korisnika da unese geografsku širinu i dužinu u stepenima 
 * dvije tačke na površini zemlje te mu ispisuje great circle distance. 
 * Prosječni radius zemlje je 6.371.01 km. Stepene koje korisnik unese trebamo promijeniti u radianse koristeći se 
 * Math.toRadians metodom jer Java trigonometrijske metode koriste radianse. 
 * Širina i dužina u ovoj formuli se odnose na zapad i sjever. Koristimo negativne vrijednosti da označimo istok i jug. */

public class Zad2_circle_distance {
	
	
	//metoda za izracunavanje udaljenosti izmedju tacaka
	public static double distance(double x1, double y1, double x2, double y2){
		
		double radius=6371.01;
		double distanca = radius * Math.acos(Math.sin(x1) * Math.sin(x2)
				+ Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		
		return distanca;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos= new Scanner(System.in);

		boolean n=true,m=true,b=true,v=true;
		double x1=0;
		double y1=0;
		double x2=0;
		double y2=0;
		
		//unos koordinata tacaka sa njihovom promjenom i ponovnim unosom u slucaju pogresnog unosa
		System.out.println("Unesite kordinate prve tačke x1: ");
		while(n==true){
			try {
				x1= unos.nextDouble();
				n=false;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				 System.out.println("Pogresan unos. Pokušajte ponovo sa brojem;"); 
				    unos.nextLine();
			}
		}
		
		Math.toRadians(x1);
		
		System.out.println("Unesite kordinate prve tačke y1: ");
		while(m==true){
			try {
				y1= unos.nextDouble();
				m=false;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				 System.out.println("Pogresan unos. Pokušajte ponovo sa brojem;"); 
				    unos.nextLine();
			}
		}
		//pretvaranje stepeni u radianse
		Math.toRadians(y1);
		
		System.out.println("Unesite kordinate druge tačke x2: ");
		while(b==true){
			try {
				x2= unos.nextDouble();
				b=false;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				 System.out.println("Pogresan unos. Pokušajte ponovo sa brojem;"); 
				    unos.nextLine();
			}
		}
		
		Math.toRadians(x2);
		
		System.out.println("Unesite kordinate druge tačke y2: ");
		while(v==true){
			try {
				y2= unos.nextDouble();
				v=false;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				 System.out.println("Pogresan unos. Pokušajte ponovo sa brojem;"); 
				    unos.nextLine();
			}
		}
		
		Math.toRadians(y2);
		
		//pozivanje metode i ispis rezultata
		System.out.println("Udaljenost između prve tačke ("+x1+","+y1+") i druge tacke ("+x2+","+y2+") iznosi "+distance(x1,y1,x2,y2)+"km." );
		
		unos.close();
	}

}
