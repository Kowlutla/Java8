/**
 * 
 */
package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author KowlutlaSwamy
 *
 */
public class S4FirstAndLastElement {

	public static void main(String[] args) {
		/**
		 * Given the list of integers, find the first and last element of the list using
		 * Stream functions?
		 */
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		Optional<Integer> first = myList.stream().findFirst();
		if (first.isPresent()) {
			System.out.println("First Element: " + first.get());
		}

		Optional<Integer> last = myList.stream().sorted((a, b) -> -1)
				.findFirst();
		if (last.isPresent()) {
			System.out.println("Last Element: " + last.get());
		}
	}
}
