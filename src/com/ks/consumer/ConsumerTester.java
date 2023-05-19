package com.ks.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTester {

	public static void main(String[] args) {
		Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());

		List<String> values = Arrays.asList("One", "Two");
		values.forEach(consumer);
		values.forEach(s->System.out.println(s));
		values.forEach(System.out::println);

		List<Integer> intValues = Arrays.asList(1, 2, 3, 4, 5);
		Consumer<List<Integer>> sumListConsumer = SumList::sum;
		sumListConsumer.accept(intValues);
	}

}

class SumList {
	public static void sum(List<Integer> list) {
		int sum = 0;
		for (Integer num : list) {
			sum += num;
		}
		System.out.println(sum);
	}
}
