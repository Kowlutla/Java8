package com.modernJava.lambdaExpression;

public class IncrementBy5Traditional implements IncrementBy5Interface {

	@Override
	public int increment(int a) {
		return a+5;
	}
	
	public static void main(String[] args) {
		
		IncrementBy5Traditional inc=new IncrementBy5Traditional();
		System.out.println(inc.increment(5));
	}

}
