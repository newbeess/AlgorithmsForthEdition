package com.elephant.algorithm.exercise1_1;

/**
 * Created by elephant on 16/4/27.
 */
public class Exercise27 {
	static int depth = 1;

	public static double binomial1(int N, int k, double p) {
		System.out.println("递归深度为： " + depth++);
		if (N == 0 && k == 0) return 1.0;
		if (N < 0 || k < 0) return 0.0;
		return (1.0 - p) * binomial1(N - 1, k, p) + p * binomial1(N - 1, k - 1, p);
	}

	public static double binomial2(int N, int K, double p) {
		double[][] matrix = new double[N + 1][K + 1];

		matrix[0][0] = 1.0;
		for (int i = 1; i < N; i++)
			matrix[i][0] = (1.0 - p) * matrix[i - 1][0];
		for (int j = 1; j < K; j++)
			matrix[0][j] = 0.0;

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= K; j++) {
				matrix[i][j] = (1.0 - p) * matrix[i - 1][j] + p * matrix[i - 1][j - 1];
			}
		}
		return matrix[N][K];
	}

	public static void main(String[] args) {
		//System.out.println(binomial1(2, 1, 0.25));
		System.out.println(binomial2(100, 50, 0.25));
	}
}
