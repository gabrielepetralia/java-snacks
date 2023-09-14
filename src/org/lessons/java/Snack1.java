package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci un numero : ");
		
		int n = sc.nextInt();
		sc.close();
		
		int res = n % 2 == 0 ? n : n + 1;
		
		System.out.println("Risposta: " + res);
	}
}
