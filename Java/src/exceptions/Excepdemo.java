package exceptions;

public class Excepdemo
{
	int number = 100;
	void divide(int i)
	{
		try {
		System.out.println("divide method");
		number = number/i; //ArithmeticException
		System.out.println(number);   //Vanished code
		System.out.println("Java");   //Vanished code
		} catch (ArithmeticException e) {System.out.println(e);}
	}
	public static void main(String[] args)
	{
		Excepdemo obj = new Excepdemo();
		System.out.println("Main method");
		obj.divide(0);
		System.out.println("End of the Main");
	}
}
