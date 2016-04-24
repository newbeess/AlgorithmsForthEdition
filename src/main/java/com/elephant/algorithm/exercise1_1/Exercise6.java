package com.elephant.algorithm.exercise1_1;

import static com.elephant.util.Print.*;

/**
 * Fabnacci
 */
public class Exercise6 {
	public static void main(String[] args) {
		int f = 0;
		int g = 1;
		for (int i = 0; i <= 15; i++) {
			print(f);
			f = f + g;
			g = f - g;
		}
	}
}
