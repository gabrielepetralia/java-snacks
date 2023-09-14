package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class Snack8 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		int min = 100;
		int max = 150;
		int sum = 0;
		float avg = 0;
		
		Random rand = new Random();
		
		for(int i=0; i<10; i++) {
			arr[i] = rand.nextInt((max - min + 1)) + min;
		}
		
		int lower = arr[0];
		int higher = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			sum += arr[i];
			if ( arr[i] < lower) {
				lower = arr[i];
			}
			if ( arr[i] > higher) {
				higher = arr[i];
			}
		}
		
		avg = (sum + 0.0F) /arr.length;
		System.out.println("Array con numeri random: " + Arrays.toString(arr));
		System.out.println("\nMin: " + lower + " / Max: " + higher + " / Avg: " + avg);
	}
}
