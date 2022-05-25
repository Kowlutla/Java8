package consumerInterface;

import java.util.List;
import java.util.Arrays;

public class ConsumerInterface {

	public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(1,2,3,4,5);
		
		
//		list.forEach(i->System.out.print(i+" ")); -->Lambda expression
		
		
		//UNANIMOUS INNER CLASS
//		Consumer<Integer>c=new Consumer<Integer>()
//				{
//					public void accept(Integer i)
//					{
//						System.out.print(i+" ");
//					}
//				};
		
		
		
//		Consumer<Integer> c=(Integer i)->
//		{
//			System.out.print(i+" ");
//		};
		
		//ABOVE IMPLEMENTATION CAN BE WRITTEN AS
		
//		Consumer<Integer> c=i->System.out.print(i+" ");
//		list.forEach(c);
		
		//ABOVE LINE CODE CAN BE WRITTEN AS replacing c
		
		list.forEach(i->System.out.print(i+" "));
		
		
		
		
		
		 

	}

}

//class ConsImpl implements Consumer<Integer>
//{
//	public void accept(Integer i)
//	{
//		System.out.print(i+" ");
//	}
//
//	
//}
