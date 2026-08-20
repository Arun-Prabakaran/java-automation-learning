package qa002;

import java.util.Scanner;

public class LoginValidator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Username:");
		String username = scanner.nextLine();

		System.out.println("Enter Password:");
		String password = scanner.nextLine();
		if (username.equals("qauser") && password.equals("Test@123")) {
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Invalid credentials");
		}
		scanner.close();
	} 

}





