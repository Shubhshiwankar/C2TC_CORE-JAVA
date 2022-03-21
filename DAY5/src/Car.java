
public class Car {
	//member variable
	//member function,methods
	int noofcars;
	String Model;
	
	void display()
	{
		System.out.println("Welcome to Kia-Motors ");
	}

	void display2()
	{
		System.out.println("Welcome to Benz ");
	}
	
	void display3()
	{
		System.out.println("Welcome to BMW ");
	}
public static void main(String[] args) {
		
		Car obj = new Car();//obj creation
		obj.display();
		obj.display2();
		obj.display3();
		
	}

}