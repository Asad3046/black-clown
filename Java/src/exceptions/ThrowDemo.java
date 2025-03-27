package exceptions;

public class ThrowDemo
{
	int number = 100;
	void show(int i)
	{
		System.out.println("show method");
		if(i==0)
		{
			throw new ArithmeticException("passed argument can't be zero"); //raised an ArithmeticException with a message
		}
		else
		{
			number = number/i;
			System.out.println(number);
		}
		
	}
	public static void main(String[] args)
	{
		ThrowDemo obj = new ThrowDemo();
			try {
				obj.show(0);
			} catch (ArithmeticException e) {System.out.println(e);}
			System.out.println("End of the Main");
	}

}
