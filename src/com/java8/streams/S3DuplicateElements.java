/**
 * 
 */
package com.java8.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author KowlutlaSwamy
 *
 */
public class S3DuplicateElements {

	public static void main(String[] args) {

		/**
		 * How to find duplicate elements in a given integers list in java using
		 * Stream functions?
		 */

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		Set<Integer> set = new HashSet<>();
		List<Integer> duplicateNumbers = myList.stream()
				.filter(num -> !set.add(num)).collect(Collectors.toList());
		System.out.println("Duplicate numbers: " + duplicateNumbers);
	}
}
