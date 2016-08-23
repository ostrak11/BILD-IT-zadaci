package Projekat_3;

import java.util.InputMismatchException;
import java.util.Scanner;

/* In a game of tic-tac-toe, two players take turns marking an available cell in a 3 * 3 grid with their respective tokens (either X or O). 
 * When one player has placed three tokens in a horizontal, vertical, or diagonal row on the grid, the game is over and that player has won. 
 * A draw (no winner) occurs when all the cells on the grid have been filled with tokens and neither player has achieved a win. 
 * Create a program for playing tic-tac-toe.  The program prompts two players to enter an X token and O token alternately. 
 * Whenever a token is entered, the program redisplays the board on the console and determines the status of the game (win, draw, or continue).*/

public class Zad1_X_O {

	static Scanner unos= new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Dobrodošli u igru 'X''O' !!!");
		System.out.println();
		
		//matrica za unos korisnika
		char[][] board = new char[3][3];	
		//brojac poteza
		int counter = 0;
		//ispis ploče za igru
		printBoard(board);						
		
		boolean win = true;					
		int row, column;					
		
		
		while(win) {					
			//sve dok je polje slobodno moguc unos
			do {
				//unos red i kolone uz provjeru tacnosti unosa
				System.out.println("Unesite red (0, 1, 2) za igraca X: ");	
				row = provjera();
				System.out.println("Unesite kolonu (0, 1, 2) za igraca X: ");
				column = provjera();
			} while(occupied(row,column,board));	
			
			//ispis u polje znaka
			board[row][column] = 'X';		//u matricu u odgovarajuce polje upisati unos za igraca "X"
			
			//povecati broj poteza i ispisati polje
			counter++;						
			printBoard(board);			
			
			//provjera da li kraj partije
			win = win(board);				
			
			//ako je pobjedio ispis i izlaz iz petlje
			if(win == false) {				
				System.out.println("Pobjednik je X.");
				break;	
			}
			//ako nema pobjednika a broj poteza iskoristen nerijeseno je
			if (counter == 9) {					
				System.out.println("Nerijeseno.");
				break;
			}
			
			//za igraca O unos dok je polje slobodno
			do {
				//unos
				System.out.print("Unesite red (0, 1, 2) za igraca O: ");	
				row = unos.nextInt();
				System.out.print("Unesite kolonu (0, 1, 2) za igraca O: ");
				column = unos.nextInt();
			} while(occupied(row,column,board));
			
			//printanje ploče i povecanje poteza za +1
			board[row][column] = 'O';
			counter++;
			printBoard(board);
			
			//provjera da li je pobijedio
			win = win(board);
			
			//ipis ako jest  ili ako je nerijeseno
			if(win == false) {
				System.out.println("Pobjednik je O.");
				break;	
			}
			if (counter == 9) {
				System.out.println("Nerijeseno.");
				break;
			}
		}
	}
	
	public static int provjera() {

		int broj = 0;
		boolean provjera = true;
		do {
			// ucitavanje unosa i provjera da li je unos uredu
			try {
				//unos i izlaz iz petlje ako je unos dobar
				
				broj = unos.nextInt();
				if (broj==0|| broj==1||broj==2){
					provjera=false;
				}else{
					System.out.println("Pogresan unos. Pokusajte ponovo sa 0, 1 ili 2: ");
				}

			}
			// hvata greska i trazi ponovni unos
			catch (InputMismatchException ex) {
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				unos.nextLine();
			}
		} while (provjera);
		
		return broj;
	}
	
	//metoda za provjeru da li je polje slobodno
	public static boolean occupied(int row, int column, char[][] board) {
		
		//ako je slobodno polje vraca false
		if (board[row][column] == (char)0) {	
			return false;
		}
		else {
			System.out.println("Polje je vec zauzeto.");	
			return true;
		}
	}
	
	
		
	public static void printBoard(char[][] board) {
		//printanje ploče
		for(int i = 0; i < 3; i++) {				
			System.out.println("*************");			
			//ispis elemenata matrice ako ih ima
			for(int j = 0; j < 3; j++) {		
				System.out.print("| "+board[i][j]+" ");		
			}
			System.out.print("| ");							
			System.out.println();						//
		}
		System.out.println("*************");		
	}
	
	
	
	//metoda za ispitivanje pobjednika
	public static boolean win(char[][] matrix) {
		
		//provjera da li su isti elementi u redovima
		for(int i = 0; i < matrix.length; i++) {				
			if (matrix[i][0] == 'X' || matrix[i][0] == 'O') {					
				if(matrix[i][0] == matrix[i][1] && matrix[i][0] == matrix[i][2])
					return false;	
			}
		}	
		
		//provjera po kolonama
		for (int j = 0; j < matrix[0].length; j++) {			
			if (matrix[0][j] == 'X' || matrix[0][j] == 'O') {		
				if(matrix[0][j] == matrix[1][j]  && matrix[0][j] == matrix[2][j])
					return false;
			}
		}
		//provjera po dijagonalama
		if (matrix[0][0] == 'X' || matrix[0][0] == 'O') {							
			if (matrix[0][0] ==  matrix[1][1] && matrix[0][0] == matrix[2][2])		
				return false;
		}
		if (matrix[0][2] == 'X' || matrix[0][2] == 'O') {							
			if (matrix[0][2] == matrix[1][1] && matrix[0][2] == matrix[2][0])		
				return false;
		}		
		return true;	
	} 
	}
