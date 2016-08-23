package Projekat_3;
import java.util.Scanner;
import java.util.InputMismatchException;

/*Game: connect four) Connect four is a two-player board game in which the
	 * players alternately drop colored disks into a seven-column, six-row vertically
	 * suspended grid.
	 * The objective of the game is to connect four same-colored disks in a row, a column,
	 * or a diagonal before your opponent can do likewise. The program prompts
	 * two players to drop a red or yellow disk alternately. In the preceding figure, the
	 * red disk is shown in a dark color and the yellow in a light color. Whenever a disk
	 * is dropped, the program redisplays the board on the console and determines the
	 * status of the game (win, draw, or continue). */

public class Zad2_connect4 {

	static Scanner input = new Scanner(System.in);	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] array = new char[6][7];	
		
		//lista sa praznim mjestima
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++) {
				array[row][column] = ' ';
			}
		}
		
		//printamo polje za igru
		printBoard(array);	
		
		//varijabla koja odrđuje igraca da li je parna ili neparna
		int player = 0;				
		
		while (!isWinner(array)) {
			
			// provjera da li je lista popunjena 
			if (isFull(array)) {
				// provjeravamo da li imamo pbjednika
				System.out.println("Draw");
				System.exit(0);	
			}
			
			//igramo potez
			move(array, player);	
			
			//printamo stanje
			printBoard(array);			
			
			//mijenjamo igraca
			player++;				
			
		}
		
		// Ispis pobjednika
		if (player % 2 == 0)
			System.out.println("Plavi igrac je pobijedio!!!");
		else
			System.out.println("Bordo igrac je pobijedio");
		

	}

		
	public static void printBoard(char[][] array) {	
		
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++) {
				System.out.print("|" + array[row][column]);	
			}
			System.out.print("|\n");
		}
		System.out.println("***************");				
		
	}
	
	/* Metoda koju koristimo za odigravanje poteza (R ili Y u zavisnosti od igraca, tj. boje njegovog diska) */
	public static char[][] move(char[][] array, int play) {
		
		String player;				
		
		//parni igrac bordo, neparni plavi
		if (play % 2 == 0)
			player = "bordo";			
		else
			player = "plavi";		
		
		System.out.print("Baci " + player + " disk u kolonu (0–6): ");
		int column = provjera();		
		
		// U slucaju da je kolona popunjena, ponavljamo postupak dok ne pronadjemo slobodno polje
		while (array[0][column] != ' ') {
			System.out.println("Kolona je popunjena . Pokusaj ponovo.");
			System.out.print("Baci " + player + " disk u kolonu (0–6): ");
			column = provjera();		
		}
		
		// Dodjeljujemo znak (prvo slovo boje diska) igraca u posmatranu kolonu (na prvo od dna slobodno mjesto)
		for (int row = array.length - 1; row >= 0; row--) {
			if (array[row][column] == ' ') {
				//u zavisnosti od igraca ispisujemo X ili O
				if(play%2==0){
					array[row][column] = 'X';
					break;
				}else{
					array[row][column] = 'O';// Ispisujemo znak
					break;										
				}
			}
		}
		
		return array;					
	}
	
	/* Metoda pomocu koje provjeravamo da li imamo pobjednika NIJE GOTOVA */
	public static boolean isWinner(char[][] array) {
				
		//trazimo pobjednika u redovima 
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length - 3; j++) {
				if (array[i][j] != ' ' && array[i][j] == array[i][j + 1] && array[i][j] == array[i][j + 2] && 
						array[i][j] == array[i][j + 3])
					return true;
			}
		}
		
		//trazimo pobjednika u kolonama
		for (int j = 0; j < array[0].length; j++) {
			for (int i = array.length - 1; i >= 3; i--) {
				if (array[i][j] != ' ' && array[i][j] == array[i - 1][j] && array[i][j] == array[i - 2][j] && 
						array[i][j] == array[i - 3][j])
					return true;
			}
		}
		
		//trazimo pobjednika u dvije dijagonale
		for (int i = array.length - 1; i >= 3; i--) {
			for (int j = 0; j <= 3; j++) {
				if (array[i][j] != ' ' && array[i][j] == array[i - 1][j + 1] && array[i][j] == array[i - 2][j + 2] && 
						array[i][j] == array[i - 3][j + 3])
					return true;				
			}
		}
		
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 3; j++) {
				if (array[i][j] != ' ' && array[i][j] == array[i + 1][j + 1] && array[i][j] == array[i + 2][j + 2] && 
						array[i][j] == array[i + 3][j + 3])
					return true;				
			}
		}

		
		// ako nema pobjednika vracamo false
		return false;
	}
	
	/* Metoda koja provjerava da li su sve pozicije vec odigrane */
	public static boolean isFull(char[][] array) {
		
		//broji slobodna mjesta
		int empty = 0;				
		
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++) {
				if (array[row][column] == ' ')
					empty++;		
			}
		}
		
		//ukoliko nema slobodnih mjesta lista je puna
		if (empty == 0)
			return true;					
		else
			return false;			
		
	}
		
	public static int provjera() {
			
		while(true) {								
			try{
				//unos
				int column = input.nextInt();		
				//provjera
				if (column < 0 || column > 6)		
					throw new InputMismatchException();
				
				return column;						
				//hvatanje gresaka uz ponovni unos
			} catch(InputMismatchException ex) {	
				System.out.print("Pogresan unos. Pokusaj ponovo: ");
				input.nextLine();
			}
		}
		
	
	}

	
}
