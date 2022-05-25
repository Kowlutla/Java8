package com.modernJava.lambdaExpression;

public class HelloWorldTraditional implements HelloWorldInterface {

	@Override
	public String sayHelloWorld() {
		return "Hello World Traditional";
	}

	public static void main(String[] args) {

		HelloWorldTraditional hwt=new HelloWorldTraditional();
		System.out.println(hwt.sayHelloWorld());
	}

}
