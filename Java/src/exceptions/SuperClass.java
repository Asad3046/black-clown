package exceptions;

import java.io.IOException;

public class SuperClass
{
	int number = 120;
	void display(int i) throws IOException
	{
		System.out.println("Parent display");
		if(i==0)
		{
			throw new IOException("Passed argument cannot be zero");
		}
		else
		{
			number = number/i;
			System.out.println(number);
		}
	}
	public static void main(String[] args)
	{
		SuperClass obj = new SuperClass();
		try {
			obj.display(0);
		} catch (IOException e) {e.printStackTrace();}
		System.out.println("End of the Main");
	}

}
