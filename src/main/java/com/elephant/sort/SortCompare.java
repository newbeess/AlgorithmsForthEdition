package com.elephant.sort;

import com.elephant.sort.Insertion;
import com.elephant.sort.Selection;

import java.util.Random;

/**
 * Created by elephant on 16/5/30.
 */
public class SortCompare {
	public static double time(String method, Comparable[] a) {
		long startTime = System.currentTimeMillis();
		if (method.equals("Insertion"))
			new Insertion().sort(a);
		if (method.equals("Selection"))
			new Selection().sort(a);

		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

	public static double timeRandomInput(String method, int N, int T) {
		double total = 0.0;
		Random random = new Random(47);
		Double[] a = new Double[N];
		for (int t = 0; t < T; t++) {
			// 进行一次测试，(生成一个数组并排序)
			for (int n = 0; n < N; n++) {
				a[n] = random.nextDouble();
			}
			total += time(method, a);
		}
		return total;
	}

	public static void main(String[] args) {
		// 指定数组长度
		int N = 100;
		// 指定排序次数
		int T = 10;
		double t1 = timeRandomInput("Selection", N, T);
		double t2 = timeRandomInput("Insertion", N, T);
		System.out.println("数组长度为" + N + "的情况下：");
		System.out.println("Selection排序" + T + "次，平均时间为：" + t1 / T + "秒");
		System.out.println("Insertion排序" + T + "次，平均时间为：" + t2 / T + "秒");
	}
}
