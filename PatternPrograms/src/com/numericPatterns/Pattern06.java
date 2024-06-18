/*program to print pattern
1
21
321
4321
54321
  
*/

package com.numericPatterns;

import java.util.Scanner;

public class Pattern06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int max = sc.nextInt();
		int j,i;
		for(i=1;i<=max;i++)
		{
			for( j=i;j>=1;j--)
			{
				System.out.print(j);
				
			}

			System.out.println();
				
		}
		sc.close();
	}

}
