package org.lessons.java;

import java.util.Scanner;

public class Snack9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		do {
			System.out.print("Inserisci un numero: ");
			int n = sc.nextInt();
			
			sum += n;
			
			System.out.println(sum-n + " + " + n + " = " + sum + "\n");
			
			if(sum>1000) {
				System.out.println("Hai superato il valore 1000!");
			}
		} while(sum<=1000);		
	}
}
