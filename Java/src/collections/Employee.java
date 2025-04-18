package collections;

public class Employee implements Comparable<Employee>
{
	int empId;
	String empName;
	int age;
	int salary;
	

	public Employee(int empId, String empName, int age, int salary)
	{
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o)
	{
		if(this.salary>o.salary)
			return 46;
		else if(this.salary<o.salary)
			return -8;
		else
			return 0;
	}

}
