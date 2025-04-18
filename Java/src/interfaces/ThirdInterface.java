package interfaces;

public interface ThirdInterface
{
	void test(); // by default abstract methods are 'public'
	default void display()
	{
		System.out.println("ThirdInterface display");
	}
}

