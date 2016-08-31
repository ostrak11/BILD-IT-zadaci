package zadaci_30_08_2016;

/* Write the bin2Dec(String binaryString) method to convert a binary string into a decimal number. 
 * Implement the bin2Dec method to throw a NumberFormatException if the string is not a binary string. */

public class Zad1_NumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// testiranje metode
				System.out.println(bin2Dec("000010101"));
				try{
				// Purposely throwing an exception...
				System.out.println(bin2Dec("jffgf546"));
				}catch(NumberFormatException ex){
					System.out.println(ex);
				}	
	}

	//metoda koja pretvarabinarne u cijele brojeve
	public static int bin2Dec(String binaryString) throws NumberFormatException {
			// ukoliko string sadrzi nesto razlicito od 0 ili 1 baci gresko
			if (!isBinary(binaryString)) {
				throw new NumberFormatException(binaryString+ "nije binaran broj!!!");
				}

			int power = 0;
			int decimal = 0;
			for (int i = binaryString.length() - 1; i >= 0; i--) {
				if (binaryString.charAt(i) == '1') {
						decimal += Math.pow(2, power);
					}
					power++;
				}
			return decimal;
			}

	//provjerava da li je broj binaran
	public static boolean isBinary(String binaryString) {

		for (char ch : binaryString.toCharArray()) {
			if (ch != '1' && ch != '0')
				return false;
			}
			return true;
		}		
				
	}
