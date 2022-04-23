package javacollection2;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoArrayList2 {
	public static void main(String[] args)
	{
		
	ArrayList<String> al=new ArrayList<String>();
	al.add("shubhangi");
	al.add("mayuri");
	al.add("janhavi");
	al.add("nishada");
	
	System.out.println(al);
	
	al.set(2, "tns");
	System.out.println(al);
	
	al.add(2,"mohit");
	System.out.println(al);
	
	al.remove(1);
	System.out.println(al);
	
	System.out.println("forloop");
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i));
	}
	
	System.out.println("Advance forloop");
	for(String str:al)
		System.out.println(str);
	
	
	System.out.println ("while loop");
	int count=0;
	while(al.size()>count)
	{
		System.out.println(al.get(count));
		count++;
	}
	
	System.out.println("Iterator");
	Iterator<String> it=al.iterator();
	while(it.hasNext())
		{
			System.out.println(it.next());
		}

	} 
	

}