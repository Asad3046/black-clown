package multithreading;

public class ThreadTwo implements Runnable
{
	
	@Override
	public void run()
	{
		System.out.println("Thread is runnig..."+Thread.currentThread().getName());
		for(int i = 1; i<=5; i++)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args)
	{
		ThreadTwo obj = new ThreadTwo();
		Thread t1 = new Thread(obj, "First");
		Thread t2 = new Thread(obj, "Second");
		
		t1.start();
		t2.start();
		
		System.out.println("Back to Main");
		
	}

}
