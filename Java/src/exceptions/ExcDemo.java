package exceptions;

public class ExcDemo
{
	
	public static void main(String[] args)
	{
		try {
			System.out.println("Welcome to the Exception handling");
			int i = 25;
			i = i/0; // ArithmeticException
			System.out.println(i); //vanished code
		} catch (ArithmeticException e) {System.out.println(e);}
		System.out.println("End of the Main");
	}

}
