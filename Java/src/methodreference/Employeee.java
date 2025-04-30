package methodreference;

public class Employeee
{
	int empId;
	String name;
	
	public Employeee()
	{
		System.out.println("Employeee()");
	}
	
	public Employeee(int empId, String name)
	{
		System.out.println("Employee(int, String)");
		this.empId = empId;
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Employeee [empId=" + empId + ", name=" + name + "]";
	}

	public static void main(String[] args)
	{
		SecondInterface obj = Employeee::new;
		obj.display(46, "Asad");
	}
	
	
	
	
	
}
