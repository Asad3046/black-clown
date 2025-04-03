package multithreading;

public class ThreadDemo extends Thread
{
	String str;
	ThreadDemo(String str)
	{
		super(str);
	}

	@Override
	public void run()
	{
		System.out.println("run method " + Thread.currentThread().getName());
		for(int i = 65; i <= 69; i++)
		{
			System.out.println((char)i+ " "+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args)
	{
		Thread t1 = new ThreadDemo("Second");
		Thread t2 = new ThreadDemo("First");
		t1.start();
		t2.start();
		try {
			Thread.sleep(2000); //wait for '2000' milli seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("welcome to main");
	}

}
