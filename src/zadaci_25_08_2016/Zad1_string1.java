package zadaci_25_08_2016;

/* The String class is provided in the Java library. Provide your own implementation for the following methods (name the new class MyString1):
public MyString1(char[] chars); 
public char charAt(int index); 
public int length();
 public MyString1 substring(int begin, int end); 
 public MyString1 toLowerCase(); 
 public boolean equals(MyString1 s); 
 public static MyString1 valueOf(int i);*/

public class Zad1_string1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyString1 obj= new MyString1("Nesto");
		//printanje objekta
		System.out.println("Objekat u sting formatu: " +obj.toString());
		//pronalazak slova sa odredjenim indeksom [2]
		System.out.println("Karakter na određenom indexsnom mjestu " + obj.charAt(4));
		//duzina objekta
		System.out.println("Duzina stringa "+ obj.length());
		//substring sa indeksima od 3 i 5
		System.out.println("Substring "+ obj.substring(2, 5));
		//vracanje sa malim slovima
		System.out.println("Pretvaranje u mala slova stringa: " + obj.toLowerCase());
		//poredjenje stringova
		System.out.println("Da li su objekti jednaki? "+obj.equals("nesto"));
		
	}

}
class MyString1 {
	
	
	char[] chars;

	public MyString1(){
	
	}
	
	public MyString1(String str){
			// od stringa napravit niz oznaka
		this.chars = new char[str.length()];
		
		for (int i=0; i<chars.length; i++){
			chars[i] = str.charAt(i);
		}
	}
	
	public MyString1(char[] chars){
		 this.chars = chars;
	}

	//pronalazak odredjenog karaktera pod datim indeksom
	public char charAt(int index){
			return chars[index];
	}
	
	//metoda koja vraca velicinu
	public int length(){
		return chars.length;
	}	
	
	//metoda koja pravi substring od datog stringa
	public MyString1 substring(int begin, int end){
		char[] substring = new char[end-begin];
        
        for(int i = begin; i < end; i++) {
            substring[i-begin] = this.charAt(i);
        }
        return new MyString1(substring);
		
	}
	
	//metoda za vracanje malih slova
	public MyString1 toLowerCase(){
		
		for (int i = 0; i < chars.length; i++){
			// ukoliko su znakovi izmedju A i Z pretvorit cemo ih u mala slova tako sto cemo na isti dodat 32
			
			if ((this.chars[i] >= 'A') && (this.chars[i] <= 'Z')){
				
				//(65- A, 97-a u ASCII kodu)
				this.chars[i] = (char)(this.chars[i] + 32);
			}
		}
		return this;
	}
	
	//provjera da li je dati string jednak stringu s
	public boolean equals(MyString1 s){
		 
		//uslov ako duzine nisu iste
		if(this.length() != s.length()) {
	            return false;
	       }
	        
	    for(int i = 0; i < this.length(); i++) {
	          //ukoliko svaki indeks ne odgovara indeksu drugog stringa
	    	if(this.charAt(i) != s.charAt(i)) {
	             return false;
	            }
	        }
	        
	        return true;
	}
	
	//static meoda koja vraca i u string vrijednost
	public static MyString1 valueOf(int i){
	
		return new MyString1(Integer.toString(i).toCharArray());
	}

}
