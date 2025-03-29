package exceptions;

public class FinallyDemo
{
	int number = 8;
	void demo()
	{
		try {
		System.out.println("demo");
		number = number/0; 			//this exception will not handled by jvm because there one more exception in the finally block
		System.out.println(number); //jvm will handled exception present in the finally block
		}
		finally
		{
			System.out.println("Welcome to finally");
			int j = 99;
			j = j/0;
			System.out.println(j);
			System.out.println("finally ends");
		}
	}
	public static void main(String[] args)
	{
		FinallyDemo obj = new FinallyDemo();
		obj.demo();
	}

}
