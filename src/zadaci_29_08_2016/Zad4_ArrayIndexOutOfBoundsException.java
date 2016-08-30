package zadaci_29_08_2016;

import java.util.InputMismatchException;

/* Write a program that meets the following requirements: 
 * ■ Creates an array with 100 randomly chosen integers. 
 * ■ Prompts the user to enter the index of the array, then displays the corresponding element value. 
 * If the specified index is out of bounds, display the message Out of Bounds. */

public class Zad4_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner in = new java.util.Scanner(System.in);
		
		// kreiranje 100 random brojeva
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
        }
        
        System.out.print("Unesite indeks niza: ");
        // try blok za provjeru unosa
        try {
            int index = in.nextInt();
            System.out.println("Na poziciji "+ index+ " je: " + array[index]);
        } 
        // exception ukoliko je unos izvan granica niza
        catch (IndexOutOfBoundsException ex) {
            System.err.println("Array index out of bounds exception");
        } 
        //exception ukoliko je pogresan unos
        catch (InputMismatchException e) {
            System.err.println("Input mismatch exception");
        }
        in.close();

	}

}
