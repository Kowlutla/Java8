package forEachMethod;

import java.util.Arrays;
import java.util.List;

public class ForEachMethod {

	public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(3,4,5,6,7,8,9);
		
		System.out.println("Using for loop: ");
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println("\nUsing Enhanced for loop: ");
		for(int i:list)
		{
			System.out.print(i+" ");	
		}
		
		System.out.println("\nFor each method: ");
		list.forEach(i->System.out.print(i+" ")); //consumer interface implementation using lambda expression
	
		

	}

	
}
