package qa004;


import java.util.Scanner;

public class LoginAttemptValidator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int attempt = 0; attempt<3; attempt++) {

			System.out.println("UserName :");
			String userName = scanner.nextLine();
			System.out.println("Password :");
			String password = scanner.nextLine();

			if (userName.equals("qauser")&&password.equals("Test@123")) {
				System.out.println("Login Successful");
				break;
			}
			else if (attempt == 2) {
				System.out.println("Account Locked");
				break;
			}
			else {
				System.out.println("Invalid Credentials");
			}


		}

		scanner.close();
	}

}






