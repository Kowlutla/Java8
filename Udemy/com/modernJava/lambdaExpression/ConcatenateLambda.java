package com.modernJava.lambdaExpression;

public class ConcatenateLambda {

	public static void main(String[] args) {

		ConcatenateInterface con=(s1,s2)->s1+s2;
		System.out.println(con.concat("kowlutla", " deepu"));
	}

}
