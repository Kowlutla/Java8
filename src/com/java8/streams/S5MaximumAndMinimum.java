/**
 * 
 */
package com.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author KowlutlaSwamy
 *
 */
public class S5MaximumAndMinimum {

	public static void main(String[] args) {
		/**
		 * Given a list of integers, find the maximum and minimum value element
		 * present in it using Stream functions?
		 */
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		System.out.println("Maximum Element using max: ");
		myList.stream().max(Integer::compareTo).ifPresent(System.out::println);
		System.out.println("Maximum Element using min: ");
		myList.stream().min(Comparator.reverseOrder())
				.ifPresent(System.out::println);
		System.out.println("Maximum Element by sorting: ");
		myList.stream().sorted(Comparator.reverseOrder()).findFirst()
				.ifPresent(System.out::println);

		System.out.println("\nMinimum Element using min: ");
		myList.stream().min(Integer::compareTo).ifPresent(System.out::println);
		System.out.println("Minimum Element using max: ");
		myList.stream().max(Comparator.reverseOrder())
				.ifPresent(System.out::println);
		System.out.println("Minimum Element by sorting: ");
		myList.stream().sorted().findFirst().ifPresent(System.out::println);

	}
}
