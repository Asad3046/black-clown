package nestedclasses;

public class OuterClass
{
	void show()
	{
		System.out.println("OuterClass show");
	}
	
	void demo()
	{
		System.out.println("OuterClass demo");
	}
	
	class InnerClass
	{
		void display()
		{
			System.out.println("InnerClass display");
		}
		
		void test()
		{
			System.out.println("InnerClass test");
		}
	}
	
	public static void main(String[] args)
	{
		OuterClass obj=new OuterClass();
		obj.demo();
		obj.show();
	}

}
