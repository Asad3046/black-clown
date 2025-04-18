package interfaces;

public interface SecondInterface
{
	void test();
	default void show()
	{
		System.out.println("SecondInterface show");
	}
}

