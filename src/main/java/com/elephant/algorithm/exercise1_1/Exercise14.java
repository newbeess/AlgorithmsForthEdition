package com.elephant.algorithm.exercise1_1;

/**
 * Created by elephant on 16/4/25.
 */
public class Exercise14 {
	static Integer lg(Integer N) {
		int res = 0;
		for (int i = N; i >= 2; i /= 2)
			res++;
		return res;
	}

	public static void main(String[] args) {
		int x = 10;
		System.out.println(lg(x));
	}
}
