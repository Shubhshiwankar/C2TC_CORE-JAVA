package lambdaexpression;


import java.util.LinkedList;

public class Lambdaforeach {

	public static void main(String[] args) 
	{
	LinkedList<String> ll=new LinkedList<String>();
	ll.add("shubhangi");
	ll.add("mayuri");
	ll.add("janhavi");
	ll.add("nikhat");
	ll.forEach((n)->{System.out.println(n);});
	

	}

}