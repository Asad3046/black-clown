package exceptions;

public class ExcepHandle
{
	int i;
	int j;
	
	public ExcepHandle(int i, int j)
	{
		try {
		this.i = i;
		this.j = j/0; //ArithmeticException
		}catch(Exception e) {System.out.println(e);}
	}
	
	void show(int k)
	{
		System.out.println("show");
		try {
		System.out.println(i/k); //ArithmeticException
		System.out.println(j);
		} catch (Exception e) {System.out.println(e);}
	}
	void display()
	{
		System.out.println("display()"); 
		int[] arr = {1, 2, 3}; // or new int[3];
		try {
		System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {System.out.println("Array Index Out Of Bounds!");}
		finally
		{
			System.out.println("this block executes no what.");
		}
	}
	

	public static void main(String[] args)
	{
		ExcepHandle obj = new ExcepHandle(2, 4);
		obj.show(0); 
		obj.display();
		System.out.println("End of the Main");
	}

}
