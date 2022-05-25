package com.modernJava.lambdaExpression;

public class HelloWorldLambda {

	public static void main(String[] args) {

		HelloWorldInterface hello=()->{
			return "Hello World Lambda";
			};
		System.out.println(hello.sayHelloWorld());
	}

}
