package com.modernJava.lambdaExpression;

public class RunnableExample {

	public static void main(String[] args) {

		Runnable r = new Runnable() {
			public void run() {
				int sum = 0;
				for (int i = 1; i <= 10; i++) {
					sum += i;
				}
				System.out.println("Sum Traditional: " + sum);
			}
		};
		new Thread(r).start();
		System.out.println();
		// Using lambda
		Runnable r1 = () -> {
			int sum = 0;
			for (int i = 1; i <= 10; i++) {
				sum += i;
			}
			System.out.println("Runnable Lambda: " + sum);
		};
		new Thread(r1).start();

		// More Simpler way
		new Thread(() -> {
			int sum = 0;
			for (int i = 1; i <= 10; i++) {
				sum += i;
			}
			System.out.println("Thread Lambda: " + sum);
		}).start();
	}

}
