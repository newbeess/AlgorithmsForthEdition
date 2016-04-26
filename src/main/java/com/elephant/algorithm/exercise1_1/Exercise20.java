package com.elephant.algorithm.exercise1_1;

/**
 * Created by elephant on 16/4/26.
 */
public class Exercise20 {
	public static double lg(int N) {
		if (N < 1) System.out.println("N should be greater than one .");
		if (N == 1) return 0;
		else return Math.log(N) + lg(N - 1);
	}

	public static void main(String[] args) {
		System.out.println(lg(10));
	}
}
