package zadaci_29_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/* (InputMismatchException) Write a program that prompts the user to read two integers and displays their sum. 
 * Your program should prompt the user to read the number again if the input is incorrect. */

public class Zad3_InputMismatchException {

	static Scanner unos = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Unesite prvi broj:");
		int a= provjera();	//unos broja
		
		System.out.println("Unesite drugi broj:");
		int b=  provjera();	//unos broja
		
		System.out.println("Suma brojeva: "+ a + " + "+ b + " = "+ (a+b));
		
	}

	// metoda za provjeru unosa 
		public static int provjera(){
				int num =0;
				boolean checkIn = true;
				
				/// do while petlja da se izvrsava sve dok ne bude korektan cijeli broj
				do{
					//try blok provjerava unos
					try{
						num = unos.nextInt();
						checkIn= false;
					}
					// hvatanje izuzetka
					catch (InputMismatchException e) {
					    System.err.println("Pogresan unos, pokusajte sa cijelim brojem!!!"); 
					    unos.nextLine();
					
					}
				}while(checkIn);
				
				return num;
	}
	
}
