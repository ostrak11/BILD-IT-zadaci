package Projekat_2_sedmica;

/* (Game: craps) Craps is a popular dice game played in casinos. Write a program to play a variation of the game, as follows: 
 * Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respectively. Check the sum of the two dice. 
 * If the sum is 2, 3, or 12 (called craps), you lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value 
 * (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either a 7 or the same point value is rolled. 
 * If 7 is rolled, you lose. Otherwise, you win. Your program acts as a single player. 
*/

public class Zad1_roll_dice {
	
	//metoda koja generise dva broja od 0 do 6 i vraca njihovu sumu
	public static int rollDice(){
		int dice1=(int)(1+Math.random()*6);
		int dice2=(int)(1+Math.random()*6);
		
		return dice1+dice2;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int roll=rollDice();
		System.out.println("You rolled: "+roll);
		
		//u koliko je suma jednaka 2, 3 ili 12 izgubili smo
		if((roll==2)||(roll==3)||(roll==12)){
			System.err.println("You lose!!!");
		//ukolko je suma 7 ili 11  pobijedili smo
		}else if((roll==7)||(roll==11)){
			System.err.println("You win!!!");	
		//drugi slucajevi
		}else{
		
			boolean next=true;
			
			//petlja radi dok neko bacanje nebude 7 ili isto kao prvo bacanje
			do{
				//bacamo ponovo kocku
				int nextRoll= rollDice();
				System.out.println("Next roll is: " + nextRoll);
				
				//u slucaju da je ponovno bacanje jednako prvom, pobijedili smo i izlazi iz petlje
				if(nextRoll==roll){
					System.err.println("You win!!!");
					next=false;
					//u slucaju da je ponovno bacanje jednako 7, izgubili smo i izlazi iz petlje
				}else if(nextRoll==7){
					System.err.println("You lose!!!");
					next=false;
				}
			}while(next);
		}
		
		
	}

}
