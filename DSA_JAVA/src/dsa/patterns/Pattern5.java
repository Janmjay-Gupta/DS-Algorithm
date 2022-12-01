package dsa.patterns;

import java.util.Scanner;

public class Pattern5 {
	
	/*
	
	 				*
	 			*	*	*
	 		*	* 	*	*	*
	 			*	*	*
	 				*

	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number to form the pattern : ");
		int n = sc.nextInt();
		
		int spaces = n/2;
		int stars = 1;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < spaces; j++) {
				System.out.print("\t");
			}
			for(int j = 0; j < stars; j++) {
				System.out.print("*\t");
			}
			
			if(i < n/2) {
				spaces--;
				stars+=2;
			}	else {
				spaces++;
				stars-=2;
			}
			
			System.out.println();
		}
		
	}

}
