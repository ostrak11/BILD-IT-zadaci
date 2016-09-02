package zadaci_01_09_2016;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/* Write a program that prompts the user to enter a file name and displays the occurrences of each letter in the file. Letters are case-insensitive*/

public class Zad2_Occurrences_of_each_letter {
	


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ukucaj ime fajla: ");
	
		File file = new File(input.next().trim());
		input.close();


		Scanner in = new Scanner(file);
		// niz sa svim slovima
		char[] chars = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
				'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
				'X', 'Y', 'Z' };
		// niz koji će se računati broj slova
		int[] nums = new int[26];
		
		while (in.hasNextLine()) {
			String line = in.nextLine();
		
			for (int i = 0; i < chars.length; i++) {
				for (int j = 0; j < line.length(); j++) {
					if (chars[i] == Character.toUpperCase(line.charAt(j))) {
						nums[i]++;
					}
				}
			}
		}
		in.close();	
	
		// printanje rezultata
		for (int i = 0; i < 26; i++) {
			if (nums[i] > 0)
				System.out.println("Slovo " + chars[i] + " se pojavilo " + nums[i]
						+ " puta.");
		}

	}

}
