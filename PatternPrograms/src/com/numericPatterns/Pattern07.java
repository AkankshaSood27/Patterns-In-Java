/*program to print pattern
     1
    12
   123
  1234
 12345
  
*/

package com.numericPatterns;

import java.util.Scanner;

public class Pattern07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int max = sc.nextInt();
		int i,j,k;
		for(i=1;i<=max;i++)
		{
			for( j=max;j>=i;j--)
			{
				System.out.print(" ");
				
			}
			
			
			for( k=1;k<=i;k++)
			{
				System.out.print(k);
				
			}

			System.out.println();
				
		}
		sc.close();
	}

}
