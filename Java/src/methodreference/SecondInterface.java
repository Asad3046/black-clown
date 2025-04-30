package methodreference;

public interface SecondInterface
{
	Object display(int i, String name);
	default void show()
	{
		System.out.println("show method");
	}
}
