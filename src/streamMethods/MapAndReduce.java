package streamMethods;

import java.util.Arrays;
import java.util.List;

public class MapAndReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer>list=Arrays.asList(35,4,50,64,90,14,25);
		
		System.out.println(list.stream()
							.filter(i->i%5==0)
							.map(i->i*2)
							.reduce(0,(c,e)->c+e));
	}

}
