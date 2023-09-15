package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class Snack10 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		int min = 100;
		int max = 1000;
		
		Random rand = new Random();
		
		for(int i=0; i<10; i++) {
			arr[i] = rand.nextInt((max - min + 1)) + min;
		}
		
		System.out.println("Array con numeri random: " + Arrays.toString(arr));
		
		System.out.print("\nNumeri pari: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.print("\nNumeri dispari: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.print("\nNumeri ad indice pari: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.print("\nNumeri ad indice dispari: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
	}
}

