package zadaci_12_08_2016;

/*Pretpostavimo da se registarska tablica za auto sastoji od tri uppercase karaktera i 4 broja u sljedećem formatu AAA-1234. 
 * Napisati program koji nasumično generiše tablicu.*/


public class Zad1_reg_tablica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//generisanje tri velika slova slova
		char znak1= (char)(Math.random()*26 + 65);
		char znak2= (char)(Math.random()*26 + 65);
		char znak3= (char)(Math.random()*26 + 65);
		
		//generisanje jednog cijelog broja do 10000
		int znak4= (int)(Math.random()*10000);
		
		//ispis
		System.out.println("Registracijska tablica: "+znak1+znak2+znak3+"-"+znak4);
		
		
	}

}
