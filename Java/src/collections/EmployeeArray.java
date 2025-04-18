package collections;

import java.util.ArrayList;

public class EmployeeArray
{

	public static void main(String[] args)
	{
		Employee e1 = new Employee(46, "Asad", 24, 80000);
		Employee e2 = new Employee(47, "Hamza", 23, 30000);
		Employee e3 = new Employee(48, "Abdul Wahid", 20, 25000);
		Employee e4 = new Employee(49, "Mabroor", 22, 20000);
		
		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		for(Employee e : al)
			System.out.println(e);
		
		
		
	}

}
