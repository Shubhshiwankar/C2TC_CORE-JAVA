package javacollection2;

import java.util.ArrayList;

public class DemoArryLlist {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("shubhangi");
		al.add("mayuri");
		al.add("janhavi");
		al.add("mohit");
		System.out.println(al);
		al.set(2, "tns");
		System.out.println(al);
		al.add(2,"nishada");
		System.out.println(al);
		al.remove("tns");
		
	}

}