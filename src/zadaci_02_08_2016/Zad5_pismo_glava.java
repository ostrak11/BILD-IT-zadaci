package zadaci_02_08_2016;

/* Napisati metodu koja prima jedan argument te simulira bacanje novčića toliko puta. 
 * Nakon što se simulacija završi, program ispisuje koliko puta je novčić pokazao glavu a koliko puta pismo.*/

public class Zad5_pismo_glava {
	
	public static void coin(int num){
		//definisali brojac za pismo
		int tails=0;
		
		//generisali bacanja i pobrojali koliko puta je ispalo na pismo
		for (int i =0; i<num;i++){
			int toss = (int)(Math.random()*2);
			if (toss==0){
				tails++;
			}
			
			
		}
		
		//ispis rezultata dobivenih bacanja
		System.out.println("Coin showed " + tails+ " times tails.");
		System.out.println("Coin showed " + (num-tails)+ " times head.");
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
