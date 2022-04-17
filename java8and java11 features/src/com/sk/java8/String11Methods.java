package com.sk.java8;

import java.util.List;
import java.util.stream.Collectors;

public class String11Methods {
    
	public static void main(String[] args) {
		
		String str="lhjfjkghjkg";
		System.out.println(str.isBlank());
		List<String> collect = str.lines().collect(Collectors.toList());
		collect.stream().forEach(System.out::println);
	}
}
