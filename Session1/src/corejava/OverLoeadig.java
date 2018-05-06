package corejava;

public class OverLoeadig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		numbers(7);
		numbers(5.6);
		addtion(10,5);
		addtion(10,5,4);
		addtion(10,5,4,3);
	}

public static void numbers (int a) {
	
	System.out.println(a);
}
	
public static void numbers(double a) {
	
	System.out.println(a);

}
public static void addtion(int a, int b) {
	
	int add=a+b;
	System.out.println(add);
}
public static void addtion(int a, int b, int c) {
	
	int add=a+b+c;
	System.out.println(add);
}

public static void addtion(int a, int b, int c, int d) {
	
	int add=a+b+c+d;
	System.out.println(add);
}

}
