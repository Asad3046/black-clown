package methodreference;

public class Employee
{
	String name;
	int age;
	public Employee(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void display()
	{
		System.out.println(name + " - " + age);
	}
}
