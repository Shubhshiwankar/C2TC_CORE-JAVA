package sync;

class Count
{
	int Count;
	
public void increment()
{
     Count++;
}
public class sync {

	public static void main(String[] args) 
			throws Exception {
		// TODO Auto-generated method stub
		Count c=new Count();
		Thread t= new Thread(new Runnable()
				{
			public void run()
			{
				for (int i=1; i<=1000;i++)
				{
					c.increment();
				}
			}
				});

		System.out.println("count id"+c.Count);

	}
	}
}
