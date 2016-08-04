package zadaci_03_08_2016;
import java.util.InputMismatchException;
import java.util.Scanner;

/*Napisati metodu koja nalazi najmanji element u nizu decimalnih vrijednosti koristeći se sljedećim headerom:
public static double min(double[ ] array)
Napišite potom test program koji pita korisnika da unese deset brojeva te poziva ovu metodu da vrati najmanji element u nizu.*/

public class Zad2_niz_min {
	
	public static double min(double[] array){
		//prepostavio da je prvi elemenat niza najmanji
		double min= array[0];
		
		//posao kroz niz
		for (int i=1; i< array.length; i++){
			//provjerio da li ima koji manji elemenat od prvog u niz, ako ima minimumu dodijelio njegovu vrijednost
			if (min>array[i]){
				min=array[i];
			}
		}
		//vratio minimum vrijednosti
		return min;
		
				
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//definisao skener
		Scanner input = new Scanner(System.in);
		
		//napravio niz 
		double[] array = new double[10];
		
		System.out.print("Please enter the 10 numbers in the array: ");
			
		//hvatanje gresaka prilikom unosa elemenata niz
		try {
			//unos elemenata u niz	
			for (int i =0; i< array.length; i++){
				array[i] = input.nextDouble();
			//pozivanje metode uz ispis vrijednosti
			}
				System.out.println("The minimum value in the array is " + min(array));
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				System.out.println("Entry is not OK");
			}
				//zatvaranje resursa
		finally{
			
			input.close();
		}
	}

}
