package by.javaonline.module1;

import java.util.Scanner;

// z = ((a - 3) * b / 2) + c

public class LinearTask1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input a: ");
		double a = scanner.nextDouble();
		
		System.out.println("Input b: ");
		double b = scanner.nextDouble();
		
		System.out.println("Input c: ");
		double c = scanner.nextDouble(); 
		
		double z = ((a - 3) * b / 2) + c;
		
		System.out.println("Result : z = " + z);
				
	}
 
}
