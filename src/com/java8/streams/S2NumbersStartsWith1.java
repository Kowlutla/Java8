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
public class S2NumbersStartsWith1 {

	public static void main(String[] args) {
		/**
		 * Given a list of integers, find out all the numbers starting with 1
		 * using Stream functions?
		 */

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		List<Integer> startsWithOne = myList.stream().map(num -> "" + num)
				.filter(s -> s.charAt(0) == '1').map(Integer::valueOf)
				.collect(Collectors.toList());

		System.out.println("Numbers Starting with 1: " + startsWithOne);
	}

}
