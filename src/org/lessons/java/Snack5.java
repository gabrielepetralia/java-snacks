package org.lessons.java;

import java.util.Scanner;

public class Snack5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci una stringa: ");
		String str = sc.nextLine();
		
		int digits = 0;
        int letters = 0;
        int symbols = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isLetter(ch)) {
                letters++;
            } else {
                symbols++;
            }
        }
        
        System.out.println("\nNumeri: " + digits);
        System.out.println("Lettere: " + letters);
        System.out.println("Simboli: " + symbols);
	}
}
