package zadaci_25_08_2016;

/* (Implement theCharacterclass) The Character class is provided in the Java library. Provide your own implementation for this class. 
 * Name the new class MyCharacter. */

public class Zad3_karakter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCharacter a = new MyCharacter('Z');
		//provjera da li je malo slovo
		System.out.println("Karakter je malo slovo? "+ a.isLowerCase());
		//provjera da li je veliko slovo
		System.out.println("Karakter je veliko slovo? "+a.isUpperCase());
		//provera da li je slovo
		System.out.println("Karakter je slovo? "+a.isLetter());
		//provjera da li je broj
		System.out.println("Karakter je broj? "+a.isDigit());
		
	}

}


class  MyCharacter{
	
	char ch;
	
	//konstruktori
	public MyCharacter(){
		
	}
	
	public MyCharacter(char value){
		this.ch= value;
	}
	
	//metoda koja provjerava je li dati karakter slovo 
	public boolean isLetter(){
		
		if ((this.ch >= 'A') && (this.ch <= 'Z') || (this.ch >= 'a') && (this.ch <= 'z') ){
			return true;
		}
		else{
			return false;
		}	
	}
	
	// metoda koja provjerava da li je dati karakter malo slovo
	public boolean isLowerCase(){
			if((this.ch >= 'a') && (this.ch <= 'z')){
					return true;
			}
			else{
				return false;
			}
			
		}
	//metoda koja provjerava da li je dati karakter veliko slovo
	public boolean isUpperCase(){
			if((this.ch >= 'A') && (this.ch <= 'Z')){
				return true;
			}
			else{
				return false;
			}
		}
	
	
	//metoda koja provjerava je li dati karakter broj
	public boolean isDigit(){
		//uslov ako je karakter izmedju 0 i 9
		if ((this.ch >= '0') && (this.ch <= '9')){
			return true;
		}
		else{
			return false;
		}
		
	}
		
	// metoda za provjeru da li je karakter broj
	public static boolean isDigit(char ch){
		if ((ch >= '0') && (ch <= '9')){
			return true;
		}
		else{
			return false;
		}
	}
	
	//metoda za provjeru da li je karakter malo slovo
	public static boolean isLowerCase(char ch){
		if((ch >= 'a') && (ch <= 'z')){
		
			return true;
		}
		else{
			return false;
		}
		
	}
	//staticka metod koja prima argument char i vraca ga kao malo slovo
	public static char toLowerCase(char ch){
		
		if ((ch >= 'A') && (ch <= 'Z')){
			//(65- A, 97-a u ASCII kodu)
			ch = (char)(ch + 32);
		}
		return ch;
	}
	
	//metoda koja provjerava da li je argument char veliko slovo
	public static boolean isUpperCase(char ch){
		if((ch >= 'A') && (ch <= 'Z')){
			return true;
		}
		else{
			return false;
		}
	}
	
	//staticka metod koja prima argument char i vraca ga kao veliko slovo
	public static char toUpperCase(char ch){
		if ((ch >= 'a') && (ch <= 'z')){
			
			//(65- A, 97-a u ASCII kodu)
			ch = (char)(ch - 32);
		}
		return ch;
	}
	
	
	@Override
	public String toString() {
		return "MyCharacter [ch=" + ch + "]";
	}

	
}