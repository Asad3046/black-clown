package interfacetwo;

public class BaseClassThree implements FirstInterface, SecondInterface
{

	@Override
	public void demo()
	{
		System.out.println(i);
		System.out.println(j);
	}

	@Override
	public void test()
	{
		
	}

	@Override
	public void show()
	{
		
	}

	public static void main(String[] args)
	{
		BaseClassThree obj=new BaseClassThree();
		obj.demo();
	}

}

