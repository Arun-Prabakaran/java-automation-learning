package qa001;

import java.util.Scanner;

public class CalculatorOperations {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a = scanner.nextInt();
		System.out.println("Enter Second Number:");
		int b = scanner.nextInt();
		System.out.println("Enter Third Number:");
		int c = scanner.nextInt();
		System.out.println("Addition  "+(a+b+c));
		System.out.println("Subraction "+(a-b-c));
		System.out.println("Multiple "+(a*b*c));
		System.out.println("Division "+(a/b/c));
		System.out.println("Remainder "+(a%b%c));
		System.out.println(15%4);
		System.out.println(25%5);
		System.out.println(17%6);
		scanner.close();

	}

}
