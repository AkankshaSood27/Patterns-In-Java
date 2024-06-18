/*program to print pattern
5
54
543
5432
54321   
*/

package com.numericPatterns;

import java.util.Scanner;

public class Pattern05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int max = sc.nextInt();
		int j,i;
		for(i=max;i>=1;i--)
		{
			for( j=max;j>=i;j--)
			{
				System.out.print(j);
				
			}

			System.out.println();
				
		}
		sc.close();
	}

}
