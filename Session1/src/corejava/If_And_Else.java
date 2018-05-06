package corejava;

public class If_And_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int i=300;
	int j=300;
	int a=300;
	
	// Operators in Java <, >, =, <=, >=, !
	
	if (i<j) // condition
		System.out.println("i is less than j");
	else
		System.out.println("i is not less than j");
	
	if (i<a)
		System.out.println("i is less than a");
	else
		System.out.println("i is not less than a");
		
	if (j==a)
		System.out.println("Value of i and a are same");
	else
		System.out.println("Value of i and a are not the same");
	
	
	if (j!=a)
	{
		System.out.println("J is greater than a");
	}
	
	else
	{
		System.out.println("J is not greater than a");
	}
	
	System.out.println(j);
	}

}
