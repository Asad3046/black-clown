package interfaces;

public class SuperClass
{
	int i,j;

	public SuperClass()
	{
		super();
	}

	public SuperClass(int i, int j)
	{
		super();
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString()
	{
		return "SuperClass [i=" + i + ", j=" + j + "]";
	}
	
	public void show()
	{
		System.out.println("SuperClass show");
	}
}

