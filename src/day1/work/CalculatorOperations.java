package day1.work;

import java.util.Scanner;

public class CalculatorOperations {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
	    System.out.println("Addition  "+(a+b+c));
	    System.out.println("Subraction "+(a-b-c));
	    System.out.println("Multiple "+(a*b*c));
	    System.out.println("Division "+(a/b/c));
	    System.out.println("Remainder "+(a%b%c));
	    System.out.println(15%4);
	    System.out.println(25%5);
	    System.out.println(17%6);
		
	}

}
