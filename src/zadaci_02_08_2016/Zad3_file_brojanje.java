package zadaci_02_08_2016;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


/*Napišite program koji će brojati broj karaktera, riječi i linija teksta u nekom fileu. 
 * Riječi trebaju biti odvojene jednim spaceom. Ime file proslijediti kao argument u vaš program.
 * */


public class Zad3_file_brojanje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//definisanje skenera
		Scanner input= new Scanner(System.in);
		
		//unos imena fajla
		System.out.println("Enter file name");
		String name= input.next();
		input.close();
		
		//definisanje objekta file
		File file =new File(name);
		Scanner in;
		
		//deklarisanje i inicijaliziranje brojaca za karaktere, rijeci i linije
		int accChar = 0;
		int accString = 0;
		int accLine =0;
		
		//hvatanje gresaka prilikom unosa imena
		try {
			//skener koji ide kroz fajl
			in = new Scanner(file);

			//uslov za skener
			while(in.hasNext()){
				//dodojeljivanje stringu sveke rijeci u fajlu, kao i brojanje istih
				String word=in.next();
				accString++;
			}
			//zatvaranje resursa
			in.close();
			
			//novi skener za fajl
			Scanner in2= new Scanner(file);
			
			//uslov za skener
			while(in2.hasNextLine()){
				//dodojeljuje stringu svaku liniju fajla i broji linije
				String text=in2.nextLine();
				accLine++;
				
				//sacuva dati string i ukloni razmake u stringu kako bi se pobrojali karakteri
				text=text.replace(" ", "");
				for (int i=0;i<text.length();i++){
					accChar++;
				}
			}
			//zatvoren unos
			in2.close();
			
				
		//exception pogresan unos imana fajla	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Nepostojeci file!!!");
			System.exit(0);
		}
		
		
	
		//ispis razultata
		System.out.println("The number of characters in a file is: " + accChar);
		System.out.println("The number of strings in a file is: " + accString);
		System.out.println("The number of lines in a file is: " + accLine);
		
		
		
	}

}
