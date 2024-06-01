package com.numericPatterns;

import java.util.Scanner;

public class Pattern01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of tables starting from 1 you want to print: ");
		int max = sc.nextInt();
		for (int i = 1; i <= max; i++) {
			for (int j = 1; j <= max; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println(" ");
		}
		sc.close();
	}

}
