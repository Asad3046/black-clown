package exceptions;

public class ExcDemo
{
	
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Welcome to the Exception handling");
			int i = 25;
			i = i/0;
			System.out.println(i);
		}catch(Exception e) {System.out.println(e);}
		System.out.println("End of the Main");
	}

}
