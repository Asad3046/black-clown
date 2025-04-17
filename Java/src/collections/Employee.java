package collections;

public class Employee
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
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", salary=" + salary + "]";
	}



	public static void main(String[] args)
	{
		
	}

}
