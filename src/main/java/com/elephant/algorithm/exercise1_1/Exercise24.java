package com.elephant.algorithm.exercise1_1;

/**
 * Created by elephant on 16/4/27.
 */
public class Exercise24 {
	// 假设 p > q
	public static int Euclid(int p, int q, int depth) {
		System.out.println("第 " + depth + " 次辗转相除, p=" + p + ", q=" + q);
		depth++;
		if (q == 0)
			return p;
		int r = p % q;
		return Euclid(q, r, depth);
	}

	public static void main(String[] args) {
		int p = 1234567,
				q = 1111111;
		int res = Euclid(p, q, 1);
		System.out.println(p + "，" + q + " 的最大公约数为：" + res);
	}
}
