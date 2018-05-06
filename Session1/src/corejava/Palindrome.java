package corejava;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {

		System.out.println("Please type something below:");
		
		Scanner UserInput = new Scanner(System.in);
	
		String input = UserInput.nextLine();
		 
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(input);
 
        // reverse StringBuilder input1
        input1 = input1.reverse();
 
        String abc= input1.toString();
		
		if (input.equalsIgnoreCase(abc)) {
			
			System.out.println("Palindrome");
		}
		else {
			
			System.out.println("Not");	
		} 
    }
}

