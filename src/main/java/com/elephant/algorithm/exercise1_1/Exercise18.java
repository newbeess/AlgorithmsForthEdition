package com.elephant.algorithm.exercise1_1;

/**
 * Created by elephant on 16/4/26.
 */
public class Exercise18 {
	public static int mystery1(int a, int b) {
		if (b == 0) return 0;
		if (b % 2 == 0) return mystery1(a + a, b / 2);
		return mystery1(a + a, b / 2) + a;
	}

	public static int mystery2(int a, int b) {
		if (b == 0) return 0;
		if (b % 2 == 0) return mystery2(a * a, b / 2);
		return mystery2(a * a, b / 2) * a;
	}

	public static void main(String[] args) {
		System.out.println(mystery1(2, 25));
		System.out.println(mystery1(3, 11));
		System.out.println(mystery2(2, 25));
		System.out.println(mystery2(3, 11));
	}
}
