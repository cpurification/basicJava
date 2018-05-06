package corejava;

//Constructor is an instance method that usually has the same 
//name as the class and is used a new default value
// Constructor should be non static.

public class Constructor {

	int age;
	int salary;
	int house;
	String name;
	
	Constructor(){
		int age=47;
		int salary=10000;
		int house=7;
		String name="John";
		System.out.println(age);
		System.out.println(salary);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Constructor x=new Constructor();
	System.out.println(x.age);
	}

}
