package com.elephant.algorithm.exercise1_1;

/**
 * Created by elephant on 16/4/26.
 */
public class Fibonacci {
	public static long F(int N) {
		if (N == 0) return 0;
		if (N == 1) return 1;
		return F(N - 1) + F(N - 2);
	}

	public static long F1(int N) {
		if (N == 0) return 0;
		if (N == 1) return 1;
		long[] res = new long[N + 1];
		res[0] = 0;
		res[1] = 1;
		for (int i = 2; i < N + 1; i++)
			res[i] = res[i - 1] + res[i - 2];
		return res[N];
	}

	public static void main(String[] args) {
		for (int N = 0; N < 100; N++)
			System.out.println(N + " " + F1(N));
	}
}
