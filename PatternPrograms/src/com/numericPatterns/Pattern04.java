/*program to print pattern
5 4 3 2 1  
5 4 3 2  
5 4 3  
5 4  
5   
*/

package com.numericPatterns;

import java.util.Scanner;

public class Pattern04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int max = sc.nextInt();
		for(int i=1;i<=max;i++)
		{
			for(int j=max;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
				
		}
		sc.close();
	}

}
