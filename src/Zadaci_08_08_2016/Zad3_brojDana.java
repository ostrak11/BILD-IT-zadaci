package Zadaci_08_08_2016;

import java.util.*;

/* Napisati program koji pita korisnika da unese godinu i prva tri slova imena mjeseca (prvo slovo uppercase) te mu ispiše broj dana u tom mjesecu. 
 * Na primjer, ukoliko korisnik kao godinu unese 2001 a kao mjesec Jan program mu ispisuje da Jan 2011 ima 31 dan.*/

public class Zad3_brojDana {
	
	public static boolean isPrestupna(int god){
		if(((god%4==0) && (god/100 !=0))|| (god%400==0 )){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean is3(String mjesec){
		for (int i=0; i<mjesec.length();i++){
		if ((mjesec.length() !=3)||(!Character.isLetter(mjesec.charAt(i)))){
			return false;
			}
		}
		return true;
		
	}
	
	public static boolean isUpper(String mjesec){
		if (Character.isUpperCase(mjesec.charAt(0))== false){
			return false;
		}else{
			return true;
		}
	}
	
	public static boolean isIn(String[] month,String mjesec){
		
		if((is3(mjesec)==true)&&(isUpper(mjesec)==true)){
			
			for(int i=0;i<month.length;i++){
				if(mjesec.equals(month[i])){
					return true;
				}
			}
				
		}
			
		return false;
			
	}
	
	//metoda za godinu vecu od 0 (mada nije potrebno)
		public static boolean isUnosGod(int num){
			if((num<0)){
				return false;
			}else{
				return true;
			}
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//niz mjeseci u godini
		String[] mjeseci = {"Jan", "Feb", "Mar", "Apr","Maj", "Jun","Jul","Avg","Sep","Okt","Nov","Dec"};
		
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite prva tri slova imena mjeseca(vodeci racuna da prvo slovo bude veliko):");
		String mjesec= unos.next();
		
		//provjera da li je unos mjeseca u nizu
		if (isIn(mjeseci,mjesec)==false){
			System.out.println("Pogresan unos mjeseca!!!");
		}else{
			
			System.out.println("Unesite godinu: ");
			int god= unos.nextInt();
			
			//provjera da li je unos godine dobar
			if(isUnosGod(god)==false){
				System.out.println("Pogresan unos godine!!!");
			}else{
				//slucajevi za svaki mjesec koliko ima dana, ukljucujuci i prestupnu godinu
				switch(mjesec){
				
				case "Jan": 
					System.out.println("Mjesec "+ mjesec+" "+ god+" ima 31 dan.");
					break;
				
				
				case "Feb": 
					if(isPrestupna(god)==true){
						System.out.println("Mjesec "+ mjesec+" "+ god+" ima 29 dana.");
						break;
					}else{
						System.out.println("Mjesec "+ mjesec+" "+ god+" ima 28 dana.");
						break;
					}
					
				case "Mar": 
					System.out.println("Mjesec "+ mjesec+" "+ god+" ima 31 dan.");
					break;
					
				case "Apr": 
					System.out.println("Mjesec "+ mjesec+" "+ god+" ima 30 dana.");
					break;
					
				case "Maj": 
					System.out.println("Mjesec Maj "+ god+" ima 31 dan.");
					break;
					
				case "Jun": 
					System.out.println("Mjesec Jun "+ god+" ima 30 dana.");
					break;
					
				case "Jul": 
					System.out.println("Mjesec Jul " + god+" ima 31 dan.");
					break;
					
				case "Avg": 
					System.out.println("Mjesec Avg "+ god+" ima 31 dan.");
					break;
					
				case "Sep": 
					System.out.println("Mjesec Sep "+ god+" ima 30 dana.");
					break;
					
				case "Okt": 
					System.out.println("Mjesec Okt "+ god+" ima 31 dan.");
					break;
					
				case "Nov": 
					System.out.println("Mjesec Nov"+ god+" ima 30 dana.");
					break;
					
				case "Dec": 
					System.out.println("Mjesec Dec"+ god+" ima 31 dan.");
					break;
					
			}
			}
		}
			
		
		unos.close();
		
	}

}
