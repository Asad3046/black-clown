package interfaces;

public class SubClass extends SuperClass implements FirstInterface, SecondInterface
{
	
	@Override
	public void test()
	{
		System.out.println("SubClass test");
	}

	@Override
	public void demo()
	{
		System.out.println("SubClass demo");
	}
	
	public void show()
	{
		System.out.println("SubClass show");
		FirstInterface.super.show();	
		SecondInterface.super.show();
		super.show();
		FirstInterface.super.display();
		
	}

	public static void main(String[] args)
	{
		FirstInterface obj=new SubClass();
		obj.show();
		obj.display();
		obj.demo();
//		obj.test(); //we can't invoke 'test()' because it is coming from 'SecondInterface' not FirstInterface
	}

}
