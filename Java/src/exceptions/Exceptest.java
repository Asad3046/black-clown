package exceptions;

public class Exceptest
{
	int[] i= new int[5]; //creates an array of size 5
	void test()
	{
		try {
			System.out.println("test method");
			i[5] = 12/0; //ArithmeticException
			System.out.println(i[5]); //Vanished code
		} catch (ArithmeticException e1) {System.out.println(e1);}
	}
	public static void main(String[] args)
	{
		Exceptest obj = new Exceptest();
		System.out.println("Main method");
		obj.test();
		System.out.println("End of the Main");
	}

}
