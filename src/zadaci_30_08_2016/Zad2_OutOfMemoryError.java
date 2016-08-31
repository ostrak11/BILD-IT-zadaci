package zadaci_30_08_2016;

import java.util.ArrayList;

/*Write a program that causes the JVM to throw an OutOfMemoryError and catches and handles this error. */

public class Zad2_OutOfMemoryError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> list = new ArrayList<>();
		
		try {
			//petlja vrti do max vrijednosti i dodaje u arraylistu
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
					list.add(Long.MAX_VALUE);
			}
			//hvata gresku
		} catch (OutOfMemoryError ex) {
			System.out.println("Nema vise memorije");
		}
		//printing out the message that program finished
		System.out.println("Zavrseno");
	}

}
