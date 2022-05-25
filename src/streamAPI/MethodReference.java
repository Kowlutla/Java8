package streamAPI;

import java.util.Arrays;
import java.util.List;

//call by method reference using (::)
//Here println is method in out member of Student class

public class MethodReference {

	public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(1,2,3,4,5,6);
		
		System.out.println("Using Lambda Expression: ");
		list.forEach(i->doubleIt(i));
		
		System.out.println("\nMethod reference: ");
		list.forEach(MethodReference::doubleIt);

	}
	
	public static void doubleIt(int i)
	{
		System.out.print(i*2+" ");
	}

}
