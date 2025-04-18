package interfaces;

import interfacetwo.FirstInterface;
import interfacetwo.SecondInterface;
public class MyClass implements FirstInterface, SecondInterface
{
	int i=3;
	static int j=9;
	@Override
	public void demo()
	{
		System.out.println("MyClass demo");
		FirstInterface.print();
		SecondInterface.main(null);
	}

	@Override
	public void test()
	{
		System.out.println("MyClass test");
	}
	
	@Override
	public void show()
	{
		System.out.println("MyClass show");
		FirstInterface.super.show();
		SecondInterface.super.show();
		FirstInterface.super.display();
	}

	public static void main(String[] args)
	{
		MyClass obj=new MyClass();
		obj.demo();
		obj.test();
		obj.show();
	}

}

