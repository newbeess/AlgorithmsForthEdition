package com.elephant.algorithm.exercise1_1;

import static com.elephant.util.Print.*;

/**
 * Created by elephant on 16/4/25.
 */
public class Exercise15 {
	static int[] histogram(int[] a, int M) {
		int[] res = new int[M];
		int N = a.length;
		for (int i = 0; i < N; i++)
			if (a[i] < M)
				res[a[i]]++;
		return res;
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 11, 1, 6};
		int[] res = histogram(a, 18);
		print("a.length = " + a.length);
		for (int i = 0; i < a.length; i++)
			printnb(a[i] + "\t");
		print();
		print("res.length = " + res.length);
		for (int i = 0; i < 10; i++)
			printnb(res[i] + "\t");
	}
}
