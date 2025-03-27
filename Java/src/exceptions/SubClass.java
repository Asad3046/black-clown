package exceptions;

import java.io.IOException;

public class SubClass extends SuperClass
{
	void display(int i) throws IOException
	{
		System.out.println("Child display");
		super.display(i);
		System.out.println(i);
	}
	public static void main(String[] args)
	{
		SubClass obj = new SubClass();
		try {
			obj.display(0);
		} catch (IOException e) {e.printStackTrace();}
		System.out.println("End of the Main");
	}

}

