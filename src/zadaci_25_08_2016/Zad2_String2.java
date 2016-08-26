package zadaci_25_08_2016;

/* (Implement theStringclass) The String class is provided in the Java library. Provide your own implementation for the following methods (name the new class MyString2):
public MyString2(String s); 
public int compare(String s); 
public MyString2 substring(int begin); 
public MyString2 toUpperCase(); 
public char[] toChars(); 
public static MyString2 valueOf(boolean b); */

public class Zad2_String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyString2 obj1 = new MyString2("Mobitel");
		
		//compare metoda, koja vraca vrijednosti negativne, poz i 0
		if (obj1.compare("Mobitel")==0){
			System.out.println("Identican je string.");
		}
		
		if (obj1.compare("Amra")<0){
			System.out.println("String je manji od uporedjivanog striga objekta.");
		}
		else{
			System.out.println("String je veci od uporedjivanog stringa objekta.");
		}
		
		//print substringa
		System.out.println(obj1.substring(2)); 
		//print velikim slovima
		System.out.println(obj1.toUpperCase());
		
	}

}

class MyString2{
	
	
		char[] chars;
		
		//kreiranje konstruktora
		public MyString2(){
			
		}
		
		public MyString2(String s){
			
			// od stringa napravit niz oznaka
			this.chars = new char[s.length()];
					
			for (int i=0; i<chars.length; i++){
				chars[i] = s.charAt(i);			
			}
		}

		
		public MyString2(char[] chars){
			this.chars = chars;
		}
		
		//metoda za poređenje stringova
		public int compare(String s){
			
			//ukoliko stringovi nisu iste duzine
			if (this.chars.length != s.length()){
				//vraca se vrijednost ili negativna ili pozitivna u zavisnosti od velicine stringa argumenta		
				return this.chars.length - s.length();
				}
			//provjera da li je svaki znak identican
			for (int i = 0; i < chars.length; i++)
				if (this.chars[i] != s.charAt(i)){
					//ukoliko nije, vraca se vrijednost za koliko je neki karakter veci ili manji od datog stringa
						return this.chars[i]-s.charAt(i);
						}
			//ako su stringovi identicni, vraca se 0
				return 0;
		}
		
		//metoda za kreiranje substringa od pocetnog indeksa
		public MyString2 substring(int begin){
			
			char[] substring = new char[this.chars.length-begin];
			
			for (int i=0; i<substring.length; i++){
				substring[i]= this.chars[i+ begin];
			}
			return new MyString2(substring);
					
		}
		
		//metoda za vracanje velikih slova
		public MyString2 toUpperCase(){
			
			for (int i = 0; i < chars.length; i++){
				if ((this.chars[i] >= 'a') && (this.chars[i] <= 'z')){
					this.chars[i] = (char)(this.chars[i] - 32);
				}
			}
			return this;
		}
		
		//metoda za vracanje niza karaktera
		public char[] toChars(){
			
			//novi niz ima duzinu datog stringa (koji je pretvoren u niz karaktera)
			char[] charNew = new char[chars.length];
				//novi niz poprima vrijednosti datog stringa karaktera
				for (int i=0; i<charNew.length; i++){
					charNew[i]= chars[i];
				}
			return charNew;
		}
		
		//metoda vraca string  koji je postavljen kao boolean vrijednost (true || false)
		public static MyString2 valueOf(boolean b){ 
			if (b) 
				return new MyString2("true");
			else
				return new MyString2("false");
		}

		@Override
		public String toString() {
			String a="";
			for (int i=0; i<chars.length; i++){
				a+=chars[i]+"";
			}
			return a;
	}
	
}
