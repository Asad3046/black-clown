package multithreading;

public class ThreadOne extends Thread
{
	String str;
	ThreadOne(String str)
	{
		super(str);
	}
	public void run()
	{
		System.out.println("Thread is running..."+Thread.currentThread().getName());
		for(int i = 5; i >= 1; i--)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args)
	{
		ThreadOne obj1 = new ThreadOne("First");
		ThreadOne obj2 = new ThreadOne("Second");
		obj1.start();
		obj2.start();
		
	}

}
