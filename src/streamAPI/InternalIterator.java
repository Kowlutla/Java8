package streamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class InternalIterator {

	public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(1,2,3,4,5,6);
		
		//External Iterator
		System.out.println("Normal for loop: ");
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println("\nUsing iterator: ");
		Iterator<Integer>iter=list.listIterator();
		while(iter.hasNext())
		{
			System.out.print(iter.next()+" ");
		}
		
		System.out.println("\nEnhanced For loop: ");
		for(int i:list)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\nWhile loop: ");
		int k=0;
		while(k<list.size())
		{
			System.out.print(list.get(k++)+" ");
		}
		
		
		//INTERNAL ITERATOR
		System.out.println("\nForEach Method: ");
		list.forEach(i->System.out.print(i+" "));

	}

}
