/**
 * 
 */
package com.java8.streams;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author KowlutlaSwamy
 *
 */
public class S7FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		/**
		 * Given a String, find the first non-repeated character in it using
		 * Stream functions?
		 */

		String input = "Java articles are Awesome";
		Optional<Character> firstNonRepeated = input.chars()
				.mapToObj(c -> (char) c).filter(c -> ' ' != c)
				.collect(Collectors.groupingBy(Function.identity(),
						LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1).findFirst()
				.map(e -> e.getKey());

		if (firstNonRepeated.isPresent()) {
			System.out.println(
					"First Non Repeated character: " + firstNonRepeated.get());
		} else {
			System.out.println("All are duplicated characters");
		}
	}

}