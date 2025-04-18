package interfaces;

public class Demo implements FourthInterface
{
	
	public void test()
	{
		System.out.println("Demo test");
		FourthInterface.super.test();
//		ThirdInterface.super.display(); //we can't do this because you can't jump 2 steps
	}

	@Override
	public void show()
	{
		System.out.println("Demo show");
	}
	
	public static void main(String[] args)
	{
		FourthInterface obj=new Demo();
		obj.test();
		obj.display();
		obj.show();
	}

}

