/*program to print pattern
1  
1 2  
1 2 3  
1 2 3 4  
1 2 3 4 5  
*/

package com.numericPatterns;

import java.util.Scanner;

public class Pattern02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int max = sc.nextInt();
		for(int i=1;i<=max;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
				
		}
		sc.close();

	}

}
