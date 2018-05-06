package corejava;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner reader = new Scanner(System.in);
	
	System.out.println("What is your name?");
	String name=reader.next();
	System.out.println("your name is "+name);
	
	Scanner a=new Scanner(System.in);
	System.out.println("How old are you");
	int age=a.nextInt();
	System.out.println("your age is "+age);
		
	}

}
