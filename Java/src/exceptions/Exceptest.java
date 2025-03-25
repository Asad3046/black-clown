package exceptions;

public class Exceptest
{
	int[] i= new int[5]; //creates an array of size 5
	void test()
	{
		try
		{
		i[5] = 12/0;
		}catch (Exception e){System.out.println(e);}
	}
	public static void main(String[] args)
	{
		Exceptest obj = new Exceptest();
		System.out.println("Main method");
		obj.test();
	}

}
