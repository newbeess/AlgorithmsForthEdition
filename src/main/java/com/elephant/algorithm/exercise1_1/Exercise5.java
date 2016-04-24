package com.elephant.algorithm.exercise1_1;

import java.util.Random;

import static com.elephant.util.Print.*;

/**
 * Created by elephant on 16/4/24.
 */
public class Exercise5 {
	static boolean betweenZeroAndOne(double x) {
		if (x < 1 && x > 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Random random = new Random(47);
		double x = random.nextDouble();
		double y = random.nextDouble();
		print("x = " + x);
		print("y = " + y);
		if (betweenZeroAndOne(x) && betweenZeroAndOne(y)) {
			print("true");

		}

	}
}
