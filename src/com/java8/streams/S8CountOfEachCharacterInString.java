/**
 * 
 */
package com.java8.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author KowlutlaSwamy
 *
 */
public class S8CountOfEachCharacterInString {
	public static void main(String[] args) {
		String s = "kowlutla is a good person";
		Map<String, Long> collect = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(),
						TreeMap::new, Collectors.counting()));
		System.out.println(collect);
		Map<Long, String> collect2 = collect.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey, (o, n) -> n));
		System.out.println(collect2);
	}
}
