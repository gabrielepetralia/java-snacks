package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci una parola: ");
		String str = sc.nextLine().toLowerCase();
		
		sc.close();
		
		char[] strArray = str.toCharArray();
		char[] strReverse = new char[strArray.length];
		
		int i=strArray.length - 1;
		int j=0;
		
		while(j < strArray.length) {
			strReverse[j] = strArray[i];
			i--;
			j++;
		}
		
		boolean isPal = String.valueOf(str).equals(String.valueOf(strReverse)) ? true : false;
		
		System.out.println(isPal ? "E' palindroma" : "NON è palindroma");
		
	}
}
