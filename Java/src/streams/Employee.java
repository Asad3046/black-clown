package streams;

import java.io.Serializable;

public class Employee implements Serializable
{
	int empId;
	String empName;
	int age, salary;
	
	public Employee()
	{
		
	}

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
	
	void show()
	{
		salary = salary + (salary * 10)/100;
		System.out.println(salary);
	}
	
	
	
	
	
	
	
}
