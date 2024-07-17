/**
 * 
 */
package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author KowlutlaSwamy
 *
 */
public class S6EvenOddNumbers {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		Map<Boolean, List<Integer>> collect = myList.stream()
				.collect(Collectors.partitioningBy(num -> num % 2 == 0));
		System.out.println("Evens: " + collect.get(true));
		System.out.println("Odd: " + collect.get(false));
	}
}
