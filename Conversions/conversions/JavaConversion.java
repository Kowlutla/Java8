package conversions;

import java.util.Arrays;

public class JavaConversion {
	
	public static void main(String args[])
	{
		char[] chars = new char[] {'\u0097'};
        String str = new String(chars);
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));


//Read more: https://www.java67.com/2012/09/top-10-tricky-java-interview-questions-answers.html#ixzz6HIss8BNc

	}

}
