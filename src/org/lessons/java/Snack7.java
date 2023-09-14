package org.lessons.java;

import java.util.Scanner;

public class Snack7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci un numero di secondi: ");
		int sec = sc.nextInt();
		sc.close();
		
		int hh = 0;
		int mm = 0;
		int ss = 0;
		
		for(int i=0; i < sec; i++) {
			if (ss < 59) {
				ss++;
			} else if(mm < 59) {
				mm ++;
				ss = 0;
		    } else {
		    	hh++;
		    	mm = 0;
		    	ss = 0;
		    } 
		}
		System.out.println("\nSecondi -> " + hh + "h " + mm + "m " + ss + "s");
	}
}
