package methodreference;

public interface FirstInterface
{
	int show(int i);
	
	default void display()
	{
		System.out.println("display");
	}
	
}
