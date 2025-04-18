package interfacetwo;

public class BaseClass implements FirstInterface, SecondInterface
{	
	@Override
	public void demo()
	{
		System.out.println("BaseClass demo");
	}

	@Override
	public void test()
	{
		System.out.println("BaseClass test");
	}
	
	@Override
	public void show()
	{
		System.out.println("BaseClass show");
		FirstInterface.super.show();
		SecondInterface.super.show();
		FirstInterface.super.display();
	}
	
	public static void main(String[] args)
	{
		BaseClass obj1=new BaseClass();
		FirstInterface obj2=new BaseClass(); //dynamic polymorphism
		SecondInterface obj3=new BaseClass();//dynamic polymorphism
		obj1.show();
		obj1.demo();
		obj1.test();
		obj1.display();
		obj2.show();
		obj2.demo();
		obj2.test();
		obj2.display();
		obj3.show();
//		obj3.demo(); //we can't access 'demo' with the object of 'BaseClass' of reference SecondInterface because demo has been defined in FirstInterface
		obj3.test();
//		obj3.display(); //we can't access 'display' with the .......
	}
}

