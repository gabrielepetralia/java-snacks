package org.lessons.java;

import java.util.Random;

public class Snack2 {
	public static void main(String[] args) {
		
		String[] names = {"Mario", "Giulia", "Matteo", "Marta", "Giovanni", "Giada"};
		String[] surnames = {"Rossi", "Verdi", "Bianchi", "Ferrari", "Esposito", "Costa"};
		
		System.out.println("Lista invitati: \n");
		
		Random rnd = new Random();
		
		for(int i=0; i<10; i++) {
			String randName = names[rnd.nextInt(names.length)];
			String randSurname = surnames[rnd.nextInt(surnames.length)];	
			System.out.println("- "+ randName + " " + randSurname);	
		}
	}
}
