package corejava;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please type something below:");
		
		Scanner UserInput = new Scanner(System.in);
		
		String a;
		
		a = UserInput.nextLine();
		
		System.out.println("The length of your word is:");
		System.out.println(a.length());
		
		
	}

}
