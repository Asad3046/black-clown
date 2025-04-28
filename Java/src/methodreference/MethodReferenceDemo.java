package methodreference;

public class MethodReferenceDemo
{
	static int demo(int x)
	{
		System.out.println("demo");
		return x*5;
	}
	
	static int test(int y)
	{
		System.out.println("test");
		return y*6;
	}
	
	int first(int z)
	{
		System.out.println("instance first");
		return z*10;
	}
	public static void main(String[] args)
	{
		FirstInterface obj1 = MethodReferenceDemo :: demo;
		int result1 = obj1.show(9);
		System.out.println(result1);
		
		FirstInterface obj2 = MethodReferenceDemo :: test;
		int result2 = obj2.show(9);
		System.out.println(result2);
		
		MethodReferenceDemo obj = new MethodReferenceDemo();
		FirstInterface obj3 = obj :: first;
		int result3 = obj3.show(10);
		System.out.println(result3);
	
	}

}
