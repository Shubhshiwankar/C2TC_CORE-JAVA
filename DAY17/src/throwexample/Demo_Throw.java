package throwexample;

public class Demo_Throw 
{
void validate (int age)
{
	try {
		if (age<18)
			throw new ArithmeticException ("Not eligible");
			else 
				System.out.println ("Eligible");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public static void main(String[] args)
	{
		
		Demo_Throw dt=new Demo_Throw();
		
	    dt.validate (11);
	System.out.println("welcome to C2TC");

}
}
