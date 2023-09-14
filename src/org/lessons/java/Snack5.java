package org.lessons.java;

import java.util.Scanner;

public class Snack5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = null;
		
		do {
			System.out.print("Inserisci una stringa: ");
			str = sc.nextLine();
			
			if(!str.equals("0")) {
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
		        
		        System.out.println("Numeri: " + digits);
		        System.out.println("Lettere: " + letters);
		        System.out.println("Simboli: " + symbols +"\n");
			} else {
				System.out.println("Arrivederci!");
			}
			
		}while(!str.equals("0"));
		
		sc.close();
	}
}
