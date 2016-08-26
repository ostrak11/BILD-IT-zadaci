package zadaci_25_08_2016;

/*(Implement theStringBuilderclass) The StringBuilder class is provided in the Java library. 
 * Provide your own implementation for the following methods (name the new class MyStringBuilder1):
public MyStringBuilder1(String s); 
public MyStringBuilder1 append(MyStringBuilder1 s); 
public MyStringBuilder1 append(int i); 
public int length(); 
public char charAt(int index); 
public MyStringBuilder1 toLowerCase(); 
public MyStringBuilder1 substring(int begin, int end); 
public String toString();*/

public class Zad5_StringBilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStringBuilder1 str = new MyStringBuilder1("Bjez ba");
		MyStringBuilder1 str2 = new MyStringBuilder1("tamo");
		
		// spajanje dva stringa
		System.out.println(str.append(str2));
		// dodavanje broja na string
		System.out.println(str.append(11));
		// duzina objekta
		System.out.println(str.length());
		// karakter na određenom broju
		System.out.println(str.charAt(5));
		// pretvara u mala slova
		System.out.println(str.toLowerCase());
		// substring
		System.out.println(str.substring(2, 10));
		
	}

}

class MyStringBuilder1 {
	
	String str;
	
	//konstruktor
	public MyStringBuilder1(String s){
		this.str=s;
	}
	
	//metoda za dodavanje stringa 
	public MyStringBuilder1 append(MyStringBuilder1 s){
		this.str += s.str;
		return new MyStringBuilder1(this.str);
	}
	
	//metoda za dodavanje broja
	public MyStringBuilder1 append(int i){
		return new MyStringBuilder1(this.str += i);
	}
	//metda za vracanje duzine stringa
	public int length(){
		return str.length();
	}
	
	//metoda za vracanje karaktera pod odredjenim indeksom
	public char charAt(int index){
		
		return str.charAt(index);
	}
	//metoda za pretvaranje u mala slova
	public MyStringBuilder1 toLowerCase(){
		return new MyStringBuilder1(str.toLowerCase());
	}
	//metoda za kreiranje substringa
	public MyStringBuilder1 substring(int begin, int end){
		String str = "";
		
		for(int i=begin; i<end; i++){
			str += this.str.charAt(i);
		}
		return new MyStringBuilder1(str);
		
		
	}

	@Override
	public String toString() {
		return this.str;
	}
}