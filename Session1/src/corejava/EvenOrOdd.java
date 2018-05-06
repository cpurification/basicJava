package corejava;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please type something below:");
		
		Scanner UserInput = new Scanner(System.in);
		
		int a = UserInput.nextInt();
		
		System.out.println("Your number is: ");
		if (a % 2 == 0) {
			
			System.out.println("Even");
		}
		else if (a % 2 != 0) {
			System.out.println("Odd");
		}
	}			
}


