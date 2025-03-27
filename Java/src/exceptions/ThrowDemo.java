package exceptions;

public class ThrowDemo
{
	int number = 100;
	void show(int i) throws ArithmeticException
	{
		System.out.println("show method");
		if(i==0)
		{
			throw new ArithmeticException("passed argument can't be zero");
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
			} catch (ArithmeticException e) {e.printStackTrace();}
	}

}
