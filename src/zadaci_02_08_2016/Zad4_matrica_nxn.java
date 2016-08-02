package zadaci_02_08_2016;
import java.util.Scanner;
import java.util.InputMismatchException;

/*Napisati metodu koja ispisuje n x n matricu korsiteći sljedeći header:
public static void printMatrix(int n)
Svaki element u matrici je ili 0 ili 1, generisan nasumično. Napisati test program koji pita korisnika da unese n te ispisuje n x n matricu.*/


public class Zad4_matrica_nxn {
	
	public static void printMatrix (int n){
		
		//generisanje brojeva i ispis brojeva, bez pravljenja objekta matrice		
		for (int i =0; i<n;i++){
			for (int j=0; j<n; j++){
				int matrix= (int)(Math.random()*2);
				System.out.print(matrix+ " " );
			}
			System.out.println();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//definisanje skenera
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter the number of rows and columns in a matrix type 'n X n': " );
		
		try {
			//unos boja reda matrice
			
			int m = input.nextInt();
			//uslov da broj redova matrice mora biti pozitivan
			if (m>0){
				printMatrix(m);
			}else{
				System.out.println("You must enter a positive number!!!");
			}
			//hvatanje greske prilikom unosa
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			
			////u slučaju da je pogresan unos, da ispiše poruku i prekine sa radom program
			System.err.println("Nemozete unijet slovo!");
			System.exit(0);
		}
		
		
	}

}
