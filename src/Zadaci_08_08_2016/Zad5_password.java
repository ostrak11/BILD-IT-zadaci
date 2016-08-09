package Zadaci_08_08_2016;
import java.util.Scanner;

/*Neke web stranice forsiraju određena pravila za passworde. Napisati metodu koja provjerava da li je unijeti string validan password. 
 * Pravila da bi password bio validan su sljedeća: 
 * 1. Password mora biti sačinjen od najmanje 8 karaktera. 
 * 2. Password smije da se sastoji samo od slova i brojeva. 
 * 3. Password mora sadržati najmanje 2 broja. 
 * Napisati program koji pita korisnika da unese password te mu ispisuje "password je validan" ukoliko su sva pravila ispoštovana 
 * ili "password nije validan" ukoliko pravila nisu ispoštovana*/

public class Zad5_password {
	
	//metoda koja ispituje broj karaktera 
	public static boolean is8 (String pass){
		
		if(pass.length()!=8){
			return false;
		}else{
			return true;
		}
		
	}
	
	//metoda koja provjerava da li su karakteri slova ili brojevi
	public static boolean isDigOrLet(String pass){
		
		for (int i=0; i<pass.length();i++){
			if(Character.isLetterOrDigit(pass.charAt(i))!= true){
				return false;
			}
		}
		
		return true;
	}
	
	//metoda koja provjerava da li ima minimalno dva broja u stringu
	public static boolean minDig(String pass){
		int brojac=0;
		for (int i=0; i<pass.length();i++){
			if(Character.isDigit(pass.charAt(i))){
				brojac++;
			}
		}
		if(brojac<2){
			return false;
		}else{
			return true;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos= new Scanner(System.in);
		//unos passworda
		System.out.println("Unesite Vas password");
		String pass=unos.next();
		
		//ispitivanje i ispis rezultata
		if((is8(pass)==true)&&(isDigOrLet(pass)== true)&&(minDig(pass)==true)){
			System.out.println("Vas password je validan.");
		}else{
			System.err.println("Vas password nije validan!!!");
		}
		
		unos.close();
	}

}
