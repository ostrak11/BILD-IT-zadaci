package zadaci_02_08_2016;
import java.util.InputMismatchException;
import java.util.Scanner;
/* Napisati metodu koja prima jedan argument, broj pitanja, te generiše toliko nasumičnih, 
 * jednostavnih pitanja oduzimanja tipa : „Koliko je 5 - 2 ?“. 
 * Metoda treba da broji broj tačnih i netačnih odgovora te ih ispiše korisniku.*/


public class Zad2_test_oduzimanja {
	
	public static void test (int numQuestions){
		//definisanje scennera
		Scanner input= new Scanner(System.in);
		
		////deklarisanje i inicijaliziranje brojaca prestupnih godina
		int correct=0;
				
		for (int i=0; i<numQuestions;i++){
			//generisanje brojeva
			int num1 = (int)(Math.random()*10);
			int num2 = (int)(Math.random()*10);
			
			//zamjena brojeva da prvi broj bude veci ukoliko je to uopšte bitno za zadatak
			if (num1<num2){
				int test = num1;
				test = num2;
				num2= num1;
			}
			
			System.out.println("How much is " + num1 +" - " + num2 + "?");
			int answer=0;
			
			try {
				//unos odgovora
				answer = input.nextInt();
				//u slucaju da odgovor nebude broj da proslijedi exception
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				
				//u slučaju da je pogresan unos, da ispiše poruku i prekine sa radom program
				System.out.println("Molimo vas unesite broj kao odgovor");
				System.exit(0);
			}
			
			//brojac tacnih odgovora
			if(answer == num1-num2){
				correct++;
			}
			
		}
		//zatvaranje resursa
		input.close();
		
		//ispis tacnih i netačnih odgovora
		System.out.println("Number correct answers is " + correct + ".");
		System.out.println("Number incorrect answers is " + (numQuestions -correct) + ".");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
