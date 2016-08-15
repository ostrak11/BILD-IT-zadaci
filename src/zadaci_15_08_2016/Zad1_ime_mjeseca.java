package zadaci_15_08_2016;
/*Napisati program koji nasumično generiše cijeli broj između 1 i 12 te ispisuje ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)*/


public class Zad1_ime_mjeseca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//generise broj od 1 do 12	
		int broj= (int)(1+Math.random()*13);
		
		//mjeseci u nizu
		String [] mjesec={"Januar", "Februar", "Mart", "April", "Maj", "Juni", "Juli", "Avgust", "Septembar", "Oktobar", "Novembar", "Decembar"};
		
		//ispis mjeseca - posto se generise broj od 1 do 12, a indexi u nizu idu od 0 do 11, potrbno umanjiti sa 1
		System.out.println(mjesec[broj-1]);
	}

}
