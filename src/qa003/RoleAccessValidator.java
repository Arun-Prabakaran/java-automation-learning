package qa003;

import java.util.Scanner;

public class RoleAccessValidator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter User Role");
		String userRole = scanner.nextLine();
		if (userRole.equals("admin")) {
			System.out.println("Full Access Granted");
		}
		else if (userRole.equals("tester")) {
			System.out.println("Qa Access Granted");
		}
		else if (userRole.equals("developer")|| userRole.equals("dev")) {
			System.out.println("Development Access Granted");
		}
		else {
			System.out.println("Access Denied");
		}
		scanner.close();
	}

}
