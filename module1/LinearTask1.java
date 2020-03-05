package by.javaonline.module1;

import java.util.Scanner;

/*
z = ((a - 3) * b / 2) + c
*/

public class LinearTask1 {
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input a: ");
		a = scanner.nextDouble();
		
		System.out.print("Input b: ");
		b = scanner.nextDouble();
		
		System.out.print("Input c: ");
		c = scanner.nextDouble(); 
		
		z = ((a - 3) * b / 2) + c;
		
		System.out.println("Result: z = " + z);
				
	}
 
}
