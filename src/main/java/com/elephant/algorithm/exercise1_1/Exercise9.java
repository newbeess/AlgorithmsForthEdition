package com.elephant.algorithm.exercise1_1;

/**
 * Created by elephant on 16/4/25.
 */
public class Exercise9 {

	public static void main(String[] args) {
		int N = 10;
		String s = "";
		for (int n = N; n > 0; n /= 2)
			s = (n % 2) + s;
		System.out.println(s);
	}
}
