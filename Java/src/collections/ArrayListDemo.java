package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo
{

	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> alOne = new ArrayList<>();
		
		al.add(87);
		al.add(25);
		al.add(null);
		al.add(46);
		al.add(69);
		al.add(-549);
		
		alOne.add(1);
		alOne.add(2);
		alOne.add(3);
		alOne.add(4);
		
		al.addAll(2, alOne);
		Object[] arr = al.toArray();
		int value;
		
		for(Object arrO : arr)
		{
			Integer num = (Integer)arrO;
			value = num.intValue(); //
			value = value + 100;
			System.out.println(value);
		}
		
//		ListIterator<Integer> listitr = al.listIterator();
//		while(listitr.hasNext())
//		{
//			System.out.println(listitr.next());
//		}
//		System.out.println(al.size());
	}

}
