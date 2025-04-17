package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo
{

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(48); //this is not int type it is an integer Object
		al.add(63.45f); // float
		al.add(542.45789); //double
		al.add("Asad"); //String
		al.add(true);
		
		//Treversing or Iterating the elements
		Iterator itr = al.iterator(); 
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
