package interfacetwo;

public interface SecondInterface
{
	int j=56; // 'j' is by default consider as public static final
	
	//concrete method
	default void show()
	{
		System.out.println("SecondInterface show");
	}
	
	//abstract method
	void test();
	
	//main method
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		System.out.println(j);
	}
}

