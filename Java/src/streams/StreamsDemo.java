package streams;

import java.io.*;
import java.util.ArrayList;

public class StreamsDemo
{
	
	public static void main(String[] args)
	{
		ProjectManager pm1 = new ProjectManager("Digital India", 14);
		ProjectManager pm2 = new ProjectManager("Car Rental System", 3);
		ArrayList<Employee> al = new ArrayList<>();
		al.add(pm1);
		al.add(pm2);
		try
		{
			FileOutputStream fout = new FileOutputStream("NewFile.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(al);
			System.out.println("successfully serialized");
			FileInputStream fin = new FileInputStream("NewFile.txt");
			ObjectInputStream ois = new ObjectInputStream(fin);
			ArrayList<Employee> e = (ArrayList)ois.readObject();
			for(Employee emp : e)
			System.out.println(emp);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
