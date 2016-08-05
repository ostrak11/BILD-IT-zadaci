package zadaci_04_08_2016;

/* Napisati metodu koja printa 100 nasumičnih uppercase karaktera i 100 nasumičnih brojeva, 10 po liniji.*/


public class Zad4_velika_slova {
	
	
	public static void print (){
		
	int brojac=0;	
		
	//generisanje velikih slova, njihovo razvrstavanje po 10/liniji i ispis
		for (int i =0; i<100;i++){
			char slovo= (char)(Math.random()*26 + 65);
			System.out.print(slovo + " ");
			brojac++;
			if (brojac%10==0){
				System.out.println("" );
			}
		}
		
		System.out.println();
		
		//generisanje brojeva, njihovo razvrstavanje po 10/liniji i ispis
		for (int i =0; i<100;i++){
			int broj= (int)(Math.random()*10);
			System.out.print(broj + " ");
			brojac++;
			if (brojac%10==0){
				System.out.println("" );
			}
		}
					
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//pozivanje metode
		print();
	}

}
