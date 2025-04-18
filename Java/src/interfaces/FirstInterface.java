package interfaces;

public interface FirstInterface
{
	int i=10,j=20;
	void demo();
	default void display()
	{
		System.out.println("FirstInterface display");
	}
	default void show()
	{
		System.out.println("FirstInterface show");
	}
}

