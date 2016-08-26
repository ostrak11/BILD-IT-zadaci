package zadaci_25_08_2016;

import java.util.ArrayList;
import java.util.Arrays;

/*(New string split method) The split method in the String class returns an array of strings consisting of the substrings split by the delimiters. 
 * However, the delimiters are not returned. Implement the following new method that returns an array of strings consisting of the substrings split
 *  by the matching delimiters, including the matching delimiters.
public static String[] split(String s, String regex) */

public class Zad4_split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ispis rezultata
		System.out.println(Arrays.toString(split("ab#12#453", "#")));
		System.out.println(Arrays.toString(split("a?b?gf#e", "[?#]")));
	}

	public static String[] split(String s, String regex) {
		ArrayList<String> lista = new ArrayList<>();
		String chars = "";
		for (int i = 0; i < s.length(); i++) {
			//dodajemo prvi substring privremenom stringu
			chars += s.charAt(i) + "";			
			for (int j = 0; j < regex.length(); j++) {
				//ako je karakter stringa isti kao jedan od regex, dodajemo substring listi
				if (s.charAt(i) == regex.charAt(j)) {		
					//oduzimamo regex iz privremenog stringa
					chars = chars.substring(0, chars.length() - 1);		
					//pretvaramo regex karakter u string
					String reg = regex.charAt(j) + "";		
					lista.add(chars);	
					lista.add(reg);
					chars = "";		
				}
			}
		}
		//dodajemo ostatak stringa iz petlje
		lista.add(chars);	
		String[] newList = new String[lista.size()];
		for (int i = 0; i < lista.size(); i++) {
			newList[i] = lista.get(i);
		}
		return newList;
}
}
