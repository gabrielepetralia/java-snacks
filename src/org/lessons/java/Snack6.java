package org.lessons.java;

import java.util.Scanner;

public class Snack6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = null;
		
		do {
			System.out.print("Inserisci un numero (stringa): ");
			str = sc.nextLine();
		}while(str.length()<=0);
		
		sc.close();
		
		int res = 0;
		
		for (int i=0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch < '0' || ch > '9') {
            	System.out.print("Stringa non valida!");
            	return;
            }

            int digit = ch - '0';
            res = res * 10 + digit;
        }
		
		System.out.print("Stringa trasformata in intero: " + res);
	}
}
