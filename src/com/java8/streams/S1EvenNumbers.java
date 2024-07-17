/**
 * 
 */
package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author KowlutlaSwamy
 *
 */
public class S1EvenNumbers {

	public static void main(String[] args) {
		/**
		 * Given a list of integers, find out all the even numbers that exist in
		 * the list using Stream functions?
		 */
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		List<Integer> evenNumbers = list.stream().filter(num -> num % 2 == 0)
				.collect(Collectors.toList());
		System.out.println("Even Numbers: " + evenNumbers);
	}
}
