package com.modernJava.lambdaExpression;

public class IncrementBy5Lambda {

	public static void main(String[] args) {

		IncrementBy5Interface inc=(a)->a+5;
		
		System.out.println(inc.increment(5));
	}

}
