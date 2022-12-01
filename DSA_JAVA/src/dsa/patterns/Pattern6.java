package dsa.patterns;

import java.util.Scanner;

public class Pattern6 {

	
	/*
	
		*	*	*		*	*	*
		*	*				*	*
		*					 	*
		*	*				*	*
		*	*	*		*	*	*

	*/
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number to form the pattern : ");
		int n = sc.nextInt();
		
		int spaces = 1;
		int stars = (n/2) + 1;
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= stars; j++) {
				System.out.print("*\t");
			}
			for(int j = 1; j <= spaces; j++) {
				System.out.print("\t");
			}
			for(int j = 1; j <= stars; j++) {
				System.out.print("*\t");
			}
			
			if(i <= n/2) {
				spaces+=2;
				stars--;
			}else {
				spaces-=2;
				stars++;
			}
			
			System.out.println();
		}
	}

}
