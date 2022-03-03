import java.util.Scanner;

public class PasswordApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final int MIN_Uppercase=1;
		final int MIN_Lowercase=1;
		int uppercaseCounter=0;
		int lowercaseCounter=0;
		
		System.out.println("Hello! Please make a password with the following requirements:");
		System.out.println("At least 1 lowercase letter");
		System.out.println("At least 1 uppercase letter");
		System.out.println("A minimum of 7 characters");
		System.out.println("A maximum of 12 characters");
		System.out.println("An exclamation point: !");
		
		
		System.out.println("Enter new password:");
		String password = scnr.nextLine();
		
		 for (int i=0; i < password.length(); i++ ) {
             char c = password.charAt(i);
             if(Character.isUpperCase(c)) 
                   uppercaseCounter++;
             else if(Character.isLowerCase(c)) 
                   lowercaseCounter++;
		 }
		if (password.length() >= 7 && password.length() <= 12 && password.contains("!") && uppercaseCounter >= MIN_Uppercase 
				&& lowercaseCounter >= MIN_Lowercase)
		{
			System.out.println("Password valid and accepted");
			} else {
				System.out.println("Error");
		}
		scnr.close();
	
}
}
