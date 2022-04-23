package PACK14;

public class Demo_Wrap {

	public static void main(String[] args) {
		
		int i=30;
		Integer a=i;
		@SuppressWarnings("removal")
		Integer j=new Integer(15);
		System.out.println(a+" "+i+" "+j);
		//System.out.println(+a);
		//System.out.println(+j);	
		//System.out.println(+i);
	}

}
