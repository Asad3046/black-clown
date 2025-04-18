package interfacetwo;

public class BaseClassTwo implements FirstInterface, SecondInterface
{
	int i=100; //non-static variable can be accessed in a non-static method and with an object in a static method
	static int j=200; //static variable can be accessed in both methods(non-static and static)
	
	@Override
	public void demo()
	{
		System.out.println("BaseClassTwo demo");
		FirstInterface.print(); //calling an static method 'print' available in 'FirstInterface'
		SecondInterface.main(null); //calling 'main' method available in 'SecondInterface'
	}

	@Override
	public void test()
	{
		System.out.println("BaseClassTwo test");
	}

	@Override
	public void show()
	{
		System.out.println("BaseClassTwo show");
		System.out.println(i);
		i=FirstInterface.i+SecondInterface.j+i;
		System.out.println(i);
		
	}

	public static void main(String[] args)
	{
		System.out.println("main method");
		BaseClassTwo obj=new BaseClassTwo();
		System.out.println(obj.i); //100
		System.out.println(j);	   //200
		System.out.println(FirstInterface.i); //46
		System.out.println(SecondInterface.j);//56
		obj.demo();
		obj.show();
	}
}

