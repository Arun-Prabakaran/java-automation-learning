package qa005;

import java.util.Scanner;

public class EnvironmentSelector {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Environment to choose");
		String str = sc.nextLine();
		switch (str) {
		case "qa":
			System.out.println("https://www.saucedemo.com/");
			break;
			
		case"stage":
			System.out.println("https://demoqa.com/");
			break;
			
		case"prod":
			System.out.println("https://the-internet.herokuapp.com/");
			break;

		default:
			System.out.println("Invalid Environment");
			break;
		}
	}

}
