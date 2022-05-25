package com.modernJava.lambdaExpression;

public class ConcatenateTraditional implements ConcatenateInterface {

	@Override
	public String concat(String s1, String s2) {
		return s1+s2;
	}

	public static void main(String[] args) {

		ConcatenateTraditional con=new ConcatenateTraditional();
		System.out.println(con.concat("kowlutla", " deepu"));
	}

}
