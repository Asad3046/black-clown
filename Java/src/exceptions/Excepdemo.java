package exceptions;

public class Excepdemo
{
	int number;
	int quotient = 100;
	void divide(int number)
	{
		try 
		{
		System.out.println("divide");
		quotient = quotient/number;
		System.out.println(quotient);
		System.out.println("Java");
		}catch(Exception e) {System.out.println(e);}
	}
	public static void main(String[] args)
	{
		Excepdemo obj = new Excepdemo();
		System.out.println("Main method");
		obj.divide(0);
		System.out.println("End of the Main");
	}
}
