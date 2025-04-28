package methodreference;

public class MyClass
{
	
	public static void main(String[] args)
	{
		FirstInterface obj = (m) -> { return m*10; };
		System.out.println(obj.show(5));
		
	}

}
