package interfacetwo;

public interface FirstInterface
{
	int i=46; // 'i' is by default consider as public static final
	
	//concrete method
	default void show()
	{
		System.out.println("FirstInterface show");
	}
	
	//concrete method
	default void display()
	{
		System.out.println("FirstInterface display");
	}
	
	//abstract method
	void demo(); // by default abstract methods are 'public'
	void test();
	
	//static method
	static void print()
	{
		System.out.println("FirstInterface static");
	}
}

