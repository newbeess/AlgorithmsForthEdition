package com.elephant.algorithm.exercise1_1;

import static com.elephant.util.Print.*;

/**
 * Created by elephant on 16/4/24.
 */
public class Exercise7 {
	static void f() {
		double t = 9.0;
		while (Math.abs(t - 9.0 / t) > .001) {
			t = (9.0 / t + t) / 2.0;
			System.out.printf("%.5f\n", t);
		}
	}

	static void g() {
		int sum = 0;
		for (int i = 0; i < 1000; i++)
			for (int j = 0; j < i; j++)
				sum++;
		System.out.println(sum);
	}

	static void h() {
		int sum1 = 0;
		for (int i = 0; i < 1000; i *= 2)
			for (int j = 0; j < 1000; j++)
				sum1++;
		System.out.println(",,"+sum1);
	}

	public static void main(String[] args) {
		f();
		g();
		h();
	}
}
