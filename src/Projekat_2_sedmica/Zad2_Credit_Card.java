package Projekat_2_sedmica;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Credit card numbers follow certain patterns. A credit card number must have between 13 and 16 digits.
 *  It must start with:
 ■ 4 for Visa cards 
 ■ 5 for Master cards 
 ■ 37 for American Express cards 
 ■ 6 for Discover cards 
 In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card numbers. The algorithm is useful to determine whether a card number is entered correctly 
 or whether a credit card is scanned correctly by a scanner. Credit card numbers are generated following this validity check, commonly known as the Luhn check or the 
 Mod 10 check, which can be described as follows (for illustration, consider the card number 4388576018402626): 

 1. Double every second digit from right to left. If doubling of a digit results in a two-digit number, add up the two digits to get a single-digit number.
 2. Now add all single-digit numbers from Step 1. 4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37 
 3. Add all digits in the odd places from right to left in the card number. 6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38 
 4. Sum the results from Step 2 and Step 3. 37 + 38 = 75 
 5. If the result from Step 4 is divisible by 10, the card number is valid; otherwise, it is invalid. 
 For example, the number 4388576018402626 is invalid, but the number 4388576018410707 is valid. 

 Write a program that prompts the user to enter a credit card number as a long integer. Display whether the number is valid or invalid. 
 */

public class Zad2_Credit_Card {

	static Scanner input = new Scanner(System.in);

	/** Return true if the card number is valid */
	public static boolean isValid(long number) {
		// vraca true ukoliko je velicina broja između 13 i 16 i zbir sume
		// parnih brojeva pomnozenih sa dva i neparnih djeljiv sa 10
		if ((getSize(number) >= 13)
				&& (getSize(number) <= 16)
				&& ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0)) {
			return true;

		}
		return false;

	}

	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;

		// broj pretvaramo u string
		String num = Long.toString(number);

		for (int i = num.length() - 2; i >= 0; i -= 2) {

			// prolazi kroz petlju i izracunava sumu, parnih mjesta pomnozenih
			// sa dva, kao i poziva metodu ukoliko je neki broj pomnozen sa dva
			// veci od 9
			sum += getDigit(2 * Character.getNumericValue(num.charAt(i)));
		}
		return sum;

	}

	/**
	 * Return this number if it is a single digit, otherwise, return the sum of
	 * the two digits
	 */
	public static int getDigit(int number) {
		// za brojeve vece od 9, uzimamo zbir cifara
		if (number > 9) {
			return (number % 10 + number / 10);
		}

		return number;

	}

	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {

		int sum = 0;
		String num = Long.toString(number);

		for (int i = num.length() - 1; i >= 0; i -= 2) {
			// pretvara karakter sa neparnog mjesta u stringu u numericku
			// vrijednost i sabira vrijednosti sa neparnih mjesta
			sum += Character.getNumericValue(num.charAt(i));
		}
		return sum;

	}

	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		// provjerava tacnost prefixa 
		if (getPrefix(number, getSize((long) d)) == d) {
			return true;
		}
		return false;

	}

	/** Return the number of digits in d */
	public static int getSize(long number) {
		int count = 1;
		// dokle god broj podijelje sa 10 nije 0, povecavamo vrijednost brojac,
		// koja predstavlja velicinu broja
		while (number / 10 != 0) {
			number /= 10;
			count++;
		}
		return count;

	}

	/**
	 * Return the first k number of digits from number. If the number of digits
	 * in number is less than k, return number.
	 */
	//uzima kao argumet broj i broj mjesta koji zauzima prefix i vraca prefix
	public static long getPrefix(long number, int k) {
		if (getSize(number) >= k) {
			// number goes until argument that is prefix
			int broj = getSize(number) - k;
			for (int i = 0; i < broj; i++) {
				number /= 10;
			}
		}
		return number;

	}
	//provjera unosa broja
	public static long checkIn() {

		long num = 0;
		boolean error = true;

		do {
			try {
				num = input.nextLong();
				if (num < 0)
					throw new InputMismatchException("Negative number");
				// if input is correct stops loop
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Input error, try again:  ");
				input.nextLine();
			}
		} while (error);

		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a credit card number as a long integer: ");
		long number = checkIn();
		/*	// if number is valid or starts with one of the digits in column
		if (isValid(number)
				&& (prefixMatched(number, 4) || prefixMatched(number, 5)
						|| prefixMatched(number, 37) || prefixMatched(number, 6))) {
			System.out.println(number + " is valid");

		} else
			System.out.println(number + " is invalid");*/
		
		
		
		System.out.println(prefixMatched(number, 3));
		System.out.println(getPrefix(number, 2));
	}

}
